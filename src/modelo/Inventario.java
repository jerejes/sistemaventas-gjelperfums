package modelo;
public class Inventario {
    private int codInventario;
    private String nombre;

    public Inventario() {
    }
    public Inventario(int codInventario, String nombre) {
        this.codInventario = codInventario;
        this.nombre = nombre;
    }
    public Inventario(String nombre) {
        this.nombre = nombre;
    }
    public int getCodInventario() {
        return codInventario;
    }
    public void setCodInventario(int codInventario) {
        this.codInventario = codInventario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
