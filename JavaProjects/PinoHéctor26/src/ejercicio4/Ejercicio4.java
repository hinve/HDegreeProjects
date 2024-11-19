/* El objetivo del proyecto es hacer cálculos matemáticos
 * y usar if y else
 * Héctor Pino Montiel
 * 08/10/2024
 * */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String apellidos;
		int importe1;
		int importe2;
		int importe3;
		int importe4;
		int importeTotal;
		int importeMedio;

		System.out.print("¿Cómo te llamas?: ");
		nombre = teclado.nextLine();
		System.out.print("¿Cuáles son tus apellidos?: ");
		apellidos = teclado.nextLine();
		System.out.print("¿Cuánto te gastaste el primer mes?: ");
		importe1 = teclado.nextInt();
		System.out.print("¿Cuánto te gastaste el segundo mes?: ");
		importe2 = teclado.nextInt();
		System.out.print("¿Cuánto te gastaste el tercer mes?: ");
		importe3 = teclado.nextInt();
		System.out.print("¿Cuánto te gastaste el cuarto mes?: ");
		importe4 = teclado.nextInt();

		importeTotal = importe1 + importe2 + importe3 + importe4;

		importeMedio = importeTotal / 4;

		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Importe Gastado1: " + importe1 + " euros");
		System.out.println("Importe Gastado2: " + importe2 + " euros");
		System.out.println("Importe Gastado3: " + importe3 + " euros");
		System.out.println("Importe Gastado4: " + importe4 + " euros");
		System.out.println("\nImporte Medio: " + importeMedio + " euros");

		if (importeTotal >= 300) {
			System.out.println("\nUsted tiene un vale descuento de 50 euros.");
		} else {
			System.out.println("\nLo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de\n"
					+ "descuento.");
		}

		teclado.close();
	}
}
