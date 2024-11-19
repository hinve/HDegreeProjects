/* El objetivo del proyecto es usar un bucle for y un switch para ir contando las diferentes letras que hay en un string
 * Héctor Pino Montiel
 * 12/11/2024
 * */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine();

		frase = frase.toLowerCase();

		// Contadores para cada vocal
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;

		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			switch (letra) {
			case 'a':
				contadorA++;
				break;
			case 'e':
				contadorE++;
				break;
			case 'i':
				contadorI++;
				break;
			case 'o':
				contadorO++;
				break;
			case 'u':
				contadorU++;
				break;
			default:
				break;
			}
		}

		System.out.println("Nº de A's: " + contadorA);
		System.out.println("Nº de E's: " + contadorE);
		System.out.println("Nº de I's: " + contadorI);
		System.out.println("Nº de O's: " + contadorO);
		System.out.println("Nº de U's: " + contadorU);

		teclado.close();
	}

}
