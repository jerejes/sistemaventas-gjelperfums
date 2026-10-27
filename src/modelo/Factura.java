package modelo;
import java.time.LocalDate;
import java.util.ArrayList;
public class Factura {
    private  int codfactura;
    private LocalDate fechafactura;
    private Cliente cliente ;
    private Empleado empleado ;
    private ArrayList < FacturaProducto> listdetalleprod = new ArrayList<>(); 
   
    public Factura() {
    }
    public Factura(int codfactura, LocalDate fechafactura, Cliente cliente, Empleado empleado) {
        this.codfactura = codfactura;
        this.fechafactura = fechafactura;
        this.cliente = cliente;
        this.empleado = empleado;
    }
    public Factura(LocalDate fechafactura, Cliente cliente, Empleado empleado) {
        this.fechafactura = fechafactura;
        this.cliente = cliente;
        this.empleado = empleado;
    }
    public int getCodfactura() {return codfactura;}
    public void setCodfactura(int codfactura) {this.codfactura = codfactura;}
  
    public LocalDate getFechafactura() {return fechafactura; }
    public void setFechafactura(LocalDate fechafactura) { this.fechafactura = fechafactura;}
    
    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
  
    public Empleado getEmpleado() { return empleado;}
    public void setEmpleado(Empleado empleado) {this.empleado = empleado;}
   
    public ArrayList<FacturaProducto> getFacturaProd() {return listdetalleprod; }
    
    public void  agregarProducto (FacturaProducto nuevo)
    {
        for (FacturaProducto factprod :  listdetalleprod )
        {
            if (factprod.getProducto() == nuevo.getProducto())
            {
                factprod.setCantidad(nuevo.getCantidad()+factprod.getCantidad());
                return;
            }
        }
        nuevo.setFactura(this);
        listdetalleprod.add(nuevo);
    }
}
