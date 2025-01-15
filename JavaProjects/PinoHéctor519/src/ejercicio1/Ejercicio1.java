/* El objetivo del proyecto es hacer uso de las excepciones para hacer un programa
 * que vaya mirando si es un numero o no lo que se esta introduciendo
 * Héctor Pino Montiel
 * 29/11/2024
 * */


package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a = pedirUnNumero(teclado);
		System.out.println("Valor introducido: " + a);
	}
	
	public static int pedirUnNumero(Scanner teclado) {
		boolean flag = true;
		int numero = 0;
		
		do {
			try {
				flag = true;
				System.out.print("Introduce un valor: ");
				numero = teclado.nextInt();
			} catch (InputMismatchException excepcion1) {
				flag = false;
				System.out.println("Valor introducido incorrecto.");
				teclado.nextLine();
			} catch (Exception excepcion3) {
				System.out.println("Se ha producido un error.");
			}		
		} while (flag == false);
		
		return numero;
	}
}
