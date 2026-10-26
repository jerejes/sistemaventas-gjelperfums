package modelo;
import java.time.LocalDate;
public class Cliente extends Persona
{
    public Cliente() {}

    public Cliente(int codPersona, String dni, String correo, String nombre, String apellido, String telefono, String direccion, LocalDate fechanac) {
        super(codPersona, dni, correo, nombre, apellido, telefono, direccion, fechanac);
    }

    public Cliente(String dni, String correo, String nombre, String apellido, String telefono, String direccion, LocalDate fechanac) {
        super(dni, correo, nombre, apellido, telefono, direccion, fechanac);
    }
}
