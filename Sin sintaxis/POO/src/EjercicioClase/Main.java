package EjercicioClase;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        ArrayList<Mesa> mesas = new ArrayList<>();
	// write your code here
        Mesa unamesa = new Mesa();
        int i=0;
        //ArrayList<Mesa> mesas = new ArrayList<>();
        System.out.println("Cuantas personas son: ");
        i=dato.nextInt(); dato.nextLine();
        unamesa.crear_clientes(i);
        mesas.add(unamesa);


    }
}
