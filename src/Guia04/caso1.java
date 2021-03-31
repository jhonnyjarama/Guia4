package Guia04;

public class caso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] nombre=new String[4];
		// asignar valores
		nombre[0]="joe castillo";
		nombre[1]="pepelucho";
		nombre[2]="dimitrio";
		nombre[3]="pele le";
		// for 
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("nombre "+(i+1)+": "+nombre[i]);
		}
		
	}

}
