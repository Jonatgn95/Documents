import java.util.Scanner;

public class Numeropairimpar {

	public static void main(String[] args) {
		int numero=12;
		
		System.out.println("Leer n�mero: ");
		Scanner in = new Scanner(System.in);
		numero = in.nextInt();
		
		
		if(numero%2==0) {
			System.out.println("El n�mero " + numero + " es par");
		} else {
			System.out.println("El n�mero " + numero + " es impar");
		}
		
		String result = "" + numero;
		result = Integer.toString(numero);
		

	}

}
