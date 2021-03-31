package Guia04;

import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[] numeros =new int[5];
		int nummayor=0 ,nummenor=0 ,suma=0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("ingrese numero "+(i+1)+": ");
			numeros[i]=sc.nextInt();
			
			if (i==0) {
				nummayor=numeros[0];
				nummenor=numeros[0];
				
				
			}
			if (numeros[i]>nummayor) {
				nummayor=numeros[i];						
			}
			if (numeros[i]<nummenor) {
				nummenor=numeros[i];
				
			}
			suma+=numeros[i];
		}
		System.out.println("*********resultados*************");
		System.out.println("numero mayor :"+nummayor);
		System.out.println("numero menor :"+nummenor);
		System.out.println("sumatoria: "+suma);
	}

}
