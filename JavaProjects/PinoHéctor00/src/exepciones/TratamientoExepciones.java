package exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamientoExepciones {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		boolean flag = true;
		
		int numero = pedirUnNumero(teclado, "Dime tu edad");
		int numeroFinal = numero + numero;
		System.out.println("La suma es: " + numeroFinal);
	}
	
	public static int pedirUnNumero(Scanner teclado, String frase) {
		boolean flag = true;
		Integer numero = 0;
		
		do {
			try {
				flag = true;
				System.out.println(frase + ": ");
				numero = teclado.nextInt();
				System.out.println("El numero es: " + numero);
			} catch (InputMismatchException excepcion1) {
				flag = false;
				System.out.println("Deberías escribir un número.");
				teclado.nextLine();
			} catch (Exception excepcion3) {
				System.out.println("Se ha producido un error.");
			}		
		} while (flag == false);
		
		return numero;
	}
}