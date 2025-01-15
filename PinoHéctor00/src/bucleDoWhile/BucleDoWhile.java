package bucleDoWhile;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int i;

		i = 0;
		do {
			System.out.print("Dime un número diferente de 0: ");
			num = teclado.nextInt();
			i++;
		} while (num != 0 && i < 20);
		if (i == 20)
			System.out.println("Superaste los intentos máximos.");
		else
			System.out.println("Exit");

		teclado.close();
	}

}
