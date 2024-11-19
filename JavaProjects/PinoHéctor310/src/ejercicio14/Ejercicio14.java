/* El objetivo del proyecto es 
 * Héctor Pino Montiel
 * 28/10/2024
 * */

package ejercicio14;

public class Ejercicio14 {
	public static void main(String[] argv) {
		int countDiez = 0;
		int countNumber = 1;
		
		while(countDiez <= 10) {
			if(countNumber == 10) {
				countNumber = 1;
				countDiez++;
			}
			else {
				for(int i = 0; i < countNumber; i++) {
					System.out.printf("%d, ", countNumber);
				}				
			}
			countNumber++;
		}
	}
}
