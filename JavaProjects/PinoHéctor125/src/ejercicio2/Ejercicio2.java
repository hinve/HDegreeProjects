/* El objetivo del proyecto es usar Scanner e imprimirlo
 * Héctor Pino Montiel
 * 07/10/2024
 * */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String direccion;
		int telefono;
		
		System.out.print("¿Cuál es tu nombre?: ");
		nombre = teclado.next();
		System.out.print("¿Dónde vives?: ");
		direccion = teclado.next();
		System.out.print("¿Cuál es tu número de teléfono?: ");
		telefono = teclado.nextInt();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + telefono);
		
		teclado.close();
	}

}
