package Controlador;

import Conector.Conector;
import Conector.SQL;
import Modelo.ModeloUsuario;
import Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorUsuario implements ActionListener {

    ModeloUsuario modelo;
    PreparedStatement ps;
    ResultSet resultado;
    Conector conector = new Conector();
    SQL sql = new SQL();

    public ControladorUsuario(ModeloUsuario modelo) {
        this.modelo = modelo;
    }

    public ControladorUsuario() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(modelo.getVistaL().btnIngresar.getActionCommand())) {
            if (validarDatos()) {
                VistaPrincipal vistaP = new VistaPrincipal();
                vistaP.lblUsuarioV.setText("Usuario: " + modelo.getVistaL().txtUsuario.getText());
                vistaP.setVisible(true);
                modelo.getVistaL().dispose();
            }
        }
    }

    public boolean validarDatos() {
        boolean res = false;
        try {
            ps = conector.preparar(sql.getValidarUsuario());
            ps.setString(1, modelo.getVistaL().txtUsuario.getText());
            ps.setString(2, String.valueOf(modelo.getVistaL().txtPassword.getPassword()));
            resultado = ps.executeQuery();
            while (resultado.next()) {
                res = resultado.getString("usuario").equals(modelo.getVistaL().txtUsuario.getText())
                        && resultado.getString("password").equals(String.valueOf(modelo.getVistaL().txtPassword.getPassword()));
            }
            conector.desconectar();
            return res;
        } catch (SQLException ex) {
            conector.desconectar();
            return res;
        }
    }

}
