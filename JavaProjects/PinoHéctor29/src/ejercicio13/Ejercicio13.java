/* El objetivo del proyecto es hacer un juego con bucles y condiciones
 * Héctor Pino Montiel
 * 21/10/2024
 * */

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String opcion = null;
		String siNo;
		int numOrdenador;
		int multiplicador;
		int min;
		
		min = 0;
		System.out.println("Piensa un número entre 1 y 100, voy a intentar adivinarlo.\n¿De acuerdo? (s/n)");
		siNo = teclado.nextLine();
		multiplicador = 100;
		if (siNo.equals("s")) { // equals me compara los carácteres, como la función strcmp();(string compare) en C
			do {
				do {
					numOrdenador = (int)(Math.random() * multiplicador); // Al multiplicarlo por el multiplicador solo puedo tener en cuenta si dice es mayor que
				} while(!(numOrdenador > min)); // Esta condicion es para tener en cuenta cada vez que dice que es menor
				System.out.println("Mi número es: " + numOrdenador);
				System.out.println("¿Este número es mayor(>), menor(<) o igual(==) que tu número?");
				opcion = teclado.nextLine();
				if(opcion.equals(">")) {
					multiplicador = numOrdenador;
				}
				else if(opcion.equals("<")) {
					min = numOrdenador;
				}
				else {
					multiplicador = 100;
				}
			} while(!opcion.equals("=="));
			System.out.println("Gané :)");			
		}
		else {
			System.out.println("Vaya, pues nada no jugamos.");
		}
		teclado.close();
	}

}
