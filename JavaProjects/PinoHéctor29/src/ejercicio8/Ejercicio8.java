/* El objetivo del proyecto es usar do-while
 * Héctor Pino Montiel
 * 21/10/2024
 * */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int flagNegativos;
		int flagPositivos;

		flagNegativos = 0;
		flagPositivos = 0;

		do {
			System.out.print("Escribe un número: ");
			numero = teclado.nextInt();
			if (numero < 0) {
				flagNegativos++;
			} else if (numero > 0) {
				flagPositivos++;
			}
		} while (numero != 0);
		if (flagNegativos > 0) {
			System.out.println("Has puesto por lo menos uno negativo.");
		}
		System.out.printf("%d positivos.\n%d negativos.", flagPositivos, flagNegativos);
		teclado.close();
	}
}
