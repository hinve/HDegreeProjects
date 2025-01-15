/* El objetivo del proyecto es pedir 2 numeros y controlar la excepcion
 * de error aritmetico
 * Héctor Pino Montiel
 * 29/11/2024
 * */

package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		dividir(teclado);
		teclado.close();
	}
	
	public static void dividir(Scanner teclado) {
		boolean flag = true;
		int a = 0;
		int b = 0;
		
		do {
			try {
				flag = true;
				System.out.print("Dime el dividendo: ");
				a = teclado.nextInt();
				System.out.print("Dime el divisor: ");
				b = teclado.nextInt();
				int cociente = a / b;
				System.out.println("El cociente es: " + cociente);
			} catch (InputMismatchException excepcion1) {
				flag = false;
				System.out.println("Valor introducido incorrecto.");
				teclado.nextLine();
			} catch (ArithmeticException excepcion2) {
				System.out.println("Error aritmético.");
			} catch (Exception excepcion3) {
				System.out.println("Ha surgido un error inesperado.");
			}
		} while (flag == false);
	}
}
