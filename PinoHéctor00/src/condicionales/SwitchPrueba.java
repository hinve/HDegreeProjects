package condicionales;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchPrueba {

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
		diaEnNum--;
		
		switch (diaEnNum)
		{
		case 1:
			System.out.println(diaSemana.get(diaEnNum));
			break;
		case 2:
			System.out.println(diaSemana.get(diaEnNum));
			break;
		case 3:
			System.out.println(diaSemana.get(diaEnNum));
			break;
		case 4:
			System.out.println(diaSemana.get(diaEnNum));
			break;
		case 5:
			System.out.println(diaSemana.get(diaEnNum));
			break;
		case 6:
			System.out.println(diaSemana.get(diaEnNum));
			break;
		case 7:
			System.out.println(diaSemana.get(diaEnNum));
			break;
		default:
			System.out.println("Eso no se hace");	
		}
		
		teclado.close();
	}
}