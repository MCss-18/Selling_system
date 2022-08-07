package modelo;
public class Usuario {
    private String codUsuario;
    private String nombres;
    private String nomUsuario;
    private String claveUsuario;
    private String rolUsuario;
    private String estadoUsuario;
    public Usuario() {
    }
    
    public String getCodUsuario() {
        return codUsuario;
    }
    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getNomUsuario() {
        return nomUsuario;
    }
    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }
    public String getClaveUsuario() {
        return claveUsuario;
    }
    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }
    public String getrolUsuario() {
        return rolUsuario;
    }
    public void setrolUsuario(String rolUsuario) {   
        this.rolUsuario = rolUsuario;
    }
    public String getEstadoUsuario() {
        return estadoUsuario;
    }
    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
    public Object[] registroUsuarios(){
        Object[] filaUsuarios={codUsuario, nombres, nomUsuario, claveUsuario,rolUsuario,estadoUsuario};
        return filaUsuarios;
    }
}
