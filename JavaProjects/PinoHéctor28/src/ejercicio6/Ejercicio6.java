/* El objetivo del proyecto es usar la clase Math y bucle do-while
 * Héctor Pino Montiel
 * 15/10/2024
 * */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int num;
		do {
			System.out.print("Escribe un número: ");
			num = teclado.nextInt();
			if (num > 0) {
				System.out.println("Su cuadrado es: " + Math.pow(num, 2));
			}
		} while (num >= 0);
		teclado.close();
	}
}
