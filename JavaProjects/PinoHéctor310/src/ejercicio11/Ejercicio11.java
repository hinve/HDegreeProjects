/* El objetivo del proyecto usar bucles para rellenar
 * arrays de menor a mayor y viceversa.
 * Héctor Pino Montiel
 * 28/10/2024
 * */

package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		int[] primerArray = new int[100];
		int[] segundoArray = new int[100];
		
		for(int i = 0; i < primerArray.length; i++) {
			primerArray[i] = i+1;
		}
		for(int i = segundoArray.length-1; i > 0; i--) {
			segundoArray[i] = i;
		}
		System.out.println("Primer array:");
		for(int i = 0; i < 100; i++) {
			System.out.printf("%d ", primerArray[i]);
		}
		System.out.println("\nSegundo array:");
		for(int i = 99; i >= 0; i--) {
			System.out.printf("%d ", segundoArray[i]+1);
		}
	}

}
