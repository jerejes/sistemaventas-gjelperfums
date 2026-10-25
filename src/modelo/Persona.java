package modelo;
public abstract class  Persona  {
    private int codPersona;
    private String dni;
    private String correo;
    private String nombre;
    private String apellido;
    private String telefono;
    private String calle;
    private String avenida;
    private String distrito;

    public Persona() {}

    public Persona(int codPersona, String dni, String correo, String nombre,
                   String apellido, String telefono, String calle,
                   String avenida, String distrito) {
        this.codPersona = codPersona;
        this.dni = dni;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.calle = calle;
        this.avenida = avenida;
        this.distrito = distrito;
    }

    public int getCodPersona() { return codPersona; }
    public void setCodPersona(int codPersona) { this.codPersona = codPersona; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public String getAvenida() { return avenida; }
    public void setAvenida(String avenida) { this.avenida = avenida; }

    public String getDistrito() { return distrito; }
    public void setDistrito(String distrito) { this.distrito = distrito; }
}
