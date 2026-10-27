package modelo;
import java.time.LocalDate;
public class BoletapagEmpleado {
    private int codBoleta;
    private String detalle;
    private double bonificacion;
    private double descuento;
    private double salario;
    private LocalDate fechaPag;
    private double descuentoPension;
    private double aporteEssalud;
    private Empleado empleado;

    private final double AFP = 0.10;
    private final double ONP = 0.17;
    private final double ESSALUD = 0.17;
    public BoletapagEmpleado() {
    }
    public BoletapagEmpleado(int codBoleta, String detalle, double bonificacion, double descuento, double salario, LocalDate fechaPag, double descuentoPension, double aporteEssalud, Empleado empleado) {
        this.codBoleta = codBoleta;
        this.detalle = detalle;
        this.bonificacion = bonificacion;
        this.descuento = descuento;
        this.salario = salario;
        this.fechaPag = fechaPag;
        this.descuentoPension = descuentoPension;
        this.aporteEssalud = aporteEssalud;
        this.empleado = empleado;
    }
    public BoletapagEmpleado(String detalle, double bonificacion, double descuento, double salario, LocalDate fechaPag, double descuentoPension, double aporteEssalud, Empleado empleado) {
        this.detalle = detalle;
        this.bonificacion = bonificacion;
        this.descuento = descuento;
        this.salario = salario;
        this.fechaPag = fechaPag;
        this.descuentoPension = descuentoPension;
        this.aporteEssalud = aporteEssalud;
        this.empleado = empleado;
    }

    public int getCodBoleta() { return codBoleta; }
    public void setCodBoleta(int codBoleta) { this.codBoleta = codBoleta; }
    
    public String getDetalle() { return detalle; }
    public void setDetalle(String detalle) { this.detalle = detalle; }
    
    public double getBonificacion() { return bonificacion; }
    public void setBonificacion(double bonificacion) { this.bonificacion = bonificacion; }
   
    public double getDescuento() { return descuento; }
    public void setDescuento(double descuento) { this.descuento = descuento; }
   
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
   
    public LocalDate getFechaPag() { return fechaPag; }
    public void setFechaPag(LocalDate fechaPag) { this.fechaPag = fechaPag; }
    
    public double getDescuentoPension() { return descuentoPension; }
    public void setDescuentoPension(double descuentoPension) { this.descuentoPension = descuentoPension; }
    
    public double getAporteEssalud() { return aporteEssalud; }
    public void setAporteEssalud(double aporteEssalud) { this.aporteEssalud = aporteEssalud; }
    
    public Empleado getEmpleado() { return empleado; }
    public void setEmpleado(Empleado empleado) { this.empleado = empleado; }
 }
