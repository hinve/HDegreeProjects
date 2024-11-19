/* El objetivo del proyecto es usar las matrices bidimensionales para pedirle al usuario un conjunto de elementos para
 * ponerlos en práctica, asignar valores, pedir valores
 * Héctor Pino Montiel
 * 11/11/2024
 * */


package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar las dimensiones de la matriz (N x M)
        System.out.print("Introduce el número de filas (N): ");
        int N = teclado.nextInt();
        System.out.print("Introduce el número de columnas (M): ");
        int M = teclado.nextInt();

        // Crear la matriz de tamaño NxM
        int[][] matriz = new int[N][M];

        // Pedir los valores para llenar la matriz
        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Valor en posición [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Contadores para los valores mayores, menores y iguales a cero
        int mayoresQueCero = 0;
        int menoresQueCero = 0;
        int igualesACero = 0;

        // Recorrer la matriz y contar los valores
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matriz[i][j] > 0) {
                    mayoresQueCero++;
                } else if (matriz[i][j] < 0) {
                    menoresQueCero++;
                } else {
                    igualesACero++;
                }
            }
        }

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("Valores mayores que cero: " + mayoresQueCero);
        System.out.println("Valores menores que cero: " + menoresQueCero);
        System.out.println("Valores iguales a cero: " + igualesACero);

        teclado.close();
	}

}
