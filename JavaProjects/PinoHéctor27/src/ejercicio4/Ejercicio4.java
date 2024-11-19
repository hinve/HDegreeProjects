/* El objetivo del proyecto es usar la condicion if/else
 * Héctor Pino Montiel
 * 14/10/2024
 * */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double notaMedia;

		System.out.print("Dime tu nota en Mates:");
		nota1 = teclado.nextDouble();
		System.out.print("Dime tu nota en Lengua:");
		nota2 = teclado.nextDouble();
		System.out.print("Dime tu nota en Ciencia:");
		nota3 = teclado.nextDouble();
		System.out.print("Dime tu nota en Inglés:");
		nota4 = teclado.nextDouble();

		notaMedia = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("Tu nota media es: " + notaMedia);
		System.out.println("Tu nota redondeada hacia arriba es: " + Math.ceil(notaMedia));
		System.out.println("Tu nota redondeada hacia abajo es: " + Math.floor(notaMedia));

		if (notaMedia > 8) {
			System.out.println("Puede acceder a estudios superiores.");
		} else {
			System.out.println("No puedes acceder a los estudios que deseabas.");
		}
		teclado.close();
	}
}
