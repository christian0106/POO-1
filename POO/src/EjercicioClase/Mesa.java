package EjercicioClase;

import java.util.ArrayList;
import java.util.Scanner;

public class Mesa {
    //int cantidad_gente = 0;

    public void crear_clientes (int cantidad_gente){
        ArrayList<Cliente> clientes= new ArrayList<>();
        Scanner Elemento = new Scanner(System.in);

        for (int i=0; i<cantidad_gente;i++){
            Cliente uncliente = new Cliente();
            System.out.println("Nombre cliente #"+(i+1)+": ");
            uncliente.nomnbre=Elemento.nextLine();
            System.out.println("Edad: ");
            uncliente.edad=Elemento.nextInt();Elemento.nextLine();

            boolean Continuar= true;

            while(Continuar){
                System.out.println("Metodo de pago: \n\r\t 1.Tarjeta \n\r\t 2. Efectivo");
                int dato= Elemento.nextInt(); Elemento.nextLine();
                if (dato>=1 && dato<=2){
                    uncliente.metodo_pago=dato;
                    Continuar= false;
                }
                else {
                    System.out.println("Ingrese un dato correcto");
                }
            }
            clientes.add(uncliente);

         }
    }
}
