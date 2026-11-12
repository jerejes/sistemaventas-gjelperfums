package modelo;
public class Proveedor {
     private int codProveedor;  
    private String numserie;
    private String nomEmpresa;
    private String ruc;
    private String telefono;
    private String calle;
    private String avenida;
    private String distrito;
    private String estado;
    public Proveedor() {}
    public Proveedor(int codProveedor, String numserie,String nomEmpresa, String ruc, String telefono, 
            String calle, String avenida,
            String distrito,String estado) {
        this.codProveedor = codProveedor;
        this.numserie = numserie;
        this.nomEmpresa = nomEmpresa;
        this.ruc = ruc;
        this.telefono = telefono;
        this.calle = calle;
        this.avenida = avenida;
        this.distrito = distrito;
        this.estado = estado;
    }
    public Proveedor(String nomEmpresa, String ruc, String telefono, String calle, String avenida, String distrito,
    String estado) {
        this.nomEmpresa = nomEmpresa;
        this.ruc = ruc;
        this.telefono = telefono;
        this.calle = calle;
        this.avenida = avenida;
        this.distrito = distrito;
        this.estado = estado;
    }
    public Object [] mostrarDatos()
    {
        return new Object[] {
            numserie,
            nomEmpresa,
            ruc,
            telefono,
            distrito+"-"+avenida+"-"+calle,
            estado};
    }
    @Override
    public String toString() 
    {
        return nomEmpresa;
    }
    public String getNumserie() {return numserie;}
    public void setNumserie(String numserie) { this.numserie = numserie;}
    
    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
    
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
