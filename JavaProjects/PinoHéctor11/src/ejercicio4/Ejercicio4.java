/*
 * El objetivo del proyecto es aprender a diferenciar los distintos tipos de varibles
 * Héctor Pino Montiel
 * 24/09/2024
 */

package ejercicio4;

public class Ejercicio4
{
	public static void main(String argv[])
	{
		byte edad;
		short numOrdenadores;
		int numArboles;
		char letra;
		double litros;
		float longitud;
		String calle;
		
		edad = 43;
		numOrdenadores = 220;
		numArboles = 240324;
		letra = 'h';
		litros = 23.06d;
		longitud = 12.25f;
		calle = "Bélgica";
		
		System.out.println("Valor de tipo byte: " + edad);
		System.out.println("Valor de tipo short: " + numOrdenadores);
		System.out.println("Valor de tipo entero: " + numArboles);
		System.out.println("Valor de tipo carácter: " + letra);
		System.out.println("Valor de tipo decimal: " + litros);
		System.out.println("Valor de tipo flotante: " + longitud);
		System.out.println("Valor de tipo string: " + calle);
	}
}
