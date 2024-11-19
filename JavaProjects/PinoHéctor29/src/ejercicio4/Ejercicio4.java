/* El objetivo del proyecto es usar Scanner y tener en cuenta eso para continuar el programa
 * Héctor Pino Montiel
 * 21/10/2024
 * */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int numero;

		System.out.print("Escribe un número: ");
		numero = teclado.nextInt();

		for (int i = 1; i <= numero; i++) {
			System.out.printf("%d\n", i);
		}
		teclado.close();
	}
}
