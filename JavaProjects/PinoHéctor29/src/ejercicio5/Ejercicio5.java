/* El objetivo del proyecto es sacar el número factorial
 * Héctor Pino Montiel
 * 21/10/2024
 * */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int i;
		int resultado;

		System.out.print("Escribe un número positivo: ");
		numero = teclado.nextInt();
		if (numero < 0) {
			System.out.println("Ese número no es positivo.");
			teclado.close();
			System.exit(0);
		}
		resultado = 1;
		for (i = 1; i <= numero; i++) {
			resultado *= i;
		}
		System.out.println("El número factorial es: " + resultado);
		teclado.close();
	}
}
