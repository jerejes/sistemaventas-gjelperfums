package modelo;
public class FacturaProducto {
    private Producto producto;    
    private Factura factura;     
    private int cantidad;
    private double valorTotal;
    
    public FacturaProducto() {
    }
    public FacturaProducto(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;                                   
        setCantidad(cantidad);
    }

    public FacturaProducto(Producto producto, Factura factura, int cantidad) {
        this.producto = producto;
        this.factura = factura;
        setCantidad(cantidad);
    }

    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Factura getFactura() {
        return factura;
    }
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) 
    {
        this.cantidad = cantidad;
        if (producto != null) {
            this.valorTotal = producto.getPrecioUnidad() * cantidad;
        }
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
