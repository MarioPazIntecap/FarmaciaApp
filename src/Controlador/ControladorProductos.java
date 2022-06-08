package Controlador;

import Conector.Conector;
import Conector.SQL;
import Modelo.ModeloProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ControladorProductos implements ActionListener, FocusListener{
    ModeloProductos modelo;
    PreparedStatement ps;
    ResultSet resultado;
    Conector conector = new Conector();
    SQL sql = new SQL();

    public ControladorProductos() {
    }

    public ControladorProductos(ModeloProductos modelo) {
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(modelo.getVista().btnAgregarProductoV.getActionCommand())){
            if(Integer.parseInt(modelo.getVista().txtCantidadV.getText()) <= Integer.parseInt(modelo.getVista().lblDisponibleV.getText().substring(12))){
                modelo.getVista().tblDatosV.setModel(agregarProductos());
                modelo.getVista().lblTotalV.setText(generarTotal());
                validarBotonGuardar();
            }else{
                conector.mensaje("La cantidad sobrepasa la existente. Favor de validar", "Error al agregar producto", 0);
            }
            
        }else if(e.getActionCommand().equals(modelo.getVista().btnGuardarDatosV.getActionCommand())){
            guardarEncabezado();
        }
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(e.getComponent().equals(modelo.getVista().txtAgregarProductoV)){
            modelo.getVista().lblDisponibleV.setText("Disponible: "+validarExistencias());
        }else if(e.getComponent().equals(modelo.getVista().txtNitV)){
            modelo.getVista().lblClienteV.setText(validarCliente());
            validarBotonGuardar();
        }
    }

    public String validarCliente(){
        String cliente ="";
        try {
            ps = conector.preparar(sql.getValidarCliente());
            ps.setString(1, modelo.getVista().txtNitV.getText());
            resultado = ps.executeQuery();
            while(resultado.next()){
                cliente = resultado.getString("nombre") + " " + resultado.getString("apellido");
            }
            conector.desconectar();
        } catch (SQLException ex) {
            conector.desconectar();
        }
        return cliente;
    }
    
    public DefaultTableModel agregarProductos(){
        int cantidad = Integer.parseInt(modelo.getVista().txtCantidadV.getText());
        DefaultTableModel modeloTabla = (DefaultTableModel) modelo.getVista().tblDatosV.getModel();
        modeloTabla.setColumnIdentifiers(new Object[]{"Codigo","Nombre","Precio Venta","Cantidad","Total"});
        try {
            ps = conector.preparar(sql.getValidarProducto());
            ps.setString(1, modelo.getVista().txtAgregarProductoV.getText());
            resultado = ps.executeQuery();
            while(resultado.next()){
                modeloTabla.addRow(new Object[]{
                    resultado.getString("codigo"),
                    resultado.getString("nombre"),
                    resultado.getString("precioVenta"),
                    String.valueOf(cantidad),
                    cantidad*Double.parseDouble(resultado.getString("precioVenta"))});
            }
            conector.desconectar();
        } catch (SQLException ex) {
            conector.desconectar();
        }
        return modeloTabla;
    }
    
    public String validarExistencias(){
        String cantidad = "";
        try {
            ps = conector.preparar(sql.getValidarExistencias());
            ps.setString(1, modelo.getVista().txtAgregarProductoV.getText());
            resultado = ps.executeQuery();
            while(resultado.next()){
                cantidad = resultado.getString("cantidad");
            }
            conector.desconectar();
        } catch (SQLException ex) {
            conector.desconectar();
        }
        return cantidad;
    }

    public String generarTotal(){
        DefaultTableModel modeloTabla = (DefaultTableModel) modelo.getVista().tblDatosV.getModel();
        double resultado = 0.00;
        for(int i = 0; i < modeloTabla.getRowCount(); i++){
            resultado += Double.parseDouble(modeloTabla.getValueAt(i, 4).toString());
        }
        return "Total: Q" + String.valueOf(resultado);
    }
    
    public void validarBotonGuardar(){
        System.out.println(modelo.getVista().lblTotalV.getText().substring(8));
        if(!"0.00".equals(modelo.getVista().lblTotalV.getText().substring(8)) && !modelo.getVista().lblClienteV.getText().isEmpty()){
            modelo.getVista().btnGuardarDatosV.setEnabled(true);
        } else{
            modelo.getVista().btnGuardarDatosV.setEnabled(false);
        }
    }
    
    public void guardarEncabezado(){
        try {
            ps = conector.preparar(sql.getIngresarEnc());
            ps.setString(1, modelo.getVista().txtNitV.getText());
            ps.setString(2, modelo.getVista().lblUsuarioV.getText().substring(9));
            ps.executeUpdate();
            conector.desconectar();
            guardarProductos();
        } catch (SQLException ex) {
            conector.mensaje(ex.getMessage(), "Error", 0);
        }
    }
    
    public void guardarProductos(){
        DefaultTableModel model = (DefaultTableModel) modelo.getVista().tblDatosV.getModel();
        for(int i = 0; i < model.getRowCount(); i++){
            try {
                ps = conector.preparar(sql.getIngresarDet());
                ps.setString(1, model.getValueAt(i, 0).toString());
                ps.setDouble(2, Double.parseDouble(model.getValueAt(i, 2).toString()));
                ps.setString(3, modelo.getVista().txtNitV.getText());
                ps.setString(4, modelo.getVista().lblUsuarioV.getText().substring(9));
                ps.setInt(5, Integer.parseInt(model.getValueAt(i, 3).toString()));
                ps.executeUpdate();
                conector.desconectar();
            } catch (SQLException ex) {
                conector.mensaje(ex.getMessage(), "Error", 0);
            }
        }
    }
}
