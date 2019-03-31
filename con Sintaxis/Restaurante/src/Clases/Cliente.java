package Clases;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cliente {
    private String nombre;
    private int edad;
    private int metodo_pago;
    ArrayList<Bebida> bebidas = new ArrayList<>();
    ArrayList<Plato> platos = new ArrayList<>();
    Scanner dato = new Scanner(System.in);

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

    void pedir_orden(){
            int num=0;
        System.out.println("1.¿Solo Plato?\n 2.¿Solo Bebida?\n 3. Ambos");
        num=dato.nextInt();dato.nextLine();
        switch (num){
            case 1:
                pedircomida();
                break;
            case 2:
                pedirbebida();
                break;
            case 3:
                pedircomida();
                pedirbebida();
                break;
        }

    }

    private void pedircomida(){
        Random seed = new Random();
        String nombre;Double precio;
        Plato comida= new Plato();
        int op;

        System.out.println("Tipo de plato:\n\r\t1.Aperitivo\n\r\t2.Plato Fuerte\n\r\t3.Postre");
        op=dato.nextInt();dato.nextLine();

        System.out.println("Nombre del plato: ");
        nombre=dato.nextLine();
        precio=(20+(25-15))*seed.nextDouble();
        System.out.println("Precio: "+precio+"\n");

        comida.setTipo_plato(op);
        comida.setNombre(nombre);
        comida.setPrecio(precio);
        comida.setCalorias(seed.nextInt(1500));
        platos.add(comida);

    }

    private void pedirbebida(){
        Random seed= new Random();
        String nombre;Double precio;
        int op;
        Bebida bebida= new Bebida();

        if (this.edad>=18){
            System.out.println("Que tipo de bebida: \n\r\t 1. Alcoholica \n\r\t 2.No Alcoholica" );
            op=dato.nextInt();dato.nextLine();
        }
        else {
            op=2;
        }

        System.out.println("Nombre del Bebida: ");
        nombre=dato.nextLine();
        precio=(1+(4))*seed.nextDouble();
        System.out.println("Precio: "+precio+"\n");
        //precio=dato.nextDouble();dato.nextLine();
        bebida.setNombre(nombre);
        bebida.setPrecio(precio);
        bebida.setTipo_bebida(op);
        bebidas.add(bebida);
    }

}
