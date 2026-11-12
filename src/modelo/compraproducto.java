package modelo;
public class compraproducto 
{
    private Compra compra;       
    private Producto producto;    
    private double precioUnitario;
    private int cantidad;
    public compraproducto() {}
    public compraproducto(Compra compra, Producto producto, double precioUnitario, int cantidad) {
        this.compra = compra;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }
    public compraproducto(Producto producto, double precioUnitario, int cantidad) 
    {
        this.producto = producto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }
    public Object[] DatosTabla() {
        return new Object[]{
            producto.getNumSerie(),
            producto.getNomProd(),
            producto instanceof Perfume ? "Perfume" : "Accesorio",
            precioUnitario,
            cantidad,
            precioUnitario * cantidad
        };
    }
    public Compra getCompra() {return compra; }
    public void setCompra(Compra compra) {this.compra = compra;}
    
    public Producto getProducto() {return producto;}
    public void setProducto(Producto producto) {this.producto = producto;}
    
    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }
   
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}


