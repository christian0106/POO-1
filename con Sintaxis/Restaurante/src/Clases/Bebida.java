package Clases;

public class Bebida {
    private String nombre;
    private Double precio;
    private String tipo_bebida;

    public Bebida(){
        this.nombre=null;
        this.precio=0.0;
        this.tipo_bebida=null;
    }

    public Bebida(String nombre, Double precio, String tipo_bebida) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo_bebida = tipo_bebida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipo_bebida() {
        return tipo_bebida;
    }

    public void setTipo_bebida(int tipo_bebida) {
        this.tipo_bebida = (tipo_bebida==1)?"Alcohólica":"No Alcohólica ";
    }
}
