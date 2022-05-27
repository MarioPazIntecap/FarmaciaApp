package Conector;

public class SQL {
    private String validarUsuario = "SELECT * FROM tbl_Usuarios WHERE usuario = ? AND password = ?;";
    private String validarProducto = "SELECT * FROM tbl_Productos WHERE codigo = ?";
    
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
    
    
}
