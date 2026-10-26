package modelo;
public abstract class Producto {
    private int codProducto;
    private String nomProd;
    private double precioUnidad;

    public Producto() {}

    public Producto(int codProducto, String nomProd, double precioUnidad) {
        this.codProducto = codProducto;
        this.nomProd = nomProd;
        this.precioUnidad = precioUnidad;
    }

    public Producto(String nomProd, double precioUnidad) {
        this.nomProd = nomProd;
        this.precioUnidad = precioUnidad;
    }

    public int getCodProducto() {
        return codProducto;
    }
    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }
    public String getNomProd() {
        return nomProd;
    }
    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }
    public double getPrecioUnidad() {
        return precioUnidad;
    }
    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
}
