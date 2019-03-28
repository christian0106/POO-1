package EjercicioClase;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Orden {
    String pedido;
    Double precio;

    public void cenar(int numero){
        Scanner in = new Scanner(System.in);
        for (int i= 0 ; i<numero; i ++){
            System.out.println("Nombre plato: ");
            pedido=in.nextLine();
            System.out.println("Precio: ");
            precio=in.nextDouble(); in.nextLine();
        }
    }


}
