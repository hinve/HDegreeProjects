/* El objetivo del proyecto es usar bucles para contar cuantos positivos y negativos
 * Héctor Pino Montiel
 * 21/10/2024
 * */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int flagNegativo;
		int flagPositivo;

		flagNegativo = 0;
		flagPositivo = 0;
		for (int i = 0; i < 100; ++i) {
			System.out.println("Escribe un número: ");
			num = teclado.nextInt();
			if (num < 0) {
				flagNegativo++;
			} else if (num > 0) {
				flagPositivo++;
			}
		}
		System.out.printf("Has puesto %d negativos\n", flagNegativo);
		System.out.printf("Has puesto %d positivos", flagPositivo);
		teclado.close();
	}
}
