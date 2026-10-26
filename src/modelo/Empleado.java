package modelo;
import java.time.LocalDate;
public class Empleado extends Persona {
    private LocalDate fechaIngreso;
    private Empleado supervisor;   
    private double sueldoBase;
    private String sistemaPension;
    
    public Empleado() {}
    public Empleado( int codPersona, String dni, String correo, String nombre, 
            String apellido, String telefono, String direccion, LocalDate fechaNac
            ,LocalDate fechaIngreso, Empleado supervisor  ,double sueldobase , 
            String sistemapension) {
        super(codPersona, dni, correo, nombre, apellido, telefono, direccion, fechaNac);
        this.fechaIngreso = fechaIngreso;
        this.supervisor = supervisor;
        this.sueldoBase = sueldobase;
        this.sistemaPension = sistemapension;
    }
    public Empleado( String dni, String correo, String nombre, String apellido, String telefono, String direccion, 
            LocalDate fechaNac,LocalDate fechaIngreso, Empleado supervisor,
            double sueldobase , String sistemapension) {
        super(dni, correo, nombre, apellido, telefono, direccion, fechaNac);
        this.fechaIngreso = fechaIngreso;
        this.supervisor = supervisor;
        this.sueldoBase = sueldobase;
        this.sistemaPension = sistemapension;
    }

    public double getSueldoBase() {return sueldoBase; }
    public void setSueldoBase(double sueldoBase) {this.sueldoBase = sueldoBase; }

    public String getSistemaPension() { return sistemaPension;}
    public void setSistemaPension(String sistemaPension) {this.sistemaPension = sistemaPension;}
    
    public LocalDate getFechaIngreso() {return fechaIngreso;}
    public void setFechaIngreso(LocalDate fechaIngreso) {this.fechaIngreso = fechaIngreso;}
    
    public Empleado getSupervisor() {return supervisor;}
    public void setSupervisor(Empleado supervisor) {this.supervisor = supervisor;}
}
