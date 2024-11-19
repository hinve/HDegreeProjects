/* El objetivo del proyecto es usar la condicion switch
 * Héctor Pino Montiel
 * 14/10/2024
 * */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int nota;

		System.out.print("Nota: ");
		nota = teclado.nextInt();

		switch (nota) {
		case 0:
			System.out.print("Estás suspenso.");
			break;
		case 1:
			System.out.print("Estás suspenso.");
			break;
		case 2:
			System.out.print("Estás suspenso.");
			break;
		case 3:
			System.out.print("Estás suspenso.");
			break;
		case 4:
			System.out.print("Estás suspenso.");
			break;
		case 5:
			System.out.print("Suficiente.");
			break;
		case 6:
			System.out.print("Bien.");
			break;
		case 7:
			System.out.print("Notable.");
			break;
		case 8:
			System.out.print("Notable.");
			break;
		case 9:
			System.out.print("Sobresaliente.");
			break;
		case 10:
			System.out.print("Sobresaliente.");
			break;
		default:
			System.out.println("Nota incorrecta.");
		}
		teclado.close();
	}
}
