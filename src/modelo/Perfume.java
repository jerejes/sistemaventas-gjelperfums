package modelo;
public class Perfume extends Producto
{
    private String genero;
    private int  contMl;
    public Perfume() {
    }
    public Perfume( int codProducto, String nomProd, double precioUnidad,
            String genero, int contMl) {
        super(codProducto, nomProd, precioUnidad);
        this.genero = genero;
        this.contMl = contMl;
    }
    public Perfume(String nomProd, double precioUnidad,
            String genero, int contMl) {
        super(nomProd, precioUnidad);
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
