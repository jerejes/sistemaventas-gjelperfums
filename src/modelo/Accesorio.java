package modelo;
public class Accesorio extends Producto {
    private String tipoAccesorio;
    private String material;
    public Accesorio(String tipoAccesorio, String material) {
        this.tipoAccesorio = tipoAccesorio;
        this.material = material;
    }
    public Accesorio( int codProducto, String nomProd, double precioUnidad
      ,String tipoAccesorio, String material) {
        super(codProducto, nomProd, precioUnidad);
        this.tipoAccesorio = tipoAccesorio;
        this.material = material;
    }
    public Accesorio( String nomProd, double precioUnidad
     ,String tipoAccesorio, String material) {
        super(nomProd, precioUnidad);
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
