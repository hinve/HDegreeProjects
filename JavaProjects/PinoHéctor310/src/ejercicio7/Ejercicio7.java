/* El objetivo del proyecto es usar arrays y flags para conseguir imprimir en un rango
 * Héctor Pino Montiel
 * 24/10/2024
 * */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int p;
		int q;
		int count;
		int flag;

		System.out.print("Pon la p: ");
		p = teclado.nextInt();
		flag = p;
		System.out.print("Pon la q: ");
		q = teclado.nextInt();
		count = 0;
		while (p < q) {
			count++;
			p++;
		}
		int numero[] = new int[count];

		for (int i = 0; flag < q; i++) {
			numero[i] = flag;
			flag++;
		}
		for (int i = 1; i < count; i++) {
			System.out.println("Número " + i + ": " + numero[i]);
		}
		teclado.close();
	}
}
