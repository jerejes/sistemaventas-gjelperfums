package modelo;
public abstract class Producto {
    private int codProducto;
    private String numSerie;
    private String nomProd;
    private double precioUnitario;
    private int stockActual;
    private String estadoStock;
    private Inventario inventario;
    public Producto() {
    }
    public Producto(int codProducto, String numSerie, String nomProd,
            double precioUnidad, int stockActual, Inventario inventario) {
        this.codProducto = codProducto;
        this.numSerie = numSerie;
        this.nomProd = nomProd;
        this.precioUnitario = precioUnidad;
        this.stockActual = stockActual;
        this.inventario = inventario;
    }
    public Producto(String nomProd, double precioUnidad, Inventario inventario) {
        this.nomProd = nomProd;
        this.precioUnitario = precioUnidad;
        this.inventario = inventario;
        this.stockActual = 0; 
    }
    public Object[] getDatosCompra() {
        return new Object[]{
            getNomProd(),
            getNumSerie(),
            getPrecioUnitario()
        };
    }
    public abstract Object[] getDatosTabla();
    
    public String getEstadoStock() {
        return estadoStock;
    }
    public void setEstadoStock(String estadoStock) {
        this.estadoStock = estadoStock;
    }
    public int getCodProducto() {
        return codProducto;
    }
    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }
    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnidad) {
        this.precioUnitario = precioUnidad;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
}
