package Controlador;

import Conector.Conector;
import Conector.SQL;
import Modelo.ModeloProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ControladorProductos implements ActionListener{
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
            modelo.getVista().tblDatosV.setModel(agregarProductos());
        }
    }
    
    public DefaultTableModel agregarProductos(){
        double cantidad = Double.parseDouble(modelo.getVista().txtCantidadV.getText());
        DefaultTableModel modeloTabla = new DefaultTableModel();
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
                    cantidad,
                    cantidad*Double.parseDouble(resultado.getString("precioVenta"))});
            }
            conector.desconectar();
        } catch (SQLException ex) {
            conector.desconectar();
        }
        return modeloTabla;
    }
    
}
