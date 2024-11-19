/* El objetivo del proyecto es usar el bucle while y condicionales
 * Héctor Pino Montiel
 * 14/10/2024
 * */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int suma;
		int count;

		System.out.print("Dame solo números positivos o negativos: ");
		num = teclado.nextInt();
		if (num > 0) {
			count = 1;
		} else {
			count = 0;
		}
		suma = 0;
		while (num != 0) {
			System.out.print("Dame solo números positivos o negativos: ");
			num = teclado.nextInt();
			if (num > 0) {
				suma += num;
				count++;
			}
		}
		System.out.println("Números mayores de 0: " + count);
		if (count == 0) {
			System.out.println("La media de todos es: " + (suma / count));
		}

		teclado.close();
	}

}
