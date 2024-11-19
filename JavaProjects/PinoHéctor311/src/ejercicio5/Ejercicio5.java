/* El objetivo del proyecto es usar matrices para almacenar datos y hacer cálculos para averiguar si hay o no brecha salarial.
 * Héctor Pino Montiel
 * 12/11/2024
 * */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);

		// Pedir el número de personas
		System.out.print("Introduce el número de personas (N): ");
		int N = teclado.nextInt();

		// Crear una matriz para almacenar género y sueldo
		double[][] sueldos = new double[N][2];

		// Recoger la información de cada persona
		for (int i = 0; i < N; i++) {
			System.out.print("Introduce el género de la persona " + (i + 1) + " (0 para varón, 1 para mujer): ");
			int genero = teclado.nextInt();
			sueldos[i][0] = genero;

			System.out.print("Introduce el sueldo de la persona " + (i + 1) + ": ");
			double sueldo = teclado.nextDouble();
			sueldos[i][1] = sueldo;
		}

		// Calcular sueldos medios
		double sumaHombres = 0;
		double sumaMujeres = 0;
		int countHombres = 0;
		int countMujeres = 0;

		for (int i = 0; i < N; i++) {
			if (sueldos[i][0] == 0) {
				sumaHombres = sumaHombres + sueldos[i][1];
				countHombres = countHombres + 1;
			} else if (sueldos[i][0] == 1) {
				sumaMujeres = sumaMujeres + sueldos[i][1];
				countMujeres = countMujeres + 1;
			}
		}

		// Calcular y mostrar los sueldos medios
		double sueldoMedioHombres;
		double sueldoMedioMujeres;

		if (countHombres > 0) {
			sueldoMedioHombres = sumaHombres / countHombres;
		} else {
			sueldoMedioHombres = 0;
		}

		if (countMujeres > 0) {
			sueldoMedioMujeres = sumaMujeres / countMujeres;
		} else {
			sueldoMedioMujeres = 0;
		}

		// Mostrar los sueldos medios
		System.out.println("Sueldo medio de hombres: " + sueldoMedioHombres);
		System.out.println("Sueldo medio de mujeres: " + sueldoMedioMujeres);

		// Detectar brecha salarial
		if (sueldoMedioHombres > sueldoMedioMujeres) {
			System.out.println("Existe una brecha salarial: los hombres ganan más que las mujeres.");
		} else if (sueldoMedioHombres < sueldoMedioMujeres) {
			System.out.println("Existe una brecha salarial: las mujeres ganan más que los hombres.");
		} else {
			System.out.println("No existe brecha salarial: ambos géneros tienen el mismo sueldo medio.");
		}

		teclado.close();
	}
}
