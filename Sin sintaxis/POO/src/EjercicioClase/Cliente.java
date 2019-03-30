package EjercicioClase;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cliente {
    String nomnbre;
    int edad = 0;
    int metodo_pago;

    Orden plato = new Orden();
    ArrayList<Orden> ordenes = new ArrayList<>();

    public void pedir(){
        int cantidad;
        Scanner elemento1 = new Scanner(System.in);
        cantidad = elemento1.nextInt();elemento1.nextLine();
        plato.cenar(cantidad);
        ordenes.add(plato);
    }

    public int total (){
        int suma=0;
        for (Orden plato: ordenes) {
            suma+=plato.precio;
        }
        return suma;
    }

}