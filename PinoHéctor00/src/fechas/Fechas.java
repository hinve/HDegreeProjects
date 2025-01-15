// Coger fecha de hoy, pedir fecha al usuario y sacar la diferencia

package fechas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import practicasPrintf.PracticasPrintf;

public class Fechas {
	public static void main(String[] args) {
		LocalDate fechaHoy = LocalDate.now();
		LocalDate fechaUsuario;
		Scanner teclado = new Scanner(System.in);
		int dia;
		int mes;
		int ano;
		
		System.out.print("Dame una fecha:\n");
		System.out.print("Dame un dia: ");
		dia = teclado.nextInt();
		System.out.print("Dame un mes: ");
		mes = teclado.nextInt();
		System.out.print("Dame un año: ");
		ano = teclado.nextInt();
		
		fechaUsuario = LocalDate.of(ano, mes, dia);
		Period diferencia = fechaUsuario.until(fechaHoy);
		System.out.printf("La diferencia en dias es: %d\n", diferencia.getDays());
        System.out.println("Diferencia en meses: " + diferencia.getMonths());
        System.out.println("Diferencia en años: " + diferencia.getYears());
        teclado.close();
	}
}
