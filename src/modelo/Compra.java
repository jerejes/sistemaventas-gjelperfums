package modelo;
import java.time.LocalDate;
public class Compra {
    private int codCompra;      
    private String tipoPago;
    private LocalDate fechaCompra;
    private String estadoCompra;
    private Proveedor proveedor;     
    
    public Compra() {}

    public Compra(int codCompra, String tipoPago, LocalDate fechaCompra, String estadoCompra, Proveedor proveedor) {
        this.codCompra = codCompra;
        this.tipoPago = tipoPago;
        this.fechaCompra = fechaCompra;
        this.estadoCompra = estadoCompra;
        this.proveedor = proveedor;
    }
    public Compra(String tipoPago, LocalDate fechaCompra, String estadoCompra, Proveedor proveedor) {
        this.tipoPago = tipoPago;
        this.fechaCompra = fechaCompra;
        this.estadoCompra = estadoCompra;
        this.proveedor = proveedor;
    }

    public int getCodCompra() { return codCompra; }
    public void setCodCompra(int codCompra) { this.codCompra = codCompra; }

    public String getTipoPago() { return tipoPago; }
    public void setTipoPago(String tipoPago) { this.tipoPago = tipoPago; }

    public LocalDate getFechaCompra() { return fechaCompra; }
    public void setFechaCompra(LocalDate fechaCompra) { this.fechaCompra = fechaCompra; }

    public String getEstadoCompra() { return estadoCompra; }
    public void setEstadoCompra(String estadoCompra) { this.estadoCompra = estadoCompra; }

    public Proveedor getProveedor() {return proveedor;}
    public void setProveedor(Proveedor proveedor) { this.proveedor = proveedor;}
}
