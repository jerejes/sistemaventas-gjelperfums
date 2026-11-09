package modelo;
public class Accesorio extends Producto {
    private String tipoAccesorio;
    private String material;
    public Accesorio() {
    }
    // completo: para leer de la base de datos
    public Accesorio(int codProducto, String numSerie, String nomProd, double precio,
            int stock, Inventario inventario, String tipoAccesorio, String material) {
        super(codProducto, numSerie, nomProd, precio, stock, inventario);
        this.tipoAccesorio = tipoAccesorio;
        this.material = material;
    }
    @Override
    public Object[] getDatosTabla() {
        return new Object[]{
            getNumSerie(),
            getNomProd(),
            "Accesorio",
            getPrecioUnitario(),
            getStockActual(),
            getEstadoStock(),
            getTipoAccesorio() + " - " + getMaterial()
        };
    }
    public Accesorio(String nomProd, double precio, Inventario inventario,
            String tipoAccesorio, String material) {
        super(nomProd, precio, inventario);
        this.tipoAccesorio = tipoAccesorio;
        this.material = material;
    }
    public String getTipoAccesorio() {
        return tipoAccesorio;
    }
    public void setTipoAccesorio(String tipoAccesorio) {
        this.tipoAccesorio = tipoAccesorio;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
}
