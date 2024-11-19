/* El objetivo del proyecto es hacer un programa que te detecte si es palíndromo o no haciendo uso de diferentes metodos de la clase String
 * Héctor Pino Montiel
 * 15/11/2024
 * */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Lerr la frase del usuario
		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine();

		// Si lo q devuelve la funcion es true imprime es palindromo si no imprime que
		// no lo es
		if (esPalindromo(frase)) {
			System.out.println("Es palíndromo");
		} else {
			System.out.println("No es palíndromo");
		}

		// Termina Scanner
		teclado.close();
	}

	// Devuelve true o false en funcion si es palindromo o no
	public static boolean esPalindromo(String frase) {
		boolean resultado;

		// Eliminar espacios y tranformar a minusculas
		String fraseSinEspacios = frase.replaceAll(" ", "").toLowerCase();
		fraseSinEspacios = removerTildes(fraseSinEspacios);

		// Invertir la frase
		String fraseInvertida = new StringBuilder(fraseSinEspacios).reverse().toString();

		// Comprobar que son iguales las 2 strings creadas
		if (fraseSinEspacios.equals(fraseInvertida)) {
			resultado = true;
		} else {
			resultado = false;
		}

		// Devuelve el resutaldo
		return resultado;
	}

	// Devuelve la frase sin tíldes
	public static String removerTildes(String cadena) {
		// Devuelve la cadena cambiando las letras con tíldes por letras sin tíldes
		return cadena.replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
	}

}
