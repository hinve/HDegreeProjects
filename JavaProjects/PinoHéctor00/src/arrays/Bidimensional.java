// pedir notas matematicas lengua e ingles, 5 alumnos

package arrays;

import java.util.Scanner;

public class Bidimensional {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		final int ALUMNOS = 5;
		final int ASIGNATURAS = 3;
		int notas[][] = new int[ALUMNOS][ASIGNATURAS];
		double medias;
		
		medias = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Alumno: %d\n", i);
			for (int j = 0; j < notas[i].length; j++) {
				if (j == 0) {
					System.out.print("Mates: ");
				}
				else if (j == 1) {
					System.out.print("Lengua: ");
				}
				else if (j == 2) {
					System.out.print("Inglés: ");
				}
				notas[i][j] = teclado.nextInt();
			}
		}
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Alumno %d: ", i);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.printf("%d ", notas[i][j]);
				medias += (double)notas[i][j];
			}
			medias /= 3;
			System.out.printf("Media: %f\n", medias);
			medias = 0;
		}
		teclado.close();
	}
}
