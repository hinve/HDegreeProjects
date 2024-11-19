/* El objetivo del proyecto es aprender a usar cadena de caracteres
 * Héctor Pino Montiel
 * 12/11/2024
 * */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String primerApellido;
		String segundoApellido;
		char[] codigo = { '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0' };

		System.out.print("Escribe tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Escribe tu primer apellido: ");
		primerApellido = teclado.nextLine();
		System.out.print("Escribe tu segundo apellido: ");
		segundoApellido = teclado.nextLine();

		char[] nombreChar = new char[nombre.length()];
		char[] primerApellidoChar = new char[primerApellido.length()];
		char[] segundoApellidoChar = new char[segundoApellido.length()];

		nombreChar = nombre.toCharArray();
		primerApellidoChar = primerApellido.toCharArray();
		segundoApellidoChar = segundoApellido.toCharArray();

		codigo[0] = nombreChar[0];
		codigo[1] = nombreChar[1];
		codigo[2] = nombreChar[2];
		codigo[3] = primerApellidoChar[0];
		codigo[4] = primerApellidoChar[1];
		codigo[5] = primerApellidoChar[2];
		codigo[6] = segundoApellidoChar[0];
		codigo[7] = segundoApellidoChar[1];
		codigo[8] = segundoApellidoChar[2];

		String nuevaString = new String(codigo).toUpperCase();

		System.out.println("El código es: " + nuevaString);
		teclado.close();
	}
}
