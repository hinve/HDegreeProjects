/* El objetivo del proyecto es hacer una calculadora
 * Héctor Pino Montiel
 * 14/10/2024
 * */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int operacion;

		System.out.print("Introduzca el valor1: ");
		num1 = teclado.nextInt();
		System.out.print("Introduzca el valor2: ");
		num2 = teclado.nextInt();
		System.out.println("Indique la operación que quiere realizar (Inserte un número):");
		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multiplicación");
		System.out.println("(4) División");
		operacion = teclado.nextInt();

		switch (operacion) {
		case 1:
			System.out.println("Resultado: " + (num1 + num2));
			break;
		case 2:
			System.out.println("Resultado: " + (num1 - num2));
			break;
		case 3:
			System.out.println("Resultado: " + (num1 * num2));
			break;
		case 4:
			System.out.println("Resultado: " + (num1 / num2));
			break;
		default:
			System.out.println("Número incorrecto.");
		}

		teclado.close();
	}
}
