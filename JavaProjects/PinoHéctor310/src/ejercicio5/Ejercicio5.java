/* El objetivo del proyecto muy parecido al anterior solo que tienes que dividir la suma del total entre el numero de números que hay
 * Héctor Pino Montiel
 * 24/10/2024
 * */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[3];
		int sumaNeg = 0;
		int sumaPos = 0;
		int media = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Escribe el %d número: ", i);
			numeros[i] = teclado.nextInt();
			if (numeros[i] > 0) {
				sumaPos += numeros[i];
			} else if (numeros[i] < 0) {
				sumaNeg += numeros[i];
			}
		}
		media = (sumaPos + sumaNeg) / numeros.length;
		System.out.println("La media es: " + media);
		teclado.close();
	}
}
