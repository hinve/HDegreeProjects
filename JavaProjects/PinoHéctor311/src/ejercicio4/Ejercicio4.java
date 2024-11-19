/* El objetivo del proyecto es usar matrices y valores para conseguir tener numeros maximos, minimos y la media de cada alumno.
 * Héctor Pino Montiel
 * 12/11/2024
 * */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota;

		int[][] alumnos = new int[4][5];
		int contadorAlumnos = 1;
		int contadorNotas;

		// Asigno arrays donde la posicion es el numero del alumno correspondiente
		int[] notaMin = { 10, 10, 10, 10 };
		int[] notaMax = { 0, 0, 0, 0 };
		int[] media = { 0, 0, 0, 0 };

		for (int i = 0; i < 4; i++) {
			System.out.println("Alumno " + contadorAlumnos++);
			contadorNotas = 1;
			for (int j = 0; j < 5; j++) {
				System.out.printf("Introduce la nota del %d exámen: ", contadorNotas++);
				nota = teclado.nextInt();
				alumnos[i][j] = nota;
				// Comprobar si son mayores o menores del alumno i.
				if (nota > notaMax[i]) {
					notaMax[i] = nota;
				} else if (nota < notaMin[i]) {
					notaMin[i] = nota;
				}
				media[i] += nota;
			}
		}

		contadorAlumnos = 1;
		contadorNotas = 1;
		for (int i = 0; i < 4; i++) {
			System.out.println("Alumno " + contadorAlumnos++ + ":");
			System.out.println(
					"Nota media: " + media[i] / 5 + "\nNota mínima: " + notaMin[i] + "\nNota máxima: " + notaMax[i]);
		}
		teclado.close();
	}

}
