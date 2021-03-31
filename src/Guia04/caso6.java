package Guia04;

public class caso6 {

	public static void main(String[] args) {
		//Caso 6: Defina un arreglo bidimensional (Matriz) para almacenar 2 filas y 3 columnas de datos 
		//y luego muéstrelos.
		//array bidimensional
		String[][] ab=new String[2][3];
		ab[0][0]="joe castillo";
		ab[0][1]="pepe";
		ab[0][2]="jose";
		ab[1][0]="callao";
		ab[1][1]="puente piedra";
		ab[1][2]="comas";
		
		for (int i = 0; i < ab.length; i++) {
			for (int j = 0; j < ab[0].length; j++) {
				 System.out.println(" datos : "+ab[i][j]);
			}
		}
		
		

	}

}
