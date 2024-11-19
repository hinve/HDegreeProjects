/* El objetivo del proyecto es hacer un mini algoritmo de ordenacion cogiendo el mas pequeño y el mas grande de un array de enteros
 * Héctor Pino Montiel
 * 24/10/2024
 * */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int max;
		int min;
		
		System.out.println("Ponme 10 números reales: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("Número %d: ", i + 1);
			numeros[i] = teclado.nextInt();
		}
		min = numeros[0];
		max = numeros[0];
		for (int i = 0; i < 9; i++) {
			if (numeros[i] < min) {
				min = numeros[i];
			}
			else if (numeros[i] > max) {
				max = numeros[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		teclado.close();
	}
}
