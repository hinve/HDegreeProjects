/* El objetivo del proyecto es crear una matriz y asignarle valores, multiplicarlos e imprimirlos.
 * Héctor Pino Montiel
 * 11/11/2024
 * */


package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		int operando1 = 1;
		int operando2 = 1;
		
		for(int i = 0; i < 10; i++) {
			operando2 = 1;
			for(int j = 0; j < 10; j++) {
				matriz[i][j] = operando1 * operando2;
				operando2++;
			}
			operando1++;
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.println(matriz[i][j]);
			}
		}
	}

}
