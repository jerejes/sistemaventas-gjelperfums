package modelo;
public class Usuario 
{  private int codUsuario; 
    private String nomUsuario;
    private String contrasena;
    private Empleado empleado;
    public Usuario() {}
    public Usuario(int codUsuario, String nomUsuario, String contrasena, Empleado empleado) {
        this.codUsuario = codUsuario;
        this.nomUsuario = nomUsuario;
        this.contrasena = contrasena;
        this.empleado = empleado;
    }
    public Usuario(String nomUsuario, String contrasena, Empleado empleado) {
        this.nomUsuario = nomUsuario;
        this.contrasena = contrasena;
        this.empleado = empleado;
    }
    public int getCodUsuario() {
        return codUsuario;
    }
    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }
    public String getNomUsuario() {
        return nomUsuario;
    }
    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
