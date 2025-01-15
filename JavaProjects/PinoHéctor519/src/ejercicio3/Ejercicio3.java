/* El objetivo del proyecto es usar las excepciones para tener
 * control de los inputs del usuario
 * Héctor Pino Montiel
 * 29/11/2024
 * */

package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] vector = new double[5];
		
		vector = tratamientoExcepciones(vector, teclado);
		teclado.close();
	}
	
	public static double[] tratamientoExcepciones(double[] vector, Scanner teclado) {
		boolean flag = true;
		int i = 0;
		
		do {
			try {
				flag = true;
				while(i < vector.length) {
					System.out.print("Escribe un número con decimales: ");
					vector[i++] = teclado.nextDouble();
				}
			} catch (InputMismatchException excepcion1) {
				flag = false;
				System.out.println("Valor introducido incorrecto.");
				teclado.nextLine();
				i--;
			} catch (ArithmeticException excepcion2) {
				System.out.println("Error aritmético.");
				i--;
			} catch (Exception excepcion3) {
				System.out.println("Ha surgido un error inesperado.");
				i--;
			}
		} while (flag == false);
		
		return vector;
	}

}
