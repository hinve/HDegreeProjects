/* El objetivo del proyecto es hacer una secuencia aritmética
 * con valores que te pasa el usuario
 * Héctor Pino Montiel
 * 28/10/2024
 * */

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int v;
		int it;
		int n;
		int flag;
		
		System.out.print("Ponme donde quieres que empieze la secuencia aritmética: ");
		v = teclado.nextInt();
		System.out.print("Ponme cuántos saltos quieres dar entre números: ");
		it = teclado.nextInt();
		System.out.print("Y por último los valores que quieres crear: ");
		n = teclado.nextInt();
		
		flag = it;
		
		int[] numeros = new int[n];
		
		for(int i = 0; i < numeros.length; i++) {
			it = flag;
			numeros[i] = v;
			while(it > 0) {
				v++;
				it--;
			}
		}
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("%d ", numeros[i]);
		}
		teclado.close();
	}
}
