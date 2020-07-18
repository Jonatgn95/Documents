package Clase1;

public class SumaVectores {

	public static void main(String[] args) {
		
		int[] v1 = new int[] {
				10,3,6,8,-9,19,-20,10,17,200
		};
		int[] v2 = new int[] {
				6,-3,10,112,-9,50,-20,3,5,90
		};
		int suma1=0;
		int suma2=0;
		
		for (int i = 0; i< v1.length; i++) {
			suma1+=v1[i];
		}
		for (int i = 0; i< v2.length; i++) {
			suma2+=v2[i];
		}
		System.out.println("Vector 1: "+suma1);	
		System.out.println("Vector 1: "+suma1);	
		
		if (suma1<suma2) {
			System.out.println("El vector mayor es el 2");
		}	else if (suma1==suma2) {
			System.out.println("Los dos vectores son iguales");
		}	else {	
			System.out.println("El vector mayor es el 1");
			
		}
		// TODO Auto-generated method stub

	}

}
