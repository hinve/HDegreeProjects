/* El objetivo del proyecto es usar un bucle y contador++
 * Héctor Pino Montiel
 * 21/10/2024
 * */

package ejercicio3;

public class Ejercicio3 {
	public static void main(String[] argv) {
		for (int i = 0; i <= 200; i++) {
			if (i % 2 == 0 && i != 0) {
				System.out.printf("%d\n", i);
			}
		}
	}
}
