package forBucle;

import java.util.Scanner;

public class ForBucle {
	public static void main(String[] argv) {
		Scanner teclado = new Scanner(System.in);
		int num;
		
		num = 0;
		System.out.println("Escribe 10 números:");
		for (int i = 0; i < 10; i++) {
			num += teclado.nextInt();
		}
		System.out.println("Suma: " + num);
		teclado.close();
	}
}