package modelo;
public class DetalleCompra 
{
    private Compra compra;       
    private Producto producto;    
    private double precioUnitario;
    private int cantidad;
    private double descuento;

    public DetalleCompra() {}
    public DetalleCompra(Compra compra, Producto producto, double precioUnitario, int cantidad, double descuento) {
        this.compra = compra;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }
    public Compra getCompra() {return compra; }
    public void setCompra(Compra compra) {this.compra = compra;}
    
    public Producto getProducto() {return producto;}
    public void setProducto(Producto producto) {this.producto = producto;}
    
    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }
   
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    
    public double getDescuento() { return descuento; }
    public void setDescuento(double descuento) { this.descuento = descuento; }
}
