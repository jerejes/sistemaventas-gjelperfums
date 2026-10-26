package modelo;
public class FacturaProducto {
    private Producto producto;    
    private Factura factura;     
    private int cantidad;
    private double valorTotal;
    
    public FacturaProducto() {}
    
    public FacturaProducto(Producto producto, Factura factura, 
            int cantidad, double valorTotal) {
        this.producto = producto;
        this.factura = factura;
        this.cantidad = cantidad;
        this.valorTotal = valorTotal;
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
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
