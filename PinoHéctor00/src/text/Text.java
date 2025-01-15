// pedir cadena, longitud, cadena en mayuscula, en minuscula, posiciones pares en mayusculas e impares en minusculas

package text;

import java.lang.instrument.ClassFileTransformer;
import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadenita;
		System.out.print("Dame una cadenita su colega: ");
		cadenita = teclado.nextLine();
		
		System.out.printf("La longitud es: %d\n", cadenita.length());
		System.out.printf("La cadena en mayus es: %s\n", cadenita.toUpperCase());
		System.out.printf("La cadena en minus es: %s\n", cadenita.toLowerCase());
		
		System.out.print("Pares e impares: ");
		for(int i = 0; i < cadenita.length(); i++) {
			if(i % 2 == 0) {
				char letrita = cadenita.charAt(i);
				String s = String.valueOf(letrita);
				String mayus = s.toUpperCase();
				System.out.print(mayus);
			}
			else if(i % 2 != 0) {
				char letrita = cadenita.charAt(i);
				String s = String.valueOf(letrita);
				String minus = s.toLowerCase();
				System.out.print(minus);
			}
		}
		teclado.close();
	}

}
