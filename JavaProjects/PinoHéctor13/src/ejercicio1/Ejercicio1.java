/* El objetivo del proyecto es pedir datos y hacer cálculos con ellos
 * Héctor Pino Montiel
 * 04/10/2024
 * */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1
{
	public static void main(String[] argv)
	{
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String apellidos;
		String fecha;
		double salarioBruto;
		int anyosTrabajados;
		double salarioNeto;
		double porcentajeAnyos;
		double aumento;
		
		System.out.print("Escribe tu nombre : ");
		nombre = teclado.nextLine();
		System.out.print("Escribe tus apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Escribe tu fecha de nacimiento: ");
		fecha = teclado.nextLine();
		System.out.print("Escribe tu salario bruto: ");
		salarioBruto = teclado.nextDouble();
		System.out.print("Escribe cuantos años llevas en la empresa: ");
		anyosTrabajados = teclado.nextInt();
		
		salarioNeto = salarioBruto * 0.85;
		porcentajeAnyos = anyosTrabajados * 2;
		aumento = (porcentajeAnyos / 100) * salarioNeto;
		
		System.out.print("Estimad@ " + nombre + " " + apellidos + ", su salario bruto es " + salarioBruto + ", teniendo en\n"
				+ "cuenta un IRPF del 15% su salario neto es " + salarioNeto + ".\n\n"
				+ "Debido a sus " + anyosTrabajados + " años trabajando en la\n"
				+ "empresa su salario se incrementará en un 2% por cada año. El aumento es de\n"
				+ aumento + " y el salario total es " + (aumento + salarioNeto) + ".\n");
		
		teclado.close();
	}
}
