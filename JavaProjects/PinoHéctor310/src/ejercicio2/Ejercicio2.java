/* El objetivo del proyecto es usar los arrays unidimensionales
 * Héctor Pino Montiel
 * 24/10/2024
 * */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int suma;
		
		suma = 0;
		System.out.println("Ponme 10 números reales: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("Número %d: ", i + 1);
			numeros[i] = teclado.nextInt();
			suma += numeros[i];
		}
		System.out.printf("Total: %d", suma);
		teclado.close();
	}
}
