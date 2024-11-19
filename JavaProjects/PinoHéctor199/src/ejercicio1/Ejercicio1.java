package ejercicio1;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Ejercicio1 {
	public enum Operaciones {
		OPERACION_1, OPERACION_2, OPERACION_3
	}

	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		double x;
		double y;
		double z;
		Operaciones op1;
		Operaciones op2;
		Operaciones op3;
		double res1;
		double res2;
		double res3;
		op1 = Operaciones.OPERACION_1;
		op2 = Operaciones.OPERACION_2;
		op3 = Operaciones.OPERACION_3;

		System.out.println("CÁLCULOS ARITMÉTICOS");
		System.out.println("--------------------");
		System.out.println("Introduzca tres números reales: ");
		System.out.print("Valor para la X: ");
		x = teclado.nextDouble();
		System.out.print("Valor para la Y: ");
		y = teclado.nextDouble();
		System.out.print("Valor para la Z: ");
		z = teclado.nextDouble();
		res1 = x / 3 + 8;
		res2 = (Math.pow(x, 2) / Math.pow(y, 2)) + (Math.pow(y, 2) / Math.pow(z, 2));
		res3 = (Math.pow(x, 2) + 3 * x * y + Math.pow(y, 2)) / (1 / Math.pow(x, 2));
		System.out.println("\nRESULTADO");
		System.out.println("---------");
		System.out.println(op1 + ": " + res1);
		System.out.println(op2 + ": " + res2);
		System.out.println(op3 + ": " + res3);
		teclado.close();
	}
}
