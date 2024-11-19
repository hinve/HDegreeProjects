package funciones;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int resultado;
		String operador;

		System.out.println("Numero 1: ");
		num1 = teclado.nextInt();
		System.out.println("Numero 2: ");
		num2 = teclado.nextInt();
		System.out.println("Operador (+, -, *, /, %): ");
		teclado.nextLine();
		operador = teclado.nextLine();
		resultado = operador(num1, num2, operador.charAt(0));
		if (resultado == -1) {
			System.out.println("El operador esta mal puesto (+, -, *, /, %).");
		} else {
			System.out.println("El resultado es: " + resultado);
		}
		teclado.close();
	}

	public static int operador(int num1, int num2, char operador) {
		int res = 0;

		switch (operador) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / num2;
			break;
		case '%':
			res = num1 % num2;
			break;
		default:
			res = -1;
		}
		return res;
	}
}
