/* El objetivo del proyecto es pedir una String, transformarla a char array e imprimirla
 * Héctor Pino Montiel
 * 12/11/2024
 * */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena;
		System.out.print("Escribe una cadena: ");
		cadena = teclado.nextLine();
		char[] cadenaChar = new char[cadena.length()];

		cadenaChar = cadena.toCharArray();
		for (int i = 0; i < cadenaChar.length; i++) {
			System.out.print(cadenaChar[i]);
		}

		teclado.close();
	}
}
