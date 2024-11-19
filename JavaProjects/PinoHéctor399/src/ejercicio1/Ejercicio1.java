/* El objetivo del proyecto es hacer un donde está Wally usando
 * un array bidimensional como si fueran coordenadas.
 * 
 * Mi programa tiene en cuenta los números del 0 al 3 para el eje x y 0 al 4 para el eje y,
 * sigue cumpliendo la norma de las 5 filas y 4 columnas.
 * 
 * Héctor Pino Montiel
 * 18/11/2024
 * */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] argv) {
		// Inicializar variables
		int[][] tablero = new int[5][4];
		Scanner teclado = new Scanner(System.in);
		int xAleatorio = (int) Math.ceil(Math.random() * 4) - 1;
		int yAleatorio = (int) Math.ceil(Math.random() * 5) - 1;
		int contadorIntentos = 0;
		int flag = 0;

		// Este código es para comprobar los números, para acertar y ver q ocurre. Te
		// muestra las coordenadas.
		// System.out.printf("x: %d, y: %d\n", xAleatorio, yAleatorio);

		// Bucle donde compruebo que encontra a Wally o se pasa de intentos
		do {
			// Inputs Scanner
			System.out.print("Escribre la coordenada X: ");
			int x = teclado.nextInt();
			System.out.print("Escribre la coordenada Y: ");
			int y = teclado.nextInt();

			// Recorro el array para poner a Wally en su sitio (Wally == 1)
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 4; j++) {
					if (i == yAleatorio && j == xAleatorio) {
						tablero[i][j] = 1;
					} else {
						tablero[i][j] = 0;
					}
				}
			}

			// Si coinciden, felicidades terminaste el juego y activa una flag para cortar
			// el bucle.
			if (xAleatorio == x && yAleatorio == y) {
				System.out.println("Felicidades, encontraste a Wally.");
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 4; j++) {
						System.out.print(tablero[i][j]);
					}
					System.out.println();
				}
				flag = 1;
			} else {
				System.out.println("Fallaste, vuelve a intentarlo.");
			}
			contadorIntentos++;
			if (flag == 0) {
				System.out.printf("Te quedan %d intentos.\n", 4 - contadorIntentos);
			}
		} while (contadorIntentos < 4 && flag == 0); // Aquí esta la flag q corta el bucle o los intentos

		// Si llega al máximo de intentos, pierde el juego.
		if (contadorIntentos == 4) {
			System.out.println("Perdiste el juego!!\nAquí se encontraba Wally:");
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print(tablero[i][j]);
				}
				System.out.println();
			}
		}
		teclado.close();
	}
}
