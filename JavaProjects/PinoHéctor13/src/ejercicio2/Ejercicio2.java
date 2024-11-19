/* El objetivo del proyecto es aprender a hacer
 * cálculos e imprimir por pantalla los resultados
 * Héctor Pino Montiel
 * 04/10/2024
 * */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2
{
	public static void main(String[] argv)
	{
		Scanner teclado = new Scanner(System.in);
		double pesetas;
		double euros;
		
		System.out.print("Escribe cuantos euros quieres convertir: ");
		euros = teclado.nextDouble();
		pesetas = (166386 * euros) / 1000;
		System.out.print("Tienes " + pesetas + " pesetas.");
		
		System.out.print("\nEscribe cuantas pesetas quieres convertir: ");
		pesetas = teclado.nextDouble();
		euros = (0.00601 * pesetas) / 1;
		System.out.print("Tienes " + euros + " euros.");
		
		teclado.close();
	}
}
