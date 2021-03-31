package Guia04;

import java.util.ArrayList;
import java.util.Scanner;

public class caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        ArrayList<String> arrNombre = new ArrayList<String>();
        ArrayList<Integer> arrEdad = new ArrayList<Integer>();

        String rp = "S", nombre = "";
        int num_reg = 0, edad = 0;
        
        while (rp.equals("S") || rp.equals("s")) {
            num_reg++;
            
            System.out.println("\n----------");
            System.out.println("REGISTRO " + num_reg);
            System.out.println("----------");
            
            System.out.print("\nNombre: ");
            nombre = sc.nextLine();
            
            System.out.print("Edad: ");
            edad = sc.nextInt();
            
            arrNombre.add(nombre);
            arrEdad.add(edad);

            sc.nextLine();
             
            rp = "";

            while (!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n")) {
                System.out.print("\n¿Continuar con tro registro <S/N>?: ");
                rp = sc.nextLine();

                if (!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n")) {
                    System.out.println("\nSolo escriba S o N");
                }

            }

        }

    }



	
}
