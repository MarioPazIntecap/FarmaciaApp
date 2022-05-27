package Modelo;

import Vista.VistaPrincipal;

public class ModeloProductos {
    private VistaPrincipal vista;
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precioCosto;
    private double precioVenta;
    private int exisencias;

    public ModeloProductos() {
    }

    public ModeloProductos(VistaPrincipal vista) {
        this.vista = vista;
    }

    public VistaPrincipal getVista() {
        return vista;
    }

    public void setVista(VistaPrincipal vista) {
        this.vista = vista;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getExisencias() {
        return exisencias;
    }

    public void setExisencias(int exisencias) {
        this.exisencias = exisencias;
    }
}
