/* El objetivo del proyecto es usar do-while
 * Héctor Pino Montiel
 * 21/10/2024
 * */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota;
		int flag;

		flag = -1;
		do {
			System.out.print("Escribe tu nota: ");
			nota = teclado.nextInt();
			if (nota == 10) {
				flag = 1;
			}
		} while (nota >= 0 && nota <= 10);
		if (flag == 1) {
			System.out.println("Felicidades tuviste al menos 1 diez.");
		} else if (flag == -1) {
			System.out.println("No tuviste ningún diez, sigue esforzandote, ¡tú puedes!.");
		}
		teclado.close();
	}

}
