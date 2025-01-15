//pedir DNI y Teléfono y comprobar que esta bien usando expresiones regulares

package expresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		Pattern patronDni = Pattern.compile("[0-9]{8}[TRWAGMFYNDPBCQVXZEJHKMPtrwagmfyndpbcqvxzejhkmp]{1}");
		Pattern patronTlf = Pattern.compile("[0-9]{9}");
		Scanner teclado = new Scanner(System.in);
		Matcher dni;
		Matcher tlf;
		do {
			System.out.print("Dime tu DNI: ");
			dni = patronDni.matcher(teclado.nextLine());
			System.out.print("Dime tu Teléfono (+ prefijo): ");
			tlf = patronTlf.matcher(teclado.nextLine());
		} while(!dni.matches() || !tlf.matches());
		if(dni.matches()) {
			System.out.println("DNI correcto.");
		}
		if (tlf.matches()){
			System.out.println("TLF correcto.");
		}
		teclado.close();
	}

}
