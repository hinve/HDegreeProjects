/* El objetivo del proyecto es aprender a hacer el exponente sin métodos ni el operador ^
 * Héctor Pino Montiel
 * 21/10/2024
 * */

package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		int b;
		int resultado;

		System.out.print("Escribe el valor A: ");
		a = teclado.nextInt();
		System.out.print("Escribe el valor B: ");
		b = teclado.nextInt();
		resultado = 1;

		while (b > 0) {
			resultado *= a;
			b--;
		}

		System.out.println("El valor de A elevado a B es: " + resultado);
		teclado.close();
	}

}
