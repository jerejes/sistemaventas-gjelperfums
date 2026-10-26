package modelo;
import java.time.LocalDate;
public abstract class  Persona  {
    private int codPersona;
    private String dni;
    private String correo;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private LocalDate fechaNac;
    public Persona() {}
    public Persona(int codPersona, String dni, String correo, String nombre, String apellido,
            String telefono, String direccion, LocalDate fechanac) {
        this.codPersona = codPersona;
        this.dni = dni;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNac = fechanac;
    }
    public Persona(String dni, String correo, String nombre, String apellido,
            String telefono, String direccion, LocalDate fechanac) {
        this.dni = dni;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNac = fechanac;
    }

    public int getCodPersona() {
        return codPersona;
    }
    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
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
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public LocalDate getFechanac() {
        return fechaNac;
    }
    public void setFechanac(LocalDate fechanac) {
        this.fechaNac = fechanac;
    }
}
