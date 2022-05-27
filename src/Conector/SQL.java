package Conector;

public class SQL {
    private String validarUsuario = "SELECT * FROM tbl_Usuarios WHERE usuario = ? AND password = ?;";

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
    
    
}
