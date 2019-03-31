package Restaurante;

import Clases.Cliente;
import Clases.Mesa;
import Clases.Plato;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cantidad,op;
        boolean continuar=true;
        String nombre;
        String nombreM;
        Scanner dato = new Scanner(System.in);
        ArrayList<Mesa> mesas = new ArrayList<>();

        while(continuar) {
            System.out.println("Bienvenidos al Restaurate\n¿Qué desea hacer?\n\r\t1.Crear nueva mesa\n\r\t2.Agregar un nuevo cliente a una mesa existente\n\r\t3.Agregar Orden\n\r\t4.Pedir cuenta de una mesa\n\r\t5.Calorias consumidas\n\r\t6.Total actual por cliente\n\r\t7.Salir");
            op=dato.nextInt();dato.nextLine();
            switch (op){
                case 1:
                    Mesa unamesa= new Mesa();
                    System.out.println("Cantidad de personas: ");
                    cantidad= dato.nextInt();dato.nextLine();
                    System.out.println("Nombre de la mesa: ");
                    nombre=dato.nextLine().toUpperCase();
                    unamesa.setCantidad(cantidad);
                    unamesa.setNombre_mesa(nombre);
                    unamesa.crear_cliente(cantidad);
                    mesas.add(unamesa);
                    System.out.println("Mesa Ingresada!");
                    unamesa.imp_mesa();
                    break;



                case 2:
                    String nombreMe;
                    int cantidad2;
                    System.out.println("¿A que mesa desea agregar el clientes?");
                    nombreMe=dato.nextLine().toUpperCase();
                    unamesa=buscar(nombreMe,mesas);
                    System.out.println("Mesa encontrada!");
                    System.out.println("¿Cuantos clientes desea agregar a la mesa?");
                    cantidad2=dato.nextInt();dato.nextLine();
                    unamesa.crear_cliente(cantidad2);


                    break;

                case 3:
                    String valor;
                    System.out.println("¿A nombre de quién esta la mesa?");
                    valor=dato.nextLine().toUpperCase();
                    System.out.println("Mesa encontrada!");
                    unamesa=buscar(valor,mesas);
                    System.out.println("¿Nombre de la persona que va a ordenar?");
                    valor=dato.nextLine().toUpperCase();
                    unamesa.Buscar_cliente(valor);
                    break;

                case 4:
                    String valor2;
                    System.out.println("¿A nombre de quién esta la mesa?");
                    valor2=dato.nextLine().toUpperCase();
                    System.out.println("Mesa encontrada!");
                    unamesa=buscar(valor2,mesas);
                    System.out.println("El costo a pagar total es de $"+unamesa.total_mesa());
                    break;

                case 5:
                    String valor3;
                    System.out.println("Nombre del cliente: ");
                    valor3=dato.nextLine().toUpperCase();
                    buscar_cal(valor3,mesas);
                    break;

                case 6:
                    System.out.println("Nombre del cliente: ");
                    valor3=dato.nextLine().toUpperCase();
                    buscar_cuenta(valor3, mesas);

                    break;

                case 7: continuar = false;
                    break;

            }

        }



    }
     public static Mesa buscar(String dta, ArrayList<Mesa> mesas){
        Mesa puntero=null;
         for (Mesa s : mesas) {
             if( s.getNombre_mesa().equals(dta)) {
                 puntero = s;
                 break;
             }
         }
         puntero.imp_mesa();
        return puntero;
    }

    public static void buscar_cal(String dta, ArrayList<Mesa> mesas){
        int cal=0;
        for (Mesa s:mesas
             ) {
                cal=s.buscar_cal(dta);
                }
        System.out.println("La cantidad de calorias consumidas es de :  "+cal);
    }

    public static void buscar_cuenta(String dta,ArrayList<Mesa> mesas){
        Double total=0.0 ;
        for (Mesa a: mesas
             ) {
            total=a.cuenta_personal(dta);
        }
        System.out.println("El total a pagar de "+dta+" es de $"+total);
    }

}

