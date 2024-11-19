/* El objetivo del proyecto es usar la clase Math.random y bucle do-while
 * Héctor Pino Montiel
 * 16/10/2024
 * */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numSecreto;
		int num;

		numSecreto = (int) (Math.random() * 10);
		do {
			System.out.println("Escribe un número: ");
			num = teclado.nextInt();
			if (num > numSecreto) {
				System.out.println("mayor");
			} else if (num < numSecreto) {
				System.out.println("menor");
			} else {
				System.out.println("Ganaste!!");
			}
		} while (num != numSecreto);
		teclado.close();
	}

}
