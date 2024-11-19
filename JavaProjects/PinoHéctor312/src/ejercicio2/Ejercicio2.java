/* El objetivo del proyecto es usar los metodos equals para saber si son iguales o no.
 * Héctor Pino Montiel
 * 12/11/2024
 * */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena1;
		String cadena2;

		System.out.print("Escribe una cadena: ");
		cadena1 = teclado.nextLine();
		System.out.print("Escribe otra cadena: ");
		cadena2 = teclado.nextLine();

		if (cadena1.equals(cadena2)) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("No son iguales.");
		}
		teclado.close();
	}

}
