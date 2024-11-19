/* El objetivo del proyecto es usar un bucle y usar una flag en caso de que haya algun negativo
 * Héctor Pino Montiel
 * 21/10/2024
 * */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int flag;

		flag = -1;
		for (int i = 0; i < 100; ++i) {
			System.out.println("Escribe un número: ");
			num = teclado.nextInt();

			if (num < 0) {
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println("Has puesto un negativo.");
		} else {
			System.out.println("No has puesto ningún negativo.");
		}
		teclado.close();
	}
}
