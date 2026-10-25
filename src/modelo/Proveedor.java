package modelo;
public class Proveedor {
     private int codProveedor;   // PK
    private String nomEmpresa;
    private String ruc;
    private String telefono;
    private String calle;
    private String avenida;
    private String distrito;

    public Proveedor() {}
    public Proveedor(int codProveedor, String nomEmpresa, String ruc, String telefono, String calle, String avenida, String distrito) {
        this.codProveedor = codProveedor;
        this.nomEmpresa = nomEmpresa;
        this.ruc = ruc;
        this.telefono = telefono;
        this.calle = calle;
        this.avenida = avenida;
        this.distrito = distrito;
    }

    public int getCodProveedor() { return codProveedor; }
    public void setCodProveedor(int codProveedor) { this.codProveedor = codProveedor; }

    public String getNomEmpresa() { return nomEmpresa; }
    public void setNomEmpresa(String nomEmpresa) { this.nomEmpresa = nomEmpresa; }

    public String getRuc() { return ruc; }
    public void setRuc(String ruc) { this.ruc = ruc; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public String getAvenida() { return avenida; }
    public void setAvenida(String avenida) { this.avenida = avenida; }

    public String getDistrito() { return distrito; }
    public void setDistrito(String distrito) { this.distrito = distrito; }
}
