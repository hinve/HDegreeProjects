/* El objetivo del proyecto es crear una matriz y asignarle valores e imprimirlos.
 * Héctor Pino Montiel
 * 11/11/2024
 * */

package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		int contador = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				matriz[i][j] = contador++;
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(matriz[i][j]);
			}
		}
	}

}
