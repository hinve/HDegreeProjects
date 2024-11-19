 /*
 * El objetivo del proyecto es aprender sobre insertar datos
 * Héctor Pino Montiel
 * 01/10/2024
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1
{
	public static void main(String[] argv)
	{
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoLine = new Scanner(System.in);
		String nombre;
		String apellidos;
		byte edad;
		String direccion;
		double altura;
		double peso;
		
		System.out.print("¿Cuál es tu nombre?: ");
		nombre = tecladoLine.nextLine();
		System.out.print("¿Cuáles son tus apellidos?: ");
		apellidos = tecladoLine.nextLine();
		System.out.print("¿Cuántos años tienes?: ");
		edad = teclado.nextByte();
		System.out.print("¿Cuál es tu dirección?: ");
		direccion = tecladoLine.nextLine();
		System.out.print("¿Cuánto mides?: ");
		altura = teclado.nextDouble();
		System.out.print("¿Cuánto pesas?: ");
		peso = teclado.nextDouble();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad + " años");
		System.out.println("Dirección: " + direccion);
		System.out.println("Altura: " + altura + " cm");
		System.out.println("Peso: " + peso + " kg");
		
		teclado.close();
		tecladoLine.close();
	}
}
