//edad entera transformar a decimal
//edad en decimal transformar a int

package casteo;

import java.util.Scanner;

public class Casteo
{
	public static void main(String[] argv)
	{
		Scanner teclado = new Scanner(System.in);
		int edad;
		double edadDecimal;
		
		edadDecimal = 15.50d;
		
		edad = (int)edadDecimal;
		System.out.println(edad);
		teclado.close();
	}
}
