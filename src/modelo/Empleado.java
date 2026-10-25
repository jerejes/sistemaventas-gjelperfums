package modelo;

import java.time.LocalDate;

public class Empleado extends Persona {
    private LocalDate fechaIngreso;
    private int codEmpleSupervisor;   

    public Empleado() {}

    public Empleado(int codPersona, String dni, String correo, String nombre,
                    String apellido, String telefono, String calle,
                    String avenida, String distrito,
                    LocalDate fechaIngreso, int codEmpleSupervisor)
    {
        super(codPersona, dni, correo, nombre, apellido,
              telefono, calle, avenida, distrito);
        this.fechaIngreso = fechaIngreso;
        this.codEmpleSupervisor = codEmpleSupervisor;
    }

    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public int getCodEmpleSupervisor() { return codEmpleSupervisor; }
    public void setCodEmpleSupervisor(int codEmpleSupervisor) { this.codEmpleSupervisor = codEmpleSupervisor; }
}
