package modelo;
public class DetalleInventario {
    private Inventario inventario ; 
    private Producto producto;
    private int stock;

    public DetalleInventario() {
    }
    public DetalleInventario(Inventario inventario, Producto producto, int stock) {
        this.inventario = inventario;
        this.producto = producto;
        this.stock = stock;
    }
    public Inventario getInventario() {
        return inventario;
    }
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
