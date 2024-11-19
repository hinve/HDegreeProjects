/* El objetivo del proyecto es aprender a usar if / if else
 * Héctor Pino Montiel
 * 09/10/2024
 * */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String apellidos;
		String cicloFormativo;
		int nota;

		System.out.print("Dime tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Dime tus apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("¿Qué ciclo estás cursando?: ");
		cicloFormativo = teclado.nextLine();
		System.out.print("¿Qué nota tienes?: ");
		nota = teclado.nextInt();

		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Ciclo Formativo: " + cicloFormativo);

		if (nota >= 0 && nota < 5) {
			System.out.println("Nota académica: " + nota + " (Insuficiente)");
		} else if (nota == 5) {
			System.out.println("Nota académica: " + nota + " (Suficiente)");
		} else if (nota == 6) {
			System.out.println("Nota académica: " + nota + " (Bien)");
		} else if (nota == 7 || nota == 8) {
			System.out.println("Nota académica: " + nota + " (Notable)");
		} else if (nota == 9 || nota == 10) {
			System.out.println("Nota académica: " + nota + " (Sobresaliente)");
		}

		teclado.close();
	}

}
