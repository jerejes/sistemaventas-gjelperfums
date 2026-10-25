package modelo;
import java.time.LocalDate;
public class Inventario {
    private int codInventario;   
    private LocalDate fechaRegistro;

    public Inventario() {}
    public Inventario(int codInventario, LocalDate fechaRegistro)
    {
        this.codInventario = codInventario;
        this.fechaRegistro = fechaRegistro;
    }
    public int getCodInventario() { return codInventario; }
    public void setCodInventario(int codInventario) { this.codInventario = codInventario; }

    public LocalDate getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDate fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}
