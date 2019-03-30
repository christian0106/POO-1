package Clases;

public class Orden {
    private int numero_orden;

    public Orden(){
        this.numero_orden=0;
    }

    public Orden(int numero_orden) {
        this.numero_orden = numero_orden;
    }

    public int getNumero_orden() {
        return numero_orden;
    }

    public void setNumero_orden(int numero_orden) {
        this.numero_orden = numero_orden;
    }
}
