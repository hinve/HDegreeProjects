/* El objetivo del proyecto usar bucles y buscar la lógica para hacer que te guarde las posiciones
 * Héctor Pino Montiel
 * 25/10/2024
 * */

package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int[] numeros = new int[100];
		int[] posiciones = new int[100];
		int j = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(1 + Math.random() * 10);
		}
		System.out.print("Dame un número real entre 1 y 10: ");
		num = teclado.nextInt();
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] == num) {
				posiciones[j++] = i;
			}
		}
		for(int i = 0; posiciones[i] != 0; i++) {
			System.out.printf("Aparece en la posición: %d\n", posiciones[i]);
		}
		
		teclado.close();
	}
}
