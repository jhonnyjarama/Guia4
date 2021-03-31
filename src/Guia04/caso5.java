package Guia04;

import java.util.Scanner;

public class caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] arcodigo= {"A-123","A-456","A-789","A-777"};
		String[] arnombre= {"joe","pepe","fede","fifi"};
		int[] arnota= {15,8,17,11};
		
		System.out.println("busqueda de datos");
		System.out.println("codigo a buscar");
		String codigo =sc.nextLine();
		
		int pos =-1;
		for (int i = 0; i < arnota.length; i++) {
			if (codigo.equals(arcodigo[i])) {
				pos=i;
				break;
				
			}
		}
		if (pos==-1) {
			System.out.println("codigo no encontrado");
			System.out.println("\n---------------");
			System.out.println("CODIGO ENCONTRADO");
			System.out.println("-----------------");
			
		}
		else {
			System.out.println("\n---------------");
			System.out.println("CODIGO ENCONTRADO");
			System.out.println("-----------------");
			System.out.println("codigo............: " + arcodigo[pos]);
			System.out.println("nombre............: " + arnombre[pos]);
			System.out.println("nota..............: " + arnota[pos]);
		}
			
		}
	}


