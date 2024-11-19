//pedir un numero si es negativo decir es negativo
//pedir numero hasta q me ponga un 0
package condicionales;

import java.util.Scanner;

public class Condicionales
{
	public static void main(String[] argv)
	{
		Scanner teclado = new Scanner(System.in);
		int num;
		int i;
		
		i = 0;
		while (i < 5)
		{
			System.out.print("Escribe un número: ");
			num = teclado.nextInt();
			i++;
		}
		System.out.print("Bieeeeen!!");
		teclado.close();
	}
}
