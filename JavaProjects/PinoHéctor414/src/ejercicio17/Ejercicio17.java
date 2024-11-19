/* El objetivo del proyecto es
 * Héctor Pino Montiel
 * 15/11/2024
 * */

package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		boolean esPrimo;

		do {
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			if (num == 0) {
				System.out.println("Saliendo...");
			} else if (!esPrimo(num)) {
				System.out.println("No es primo.");
			} else if (esPrimo(num)) {
				System.out.println("Es primo.");
			}
		} while (num != 0);
	}

	// Es primo o no
	public static boolean esPrimo(int num) {
		int i = 2;
		boolean esPrimo = true;

		if (num == 1) {
			esPrimo = false;
		}
		while (i < num && esPrimo) {
			if (num % i == 0) {
				esPrimo = false;
			}
			i++;
		}

		return esPrimo;
	}
}
