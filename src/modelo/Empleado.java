package modelo;
import java.time.LocalDate;
public class Empleado extends Persona {
    private LocalDate fechaIngreso;
    private Empleado supervisor;   
    public Empleado() {}
    public Empleado( int codPersona, String dni, String correo, String nombre, 
            String apellido, String telefono, String direccion, LocalDate fechaNac
            ,LocalDate fechaIngreso, Empleado supervisor) {
        super(codPersona, dni, correo, nombre, apellido, telefono, direccion, fechaNac);
        this.fechaIngreso = fechaIngreso;
        this.supervisor = supervisor;
    }
    public Empleado( String dni, String correo, String nombre, String apellido, String telefono, String direccion, 
            LocalDate fechaNac,LocalDate fechaIngreso, Empleado supervisor) {
        super(dni, correo, nombre, apellido, telefono, direccion, fechaNac);
        this.fechaIngreso = fechaIngreso;
        this.supervisor = supervisor;
    }
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Empleado getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }
}
