package modelo;
import java.time.LocalDate;
public class Empleado extends Persona {
    private LocalDate fechaIngreso;
    private Empleado supervisor;
    private String numserie;
    private String cargo;
    private String estado;

    public Empleado() {}
    public Empleado(int codPersona, String dni, String correo, String nombre,
            String apellido, String telefono, String direccion, LocalDate fechaNac,
            LocalDate fechaIngreso, Empleado supervisor,
             String numserie, String cargo, String estado) {
        super(codPersona, dni, correo, nombre, apellido, telefono, direccion, fechaNac);
        this.fechaIngreso = fechaIngreso;
        this.supervisor = supervisor;
        this.numserie = numserie;
        this.cargo = cargo;
        this.estado = estado;
    }
    public Empleado(String dni, String correo, String nombre, String apellido,
            String telefono, String direccion, LocalDate fechaNac,
            LocalDate fechaIngreso, Empleado supervisor,
            String cargo, String estado)
    {
        super(dni, correo, nombre, apellido, telefono, direccion, fechaNac);
        this.fechaIngreso = fechaIngreso;
        this.supervisor = supervisor;
        this.numserie = numserie;
        this.cargo = cargo;
        this.estado = estado;
    }
        @Override
    public String toString() {
        return getNombre() + " " + getApellido();
    }

    public String getNumserie() {
        return numserie;
    }
    public void setNumserie(String numserie) {
        this.numserie = numserie;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public LocalDate getFechaIngreso() {return fechaIngreso;}
    public void setFechaIngreso(LocalDate fechaIngreso) {this.fechaIngreso = fechaIngreso;}
    
    public Empleado getSupervisor() {return supervisor;}
    public void setSupervisor(Empleado supervisor) {this.supervisor = supervisor;}
}
