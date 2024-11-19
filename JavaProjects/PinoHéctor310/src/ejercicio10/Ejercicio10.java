/* El objetivo del proyecto es usar bucles for para 
 * pedir n numeros y hacer la media y coger el maximo
 * y el minimo, y cuantas personas están por encima 
 * o por debajo de la media
 * Héctor Pino Montiel
 * 24/10/2024
 * */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int n;
		double media = 0;
		double total;
		double max = 0;
		double min = 0;
		int countMayor = 0;
		int countMenor = 0;
		
		System.out.print("Dame el valor n: ");
		n = teclado.nextInt();
		
		Double[] alturas = new Double[n];
		total = 0;
		
		for(int i = 0; i < alturas.length; i++) {
			System.out.print("Introduce altura en metros (1,86): ");
			alturas[i] = teclado.nextDouble();
		}
		max = alturas[0];
		min = alturas[0];
		for(int i = 0; i < alturas.length; i++) {
			total += alturas[i];
			if (alturas[i] < min) {
				min = alturas[i];
			}
			if (alturas[i] > max) {
				max = alturas[i];
			}
		}
		media = total / alturas.length;
		System.out.printf("La altura media es: %.2f\nLa máxima es: %.2f\nLa mínima es: %.2f\n", media, max, min);
		for(int i = 0; i < alturas.length; i++) {
			if(alturas[i] < media) {
				countMenor++;
			}
			else if(alturas[i] > media) {
				countMayor++;
			}
		}
		System.out.printf("Hay %d mayores a la media y %d menores a la media.", countMayor, countMenor);
		teclado.close();
	}
}
