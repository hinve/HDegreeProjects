/* El objetivo del proyecto es usar el bucle while y condicionales | (Tambien se puede hacer con bucle for)
 * Héctor Pino Montiel
 * 15/10/2024
 * */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int numPos;
		int numNeg;
		int cantPos;
		int cantNeg;
		int cantidadNum;
		int cantidadCeros;

		System.out.println("Escribe 10 números:");
		numPos = 0;
		cantPos = 0;
		cantNeg = 0;
		numNeg = 0;
		cantidadNum = 0;
		cantidadCeros = 0;
		while (cantidadNum < 10) {
			num = teclado.nextInt();
			if (num > 0) {
				numPos += num;
				cantPos++;
			} else if (num < 0) {
				numNeg += num;
				cantNeg++;
			} else {
				cantidadCeros++;
			}
			cantidadNum++;
		}
		System.out.println("Media números positivos: " + (numPos / cantPos));
		System.out.println("Media números negativos: " + (numNeg / cantNeg));
		System.out.println("El total de 0 es: " + cantidadCeros);
		teclado.close();
	}
}
