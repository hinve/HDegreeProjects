/* El objetivo del proyecto es aprender a usar condicionales
 * Héctor Pino Montiel
 * 08/10/2024
 * */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;

		System.out.print("Escribe un número: ");
		num1 = teclado.nextInt();
		System.out.print("Escribe otro número: ");
		num2 = teclado.nextInt();

		if (num1 > num2) {
			System.out.println("num1 es mayor que num2");
		} else if (num1 < num2) {
			System.out.println("num2 es mayor que num1");
		} else {
			System.out.println("Son iguales");
		}

		teclado.close();
	}
}
