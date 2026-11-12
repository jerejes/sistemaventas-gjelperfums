package modelo;
import dao.DetaleCompraDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class Compra {
    private int codCompra;      
    private String numserie;      
    private String tipoPago;
    private LocalDate fechaCompra;
    private String estadoCompra;
    private Proveedor proveedor;     
    private ArrayList <compraproducto>listaDetalleCompra= new ArrayList<>();     
    public Compra() {}
    public Compra(int codCompra, String numserie,String tipoPago, LocalDate fechaCompra, String estadoCompra, Proveedor proveedor) 
    {
        this.codCompra = codCompra;
        this.tipoPago = tipoPago;
        this.fechaCompra = fechaCompra;
        this.estadoCompra = estadoCompra;
        this.proveedor = proveedor;
    }
    public Compra(String tipoPago, LocalDate fechaCompra, String estadoCompra, Proveedor proveedor)
    {
        this.tipoPago = tipoPago;
        this.fechaCompra = fechaCompra;
        this.estadoCompra = estadoCompra;
        this.proveedor = proveedor;
    }
    
    public String getNumserie() {
        return numserie;
    }
    public void setNumserie(String numserie) {
        this.numserie = numserie;
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

    public ArrayList<compraproducto> getListaDetalleCompra() {
        return listaDetalleCompra;
    }
    public void setListaDetalleCompra(ArrayList<compraproducto> listaDetalleCompra) {
        this.listaDetalleCompra = listaDetalleCompra;
    }

    public DefaultTableModel mostrar ()
    {
       String [] titulos = {"N°serie","Nombre","Tipo","Precio","Cantidad","Sub Total"};
       DefaultTableModel modelotabla = new DefaultTableModel(null,titulos);
       for(compraproducto x : listaDetalleCompra)
       {
           modelotabla.addRow(x.DatosTabla());
       }
       return modelotabla;
    }
    public void eliminar (compraproducto compra)
    {
       listaDetalleCompra.remove(compra);
    }
    public boolean agregar(compraproducto nuevo)
    {

        for (compraproducto detalle : listaDetalleCompra)
        {

            if (detalle.getProducto().getCodProducto()
                    == nuevo.getProducto().getCodProducto()) 
            {
                if (Double.compare(detalle.getPrecioUnitario(),
                        nuevo.getPrecioUnitario()) != 0) 
                {
                    return false;
                }
                detalle.setCantidad(detalle.getCantidad() + nuevo.getCantidad());
                return true;
            }
        }
        nuevo.setCompra(this);
        listaDetalleCompra.add(nuevo);
        return true;
    }
}
