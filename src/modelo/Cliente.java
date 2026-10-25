package modelo;

import java.time.LocalDate;

public class Cliente extends Persona
{
    private LocalDate fechaNac;
    private String genero;

    public Cliente() {}

    public Cliente(int codPersona, String dni, String correo, String nombre,
                   String apellido, String telefono, String calle,
                   String avenida, String distrito,
                   LocalDate fechaNac, String genero) 
    {
        super(codPersona, dni, correo, nombre, apellido,telefono , calle, avenida, distrito);
        this.fechaNac = fechaNac;
        this.genero = genero;
    }

    public LocalDate getFechaNac() { return fechaNac; }
    public void setFechaNac(LocalDate fechaNac) { this.fechaNac = fechaNac; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}
