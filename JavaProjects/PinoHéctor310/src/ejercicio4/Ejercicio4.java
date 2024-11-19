/* El objetivo del proyecto es sacar la suma de los negativos y de los positivos por separado de un array de enteros
 * Héctor Pino Montiel
 * 24/10/2024
 * */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[20];
		int sumaNeg = 0;
		int sumaPos = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Escribe el %d número: ", i);
			numeros[i] = teclado.nextInt();
			if (numeros[i] > 0) {
				sumaPos += numeros[i];
			} else if (numeros[i] < 0) {
				sumaNeg += numeros[i];
			}
		}
		System.out.println("La suma de los positivos es: " + sumaPos);
		System.out.println("La suma de los negativos es: " + sumaNeg);
		teclado.close();
	}
}
