/* El objetivo del proyecto 
 * Héctor Pino Montiel
 * 24/10/2024
 * */

package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce una cantidad de euros que sea múltiplo de 5: ");
		int cantidad;
		int cantidadFlag;
		int[] billetes = { 500, 200, 100, 50, 20, 10, 5 };
		int[] cantidadBilletes;
		cantidad = teclado.nextInt();
		cantidadFlag = cantidad;
		cantidadBilletes = new int[billetes.length];
		// Validar que la cantidad es un múltiplo de 5
		if (cantidad % 5 != 0) {
			System.out.println("La cantidad debe ser un múltiplo de 5.");
			teclado.close();
			return;
		}
		// Calcular la cantidad mínima de billetes
		for (int i = 0; i < billetes.length; i++) {
			if (cantidad >= billetes[i]) {
				cantidadBilletes[i] = cantidad / billetes[i];
				cantidad %= billetes[i];
			}
		}
		// Mostrar el resultado
		System.out.println("Para " + cantidadFlag + " € se necesitan:");
		for (int i = 0; i < billetes.length; i++) {
			if (cantidadBilletes[i] > 0) {
				System.out.println(cantidadBilletes[i] + " billete(s) de " + billetes[i] + " €");
			}
		}
		teclado.close();
	}
}
