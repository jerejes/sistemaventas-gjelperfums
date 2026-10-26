package modelo;
import java.time.LocalDate;
public class Venta {
    private int codVenta;
    private LocalDate fechaVenta;
    private String tipoPag;
    private Factura factura ;

    public Venta() {}
    
    public Venta(int codVenta, LocalDate fechaVenta, String tipoPag, Factura factura) {
        this.codVenta = codVenta;
        this.fechaVenta = fechaVenta;
        this.tipoPag = tipoPag;
        this.factura = factura;
    }
    public Venta(LocalDate fechaVenta, String tipoPag, Factura factura) {
        this.fechaVenta = fechaVenta;
        this.tipoPag = tipoPag;
        this.factura = factura;
    }

    public int getCodVenta() {
        return codVenta;
    }
    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
    }
    public LocalDate getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    public String getTipoPag() {
        return tipoPag;
    }
    public void setTipoPag(String tipoPag) {
        this.tipoPag = tipoPag;
    }
    public Factura getFactura() {
        return factura;
    }
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
}
