package modelo;
public class Perfume extends Producto
{
    private String genero;
    private int contMl;
    public Perfume() {
    }
    // completo: para leer de la base de datos
    public Perfume(int codProducto, String numSerie, String nomProd, double precio,
            int stock, Inventario inventario, String genero, int contMl) {
        super(codProducto, numSerie, nomProd, precio, stock, inventario);
        this.genero = genero;
        this.contMl = contMl;
    }

    @Override
    public Object[] getDatosTabla() {
        return new Object[]{
            getNumSerie(),
            getNomProd(),
            "Perfume",
            getPrecioUnitario(),
            getStockActual(),
            getEstadoStock(),
            getGenero() + " - " + getContMl() + " ml"
        };
    }
    // nuevo: para guardar desde el formulario
    public Perfume(String nomProd, double precio, Inventario inventario,
            String genero, int contMl) {
        super(nomProd, precio, inventario);
        this.genero = genero;
        this.contMl = contMl;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getContMl() {
        return contMl;
    }

    public void setContMl(int contMl) {
        this.contMl = contMl;
    }
}
