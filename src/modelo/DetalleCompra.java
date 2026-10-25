package modelo;
public class DetalleCompra 
{
    private int codCompra;       
    private int codProducto;    
    private double precioUnitario;
    private int cantidad;
    private double descuento;

    public DetalleCompra() {}

    public DetalleCompra(int codCompra, int codProducto, double precioUnitario,
                         int cantidad, double descuento)
    {
        this.codCompra = codCompra;
        this.codProducto = codProducto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    public int getCodCompra() { return codCompra; }
    public void setCodCompra(int codCompra) { this.codCompra = codCompra; }

    public int getCodProducto() { return codProducto; }
    public void setCodProducto(int codProducto) { this.codProducto = codProducto; }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getDescuento() { return descuento; }
    public void setDescuento(double descuento) { this.descuento = descuento; }
}
