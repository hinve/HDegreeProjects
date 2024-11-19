/* El objetivo del proyecto es aprender a usar la
 * clase Math
 * Héctor Pino Montiel
 * 04/10/2024
 * */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4
{
	public static void main(String[] argv)
	{
		Scanner teclado = new Scanner(System.in);
		double valor;
		
		System.out.print("Escribe un número con decimales (Ej: 12,653): ");
		valor = teclado.nextDouble();
		
		System.out.println("Ceil: " + Math.ceil(valor) + ", Floor: " + Math.floor(valor) + ", Round: " + Math.round(valor));
		
		teclado.close();
	}
}
