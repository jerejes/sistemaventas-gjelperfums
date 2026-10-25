package modelo;
public class Usuario 
{
    private int codUsuario; 
    private String nomUsuario;
    private String contrasena;
    private int codEmpleado;

    public Usuario() {}

    public Usuario(int codUsuario, String nomUsuario, String contrasena, int codEmpleado) {
        this.codUsuario = codUsuario;
        this.nomUsuario = nomUsuario;
        this.contrasena = contrasena;
        this.codEmpleado = codEmpleado;
    }

    public int getCodUsuario() { return codUsuario; }
    public void setCodUsuario(int codUsuario) { this.codUsuario = codUsuario; }

    public String getNomUsuario() { return nomUsuario; }
    public void setNomUsuario(String nomUsuario) { this.nomUsuario = nomUsuario; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public int getCodEmpleado() { return codEmpleado; }
    public void setCodEmpleado(int codEmpleado) { this.codEmpleado = codEmpleado; }
}
