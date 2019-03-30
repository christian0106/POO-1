package Restaurante;

import Clases.Mesa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cantidad,op;
        boolean continuar=true;
        String nombre;
        Scanner dato = new Scanner(System.in);
        ArrayList<Mesa> mesas = new ArrayList<>();

        while(continuar) {
            System.out.println("Bienvenidos al Restaurate\n¿Qué desea hacer?\n\r\t 1.Crear nueva mesa\n\r\t2. Agregar un nuevo cliente a una mesa existente\n\r\t3.Pedir cuenta de una mesa");
            op=dato.nextInt();dato.nextLine();
            switch (op){
                case 1:
                    Mesa unamesa= new Mesa();
                    System.out.println("Cantidad de personas: ");
                    cantidad= dato.nextInt();dato.nextLine();
                    System.out.println("Nombre de la mesa: ");
                    nombre=dato.nextLine();
                    unamesa.setCantidad(cantidad);
                    unamesa.setNombre_mesa(nombre);
                    unamesa.crear_cliente();
                    mesas.add(unamesa);


                    break;
                case 2:
                    break;




            }
        }


    }
}
