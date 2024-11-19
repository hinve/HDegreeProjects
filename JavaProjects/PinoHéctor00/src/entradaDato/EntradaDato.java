/*
 * El objetivo del proyecto es un ejemplo de entrada de datos
 * Héctor Pino Montiel
 * 01/10/2024
 */

package entradaDato;

import java.util.Scanner;

public class EntradaDato
{
	public static void main(String[] argv)
	{
		Scanner teclado = new Scanner(System.in);
		int num1, num2;

		System.out.print("Escribe un número: ");
		num1 = teclado.nextInt();
		System.out.print("Escribe otro número: ");
		num2 = teclado.nextInt();

		System.out.print("La suma de los 2 números es: " + (num1 + num2));

		teclado.close();
	}
}
