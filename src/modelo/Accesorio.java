package modelo;
public class Accesorio extends Producto {
     private String tipoAccesorio;
    private String material;

    public Accesorio() {}

    public Accesorio(int codProducto, int cantxunidad, String nomProd,
                     double precioUnidad, String marca,
                     String tipoAccesorio, String material)
    {
        super(codProducto, cantxunidad, nomProd, precioUnidad, marca);
        this.tipoAccesorio = tipoAccesorio;
        this.material = material;
    }

    public String getTipoAccesorio() { return tipoAccesorio; }
    public void setTipoAccesorio(String tipoAccesorio) { this.tipoAccesorio = tipoAccesorio; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
}
