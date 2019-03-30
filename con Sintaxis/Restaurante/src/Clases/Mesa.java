package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Mesa {
    private int cantidad;
    private String nombre_mesa;
    private Double Total_mesa;
    ArrayList<Cliente> clientes =new ArrayList<>();
    //crear array clientes, hasta que se de el desvergue de los metodos

    public Mesa(){
        this.cantidad=0;
        this.nombre_mesa=null;
        this.Total_mesa=0.0;
    }

    public Mesa(int cantidad, String nombre_mesa) {
        this.cantidad = cantidad;
        this.nombre_mesa = nombre_mesa;
        //Total_mesa = total_mesa;
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

    public void crear_cliente(){
        for(int i=0; i<this.cantidad; i++){
            Scanner dato = new Scanner(System.in);
            String name=null;
            int num=0;

            Cliente uncliente = new Cliente();

            System.out.println("Nombre: ");
            name=dato.nextLine();
            System.out.println("Edad: ");
            num=dato.nextInt();dato.nextLine();
            uncliente.setEdad(num);
            uncliente.setNombre(name);
            num=0;
            System.out.println("Metodo de pago: (1. para Tarjeta 2. para Efectivo)");
            num=dato.nextInt();dato.nextLine();
            uncliente.setMetodo_pago(num);
            clientes.add(uncliente);
        }
    }

    public void imp_mesa(){
        System.out.println("\nMesa ingresada!\n nombre del anfitrion: "+this.nombre_mesa+"\nCantidad de clientes: "+this.cantidad+"\nClientes: \n");
        int num=1;
        for (Cliente s:clientes) {
            System.out.println("Cliente#"+num+" : "+s.getNombre()+"\n Edad: "+s.getEdad());
            if(s.getMetodo_pago()==1){
                System.out.println("Tarjeta\n\n");
            }
            else{
                System.out.println("Efectivo\n\n");
            }

        }

    }
}
