/* El objetivo del proyecto es aprender a usar Scanner
 * Héctor Pino Montiel
 * 07/10/2024
 * */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nombre;
		
		System.out.print("¿Cómo te llamas?: ");
		nombre = teclado.next();
		
		System.out.print("Hola " + nombre);
		
		teclado.close();
	}

}
