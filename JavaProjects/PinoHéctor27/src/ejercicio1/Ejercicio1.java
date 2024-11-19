/* El objetivo del proyecto es seguir usando condicionales
 * Héctor Pino Montiel
 * 14/10/2024
 * */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String apellidos;
		byte edad;
		int salarioDeseado;
		byte añosExp;
		byte proyectosAnteriores;

		System.out.print("Dime tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Dime tus apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Dime tu edad: ");
		edad = teclado.nextByte();
		System.out.print("Dime tu salario deseado: ");
		salarioDeseado = teclado.nextInt();

		if (salarioDeseado > 30000 || edad > 45) {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
		} else {
			teclado.nextLine();
			System.out.print("Dime tus años de experiencia en el sector: ");
			añosExp = teclado.nextByte();
			System.out.print("Proyectos anteriores: ");
			proyectosAnteriores = teclado.nextByte();
			if (añosExp > 2 && proyectosAnteriores > 3) {
				System.out.println("Enhorabuena. Ha sido contratado.");
			} else {
				System.out.println("Lo sentimos pero no cumple nuestro perfil.");
			}
		}
		teclado.close();
	}

}
