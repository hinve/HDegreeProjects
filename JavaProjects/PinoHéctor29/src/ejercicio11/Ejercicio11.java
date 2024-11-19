/* El objetivo del proyecto es usar
 * Héctor Pino Montiel
 * 21/10/2024
 * */

package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		int countPar;
		int countImpar;

		countPar = 0;
		countImpar = 0;
		for (int i = 100; i <= 200; i++) {
			if (i % 2 == 0) {
				countPar += i;
				System.out.printf("%d\n", countPar);
			} else if (i % 2 != 0) {
				countImpar += i;
			}
		}
		System.out.printf("Suma pares: %d\nSuma impares: %d.", countPar, countImpar);
	}

}
