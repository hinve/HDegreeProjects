/* El objetivo del proyecto es 
 * Héctor Pino Montiel
 * 06/11/2024
 * */

package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir al usuario los valores N y M
		System.out.print("Introduce el tamaño del array (N): ");
		int n = teclado.nextInt();

		System.out.print("Introduce el valor a almacenar en el array (M): ");
		int m = teclado.nextInt();

		// Crear el array de tamaño N
		int[] array = new int[n];

		// Llenar el array con el valor M
		for (int i = 0; i < n; i++) {
			array[i] = m;
		}

		// Mostrar el array por pantalla
		System.out.println("Array creado:");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posición " + i + ": " + array[i]);
		}

		// Cerrar el scanner
		teclado.close();
	}
}
