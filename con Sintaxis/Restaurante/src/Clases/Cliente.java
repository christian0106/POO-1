package Clases;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int edad;
    private int metodo_pago;

    public Cliente(){
        this.edad=0;
        this.nombre=null;
        this.metodo_pago=0;
    }

    public Cliente(String nombre, int edad, int metodo_pago) {
        this.nombre = nombre;
        this.edad = edad;
        this.metodo_pago = metodo_pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(int metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
}
