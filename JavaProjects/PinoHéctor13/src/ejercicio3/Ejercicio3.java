/* El objetivo del proyecto es hacer swap de los
 * valores de num1 y num2, haciendo uso de una
 * variable auxiliar
 * Héctor Pino Montiel
 * 04/10/2024
 * */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3
{
	public static void main(String[] argv)
	{
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int aux;
		
		System.out.print("Dame num1: ");
		num1 = teclado.nextInt();
		System.out.print("Dame num2: ");
		num2 = teclado.nextInt();
		
		aux = num1;
		num1 = num2;
		num2 = aux;
		
		System.out.println("num1: " + num1);
		System.out.print("num2: " + num2);
		
		teclado.close();
	}
}
