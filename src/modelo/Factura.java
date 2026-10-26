package modelo;
import java.time.LocalDate;
public class Factura {
    private  int codfactura;
    private LocalDate fechafactura;
    private Cliente cliente ;
    private Empleado empleado ;
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
    public int getCodfactura() {
        return codfactura;
    }
    public void setCodfactura(int codfactura) {
        this.codfactura = codfactura;
    }
    public LocalDate getFechafactura() {
        return fechafactura;
    }
    public void setFechafactura(LocalDate fechafactura) {
        this.fechafactura = fechafactura;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
