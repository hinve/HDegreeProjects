/* El objetivo del proyecto es aprender a usar diferentes
 * métodos de la clase Math y prácticar con el mismo
 * Héctor Pino Montiel
 * 04/10/2024
 * */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5
{
	public static void main(String[] argv)
	{
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("Escribe un número: ");
		num1 = teclado.nextInt();
		System.out.print("Escribe otro número: ");
		num2 = teclado.nextInt();
		
		System.out.println(Math.min(num1, num2));
		System.out.println(Math.pow(num1, num2));
		System.out.println(Math.sqrt(num1));
		System.out.println(Math.random() * num2);
		
		teclado.close();
	}
}
