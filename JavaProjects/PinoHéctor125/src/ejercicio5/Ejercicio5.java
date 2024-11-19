/* El objetivo del proyecto es usar bucles para hacer una pirámide
 * Héctor Pino Montiel
 * 09/10/2024
 * */

package ejercicio5;

public class Ejercicio5 {

	public static void main(String[] args) {
		int i;
		int j;
		int k;
		int altura;

		altura = 5; // Puedes probar los números que quieras a partir de 100 ya empieza a dar problemas no se porque
		i = 1;

		while (i++ <= altura) {
			j = i;
			while (j++ < altura * 2) {
				System.out.print(" ");
			}
			k = 1;
			while (k++ < (2 * i - 2)) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
