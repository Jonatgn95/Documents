import java.util.Scanner;

public class SoloPositivos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=0;
	    while(i<5) {
		    System.out.println("Leer número (" + i + "): ");
		    int numero = in.nextInt();
		    if(numero>0)
			    System.out.println("Número " + numero);
		   
		
	   }

	}

}
