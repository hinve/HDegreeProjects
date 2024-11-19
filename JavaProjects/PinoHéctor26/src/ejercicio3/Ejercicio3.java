/* El objetivo del proyecto ampliar el conocimiento usando
 * condicionales
 * Héctor Pino Montiel
 * 08/10/2024
 * */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		byte edad;
		String nombre;
		String apellidos;

		System.out.print("Dime tu edad: ");
		edad = teclado.nextByte();
		teclado.nextLine();

		if (edad < 18) {
			System.out.println("No tiene la edad requerida para" + " realizar estos estudios.");
		} else {
			System.out.print("Dame tu nombre: ");
			nombre = teclado.nextLine();
			System.out.print("Dame tus apellidos: ");
			apellidos = teclado.nextLine();

			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Edad: " + edad);
			System.out.println("\nUsted ha sido admitido.");
		}
		teclado.close();
	}
}
