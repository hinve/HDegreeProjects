/* El objetivo del proyecto es usar las condicionales en
 * Java + operadores lógicos
 * Héctor Pino Montiel
 * 08/10/2024
 * */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		byte edad;
		byte nota;

		System.out.print("Dime tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Dime cuantos años tienes: ");
		edad = teclado.nextByte();
		System.out.print("Dime tu nota académica: ");
		nota = teclado.nextByte();

		if (edad > 18 && nota > 7) {
			System.out.print(nombre + ", usted ha sido admitido en el curso," + " cumple las condiciones requeridas.");
		} else {
			System.out.print(nombre + ", lo sentimos, no ha sido admitido en el curso"
					+ " ya que no cumple los requisitos mínimos.");
		}
		
		teclado.close();
	}
}
