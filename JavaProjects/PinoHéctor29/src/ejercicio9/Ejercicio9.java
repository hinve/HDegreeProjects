/* El objetivo del proyecto es hacer un bucle y sumar y multiplicar confome va aumentando i
 * Héctor Pino Montiel
 * 21/10/2024
 * */

package ejercicio9;

public class Ejercicio9 {
	public static void main(String[] argv) {
		int suma;
		int producto;

		suma = 0;
		producto = 1;
		for (int i = 1; i <= 10; i++) {
			suma += i;
			producto *= i;
		}
		System.out.printf("La suma es %d.\nEl producto es %d.", suma, producto);
	}
}
