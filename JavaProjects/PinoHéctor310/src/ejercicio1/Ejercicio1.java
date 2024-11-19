/* El objetivo del proyecto es aprender a usar los arrays unidimensionales
 * Héctor Pino Montiel
 * 24/10/2024
 * */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];

		System.out.println("Ponme 10 números reales: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("Número %d: ", i + 1);
			numeros[i] = teclado.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("Número %d: %d, ", i+1, numeros[i]);
		}
		teclado.close();
	}
}
