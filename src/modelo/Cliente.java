package modelo;
import java.time.LocalDate;
public class Cliente extends Persona
{  
    private String numserie;
    private String estado;
    public Cliente() {}
    public Cliente(int codPersona, String dni,
            String correo, String nombre, 
            String apellido, String telefono, 
            String direccion, LocalDate fechanac,String numserie,String est) {
        super(codPersona, dni, correo, nombre, apellido, telefono, direccion, fechanac);
        this.numserie =numserie;
        this.estado = est;
    }
    public Cliente(String dni, String correo, 
            String nombre, String apellido, 
            String telefono, String direccion, 
            LocalDate fechanac,String estado) {
        super(dni, correo, nombre, apellido, telefono, direccion, fechanac);
        this.estado = estado;
    }
    public String getNumserie() {
        return numserie;
    }
    public void setNumserie(String numserie) {
        this.numserie = numserie;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
