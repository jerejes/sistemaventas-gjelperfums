package modelo;

import java.time.LocalDate;
public class Pedido {
     private int codPedido;       
    private String estado;
    private String destinatario;
    private LocalDate fechaEntrega;
    private LocalDate fechaPedido;
    private int codCliente;    
    private int codEmpleado;     

    public Pedido() {}

    public Pedido(int codPedido, String estado, String destinatario,
                  LocalDate fechaEntrega, LocalDate fechaPedido,
                  int codCliente, int codEmpleado)
    {
        this.codPedido = codPedido;
        this.estado = estado;
        this.destinatario = destinatario;
        this.fechaEntrega = fechaEntrega;
        this.fechaPedido = fechaPedido;
        this.codCliente = codCliente;
        this.codEmpleado = codEmpleado;
    }

    public int getCodPedido() { return codPedido; }
    public void setCodPedido(int codPedido) { this.codPedido = codPedido; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getDestinatario() { return destinatario; }
    public void setDestinatario(String destinatario) { this.destinatario = destinatario; }

    public LocalDate getFechaEntrega() { return fechaEntrega; }
    public void setFechaEntrega(LocalDate fechaEntrega) { this.fechaEntrega = fechaEntrega; }

    public LocalDate getFechaPedido() { return fechaPedido; }
    public void setFechaPedido(LocalDate fechaPedido) { this.fechaPedido = fechaPedido; }

    public int getCodCliente() { return codCliente; }
    public void setCodCliente(int codCliente) { this.codCliente = codCliente; }

    public int getCodEmpleado() { return codEmpleado; }
    public void setCodEmpleado(int codEmpleado) { this.codEmpleado = codEmpleado; }
}
