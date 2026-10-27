package modelo;
import java.time.LocalDate;
import java.util.ArrayList;
public class Compra {
    private int codCompra;      
    private String tipoPago;
    private LocalDate fechaCompra;
    private String estadoCompra;
    private Proveedor proveedor;     
    private Inventario inventario;     
    private ArrayList <DetalleCompra>listaDetalleCompra= new ArrayList<>();     
    
    public Compra() {}

    public Compra(int codCompra, String tipoPago, LocalDate fechaCompra, String estadoCompra, Proveedor proveedor
    ,Inventario inv) {
        this.codCompra = codCompra;
        this.tipoPago = tipoPago;
        this.fechaCompra = fechaCompra;
        this.estadoCompra = estadoCompra;
        this.proveedor = proveedor;
        this.inventario = inv;
    }
    public Compra(String tipoPago, LocalDate fechaCompra, String estadoCompra, Proveedor proveedor,Inventario inv) {
        this.tipoPago = tipoPago;
        this.fechaCompra = fechaCompra;
        this.estadoCompra = estadoCompra;
        this.proveedor = proveedor;
        this.inventario = inv;
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

    public ArrayList<DetalleCompra> getListaDetalleCompra() {
        return listaDetalleCompra;
    }
    public void setListaDetalleCompra(ArrayList<DetalleCompra> listaDetalleCompra) {
        this.listaDetalleCompra = listaDetalleCompra;
    }

    public Inventario getInventario() {
        return inventario;
    }
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    public double totalcompra ()
    {   
        double total= 0;
        for (DetalleCompra detacompra : listaDetalleCompra)
        {
             total += detacompra.subtotal();
        }
        return total;
    }
    public void eliminar (DetalleCompra compra)
    {
       listaDetalleCompra.remove(compra);
    }
    public void agregar(DetalleCompra nuevo) {
        for (DetalleCompra detacompra : listaDetalleCompra) {
            if (detacompra.getProducto().getCodProducto() == nuevo.getProducto().getCodProducto()) {
                detacompra.setCantidad(detacompra.getCantidad() + nuevo.getCantidad());
                return;  
            }
        }
        nuevo.setCompra(this);            
        listaDetalleCompra.add(nuevo);  
    }

}
