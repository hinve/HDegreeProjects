 /*
 * El objetivo del proyecto es aprender sobre insertar datos e imprimir con decoración
 * Héctor Pino Montiel
 * 01/10/2024
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2
{
	public static void main(String[] argv)
	{
		Scanner		teclado = new Scanner(System.in);
		Scanner 	tecladoLine = new Scanner(System.in);
		String 		nombreEquipo;
		int 		fundacion;
		String 		nombreEstadio;
		String 		nombreCapitan;
		
		System.out.print("Escribe el nombre del equipo: ");
		nombreEquipo = tecladoLine.nextLine();
		System.out.print("Escribe el año de fundación: ");
		fundacion = teclado.nextInt();
		System.out.print("Escribe el nombre del estadio: ");
		nombreEstadio = tecladoLine.nextLine();
		System.out.print("Escribe el nombre del capitán: ");
		nombreCapitan = tecladoLine.nextLine();
		
		System.out.println("**********************************************************************************************");
		System.out.println("*******Nombre del Equipo: " + nombreEquipo + "************************************************");
		System.out.println("*******Fundado en: " + fundacion + "**********************************************************");
		System.out.println("*******Estadio: " + nombreEstadio + "*********************************************************");
		System.out.println("*******Capitán: " + nombreCapitan + "*********************************************************");
		
		teclado.close();
		tecladoLine.close();
	}
}
