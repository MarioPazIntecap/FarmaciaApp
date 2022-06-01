package Modelo;

import Vista.VistaLogin;
import Vista.VistaPrincipal;

public class ModeloUsuario {
    private VistaLogin vistaL;
    private VistaPrincipal vistaU;
    private int codigo;
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    
    public ModeloUsuario() {
    }

    public ModeloUsuario(VistaLogin vistaL) {
        if(vistaL != null)
            this.vistaL = vistaL;
    }

    public ModeloUsuario(VistaPrincipal vistaU) {
        this.vistaU = vistaU;
    }

    public VistaPrincipal getVistaU() {
        return vistaU;
    }

    public void setVistaU(VistaPrincipal vistaU) {
        this.vistaU = vistaU;
    }

    public VistaLogin getVistaL() {
        return vistaL;
    }

    public void setVistaL(VistaLogin vistaL) {
        this.vistaL = vistaL;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
