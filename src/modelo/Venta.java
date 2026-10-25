package modelo;

import java.time.LocalDate;

public class Venta {
    private int codVenta;
    private LocalDate fechaVenta;
    private String tipoPag;
    private int codProducto; 
    private int codPedido; 

    public Venta() {}

    public Venta(int codVenta, LocalDate fechaVenta, String tipoPag, int codProducto, int codPedido) {
        this.codVenta = codVenta;
        this.fechaVenta = fechaVenta;
        this.tipoPag = tipoPag;
        this.codProducto = codProducto;
        this.codPedido = codPedido;
    }

    public int getCodVenta() { return codVenta; }
    public void setCodVenta(int codVenta) { this.codVenta = codVenta; }

    public LocalDate getFechaVenta() { return fechaVenta; }
    public void setFechaVenta(LocalDate fechaVenta) { this.fechaVenta = fechaVenta; }

    public String getTipoPag() { return tipoPag; }
    public void setTipoPag(String tipoPag) { this.tipoPag = tipoPag; }

    public int getCodProducto() { return codProducto; }
    public void setCodProducto(int codProducto) { this.codProducto = codProducto; }

    public int getCodPedido() { return codPedido; }
    public void setCodPedido(int codPedido) { this.codPedido = codPedido; }
}
