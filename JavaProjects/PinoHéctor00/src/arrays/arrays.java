//declarar, dar 10 posiciones, inicializar con valores aleatorios
//entre 1 y 25

package arrays;

public class arrays {
	public static void main(String[] argv) {
		int[] nums;
		nums = new int[10];
		int randomNum;
		String[] posiciones = {"Primero", "Segundo", "Tercera", "Cuarta", "Quinta", "Sexta", "Séptima", "Octava", "Novena", "Décima"};
		
		randomNum = 0;
		// Inicializar
		for(int i = 0; i < nums.length; i++) {
			randomNum = (int)(Math.random() * 25);
			while(randomNum % 2 != 0 || randomNum == 0) {
				randomNum = (int)(Math.random() * 25);				
			}
			nums[i] = randomNum;
		}
		
		// Mostrar
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("%s: %d\n", posiciones[i], nums[i]);
		}
		
	}
}
