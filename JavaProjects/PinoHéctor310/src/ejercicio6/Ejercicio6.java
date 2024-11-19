/* El objetivo del proyecto es asignar n posiciones en un array con m dentro de cada una de las posiciones
 * Héctor Pino Montiel
 * 24/10/2024
 * */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int n;
		int m;
		
		System.out.print("Escribe N: ");
		n = teclado.nextInt();
		System.out.print("Escribe M: ");
		m = teclado.nextInt();
		
		int[] numeros = new int[n];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = m;
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Los números son: " + numeros[i]);
		}
		teclado.close();
	}
}
