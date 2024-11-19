// pedir dia de la semana en numero, y lo damos en letras 1 == lunes 2 == martes

package condicionales;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiaDeLaSemana {

	public static void main(String[] argv)
	{
		Scanner teclado = new Scanner(System.in);
		List<String> diaSemana = new ArrayList<String>();
			diaSemana.add("LUNES");
			diaSemana.add("MARTES");
			diaSemana.add("MIERCOLES");
			diaSemana.add("JUEVES");
			diaSemana.add("VIERNES");
			diaSemana.add("SABADO");
			diaSemana.add("DOMINGO");
			
		int diaEnNum;
		
		System.out.print("Dame un número entre 0 y 8: ");
		diaEnNum = teclado.nextInt();
		if (diaEnNum < 0 || diaEnNum > 7)
		{
			System.out.println("Eso no es lo que yo te he dicho!!!");
		}
		else
		{
			System.out.println("Ese número es: " + diaSemana.get(diaEnNum - 1));
		}
		
		teclado.close();
	}
}
