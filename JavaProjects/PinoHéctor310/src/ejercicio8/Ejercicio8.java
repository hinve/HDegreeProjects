/* El objetivo del proyecto es usar un bucle if/else-if y arrays para saber que numeros son mayores e iguales
 * Héctor Pino Montiel
 * 25/10/2024
 * */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int countPos = 0;
		int equalNum = 0;
		double num;
		double[] numeros = new double[100];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = Math.random();
		}
		System.out.println("Dame un número real entre 0.0 y 0.1: ");
		num = teclado.nextDouble();
		for(int i= 0; i < numeros.length; i++) {
			if(numeros[i] > num) {
				countPos++;
			}
			else if(numeros[i] == num) {
				equalNum++;
			}
		}
		System.out.printf("%d son iguales y %d son mayores.", equalNum, countPos);
		teclado.close();
	}
}
