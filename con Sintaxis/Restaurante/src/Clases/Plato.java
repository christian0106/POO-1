package Clases;

public class Plato {
    private String nombre;
    private String tipo_plato;
    private Double precio;
    private int calorias;

    public Plato(){
        this.nombre=null;
        this.tipo_plato=null;
        this.precio=0.0;
        this.calorias=0;
    }

    public Plato(String nombre, String tipo_plato, Double precio, int calorias) {
        this.nombre = nombre;
        this.tipo_plato = tipo_plato;
        this.precio = precio;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_plato() {
        return tipo_plato;
    }

    public void setTipo_plato(String tipo_plato) {
        this.tipo_plato = tipo_plato;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
