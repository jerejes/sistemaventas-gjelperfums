package modelo;
public abstract class Producto {
    private int codProducto;
    private int cantxunidad;
    private String nomProd;
    private double precioUnidad;
    private String marca;

    public Producto() {}

    public Producto(int codProducto, int cantxunidad, String nomProd,
                    double precioUnidad, String marca)
    {
        this.codProducto = codProducto;
        this.cantxunidad = cantxunidad;
        this.nomProd = nomProd;
        this.precioUnidad = precioUnidad;
        this.marca = marca;
    }

    public int getCodProducto() { return codProducto; }
    public void setCodProducto(int codProducto) { this.codProducto = codProducto; }

    public int getCantxunidad() { return cantxunidad; }
    public void setCantxunidad(int cantxunidad) { this.cantxunidad = cantxunidad; }

    public String getNomProd() { return nomProd; }
    public void setNomProd(String nomProd) { this.nomProd = nomProd; }

    public double getPrecioUnidad() { return precioUnidad; }
    public void setPrecioUnidad(double precioUnidad) { this.precioUnidad = precioUnidad; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
}
