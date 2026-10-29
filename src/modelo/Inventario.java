package modelo;
import java.time.LocalDate;
import java.util.ArrayList;
public class Inventario {
    private int codInventario;   
    private LocalDate fechaRegistro;
    private ArrayList<InventarioProducto> listaStock = new ArrayList<>();
    public Inventario() {}
    public Inventario(int codInventario, LocalDate fechaRegistro)
    {
        this.codInventario = codInventario;
        this.fechaRegistro = fechaRegistro;
    }
    public Inventario(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public ArrayList<InventarioProducto> getListaStock() {
        return listaStock;
    }
    public void setListaStock(ArrayList<InventarioProducto> listaStock) {
        this.listaStock = listaStock;
    }
    public int getCodInventario() { return codInventario; }
    public void setCodInventario(int codInventario) { this.codInventario = codInventario; }
    public LocalDate getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDate fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}
