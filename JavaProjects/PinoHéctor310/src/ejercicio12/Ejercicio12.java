/* El objetivo del proyecto es crear un array de 10 enteros, usar un bucle con X valores que
 * te pone el usuario y hacer Y cosas en funcion de la eleccion
 * Héctor Pino Montiel
 * 28/10/2024
 * */

package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		Scanner teclado = new Scanner(System.in);
		String opcion;
		int v;
		int p;
		
		do {
			System.out.println("a. Mostrar valores.");
			System.out.println("b. Introducir valor.");
			System.out.println("c. Salir.");
			opcion = teclado.nextLine();
			if(opcion.equals("a")) {
				for(int i = 0; i < numeros.length; i++) {
					System.out.println(numeros[i]);
				}
			}
			else if(opcion.equals("b")) {
				System.out.print("Dime el valor: ");
				v = teclado.nextInt();
				System.out.print("Dime la posición: ");
				p = teclado.nextInt();
				numeros[p] = v;
			}
			else {
				System.out.println("Saliendo del programa...");
			}
		} while(!opcion.equals("c"));
		System.out.println("Salió con éxito.");
		teclado.close();
	}

}
