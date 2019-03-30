package Clases;

import java.util.ArrayList;

public class Mesa {
    private int cantidad;
    private String nombre_mesa;
    private Double Total_mesa;

    //crear array clientes, hasta que se de el desvergue de los metodos

    public Mesa(){
        this.cantidad=0;
        this.nombre_mesa=null;
        this.Total_mesa=0.0;
    }

    public Mesa(int cantidad, String nombre_mesa, Double total_mesa) {
        this.cantidad = cantidad;
        this.nombre_mesa = nombre_mesa;
        Total_mesa = total_mesa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre_mesa() {
        return nombre_mesa;
    }

    public void setNombre_mesa(String nombre_mesa) {
        this.nombre_mesa = nombre_mesa;
    }

    public Double getTotal_mesa() {
        return Total_mesa;
    }

    public void setTotal_mesa(Double total_mesa) {
        Total_mesa = total_mesa;
    }
}
