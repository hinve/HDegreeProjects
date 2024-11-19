package operadorPregunta;

import java.util.Scanner;

public class OperadorPregunta
{
	public static void main(String[] argv)
	{
		Scanner teclado = new Scanner(System.in);
		int number;
		String whatIs;
		
		System.out.print("Escribe un número: ");
		number = teclado.nextInt();
		
		whatIs = (number % 2 == 0) ? "Es par." : "Es impar.";
		
		System.out.print(whatIs);
		
		teclado.close();
	}
}
