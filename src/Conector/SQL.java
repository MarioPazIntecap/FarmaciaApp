package Conector;

public class SQL {
    private String validarUsuario = "SELECT * FROM tbl_Usuarios WHERE usuario = ? AND password = ?;";
    private String validarProducto = "SELECT * FROM tbl_Productos WHERE codigo = ?";
    private String validarExistencias = "SELECT cantidad FROM tbl_existencias WHERE codigoBodega = 'CEN01' AND codigoProducto = ?;";
    private String validarCliente = "SELECT * FROM tbl_clientes WHERE nit = ?;";
    private String ingresarEnc = "CALL sp_registroVenta(?,?)";
    private String ingresarDet = "CALL sp_registroDatosVenta(?,?,?,?,?)";
    
    public SQL() {
    }
    
    /**
     * SELECT * FROM usuarios WHERE usuario = ? AND password = ?
     * Retorna todos los datos del usuario si existe en la base de datos
     * @return ResultSet con todos los datos del usuario
     */
    public String getValidarUsuario() {
        return validarUsuario;
    }
    
    /**
     * SELECT * FROM tbl_Productos WHERE codigo = ?
     * Retorna todos los datos del producto si existe en la base de datos
     * @return ResultSet con todos los datos del producto
     */
    public String getValidarProducto() {
        return validarProducto;
    }

    /**
     * SELECT cantidad FROM tbl_existencias WHERE codigoBodega = 'CEN01' AND codigoProducto = ?;
     * Retorna la cantidad en existencias de un producto.
     * @return ResultSet con la cantidad del producto.
     */
    public String getValidarExistencias() {
        return validarExistencias;
    }

    /**
     * SELECT * FROM tbl_clientes WHERE nit = ?;
     * Retorna la informacion del cliente si existe en la base de datos.
     * @return 
     */
    public String getValidarCliente() {
        return validarCliente;
    }

    /**
     * CALL sp_registroVenta(?,?)
     * Ingresa un nuevo encabezado
     * Parametros: NitCliente, CodigoUsuario
     * @return 
     */
    public String getIngresarEnc() {
        return ingresarEnc;
    }

    /**
     * CALL sp_registroDatosVenta(?,?,?,?,?)
     * Ingresa un detalle de productos a una orden existente
     * Parametros: CodigoProducto, PrecioProducto, NitCliente, CodigoUsuario, Cantidad
     * @return 
     */
    public String getIngresarDet() {
        return ingresarDet;
    }
    
    
}
