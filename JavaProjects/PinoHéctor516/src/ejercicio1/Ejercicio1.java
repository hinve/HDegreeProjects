/* El objetivo del proyecto es usar millones de excepciones,
 * pero lo principal es hacer uso de una libreria que nos
 * proporciona el ejercicio para poder usar la clase CuentaBancaria
 * Héctor Pino Montiel
 * 02/12/2024
 * */

package ejercicio1;

import java.time.DateTimeException;
import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio1 {
	public static void main(String[] args) {
		CuentaBancaria cuentaPrivada = null;
		CuentaBancaria cuentaConjunta = null;
		CuentaBancaria cuentaFamiliar = null;

		System.out.printf("USANDO CUENTAS BANCARIAS\n");
		System.out.printf("------------------------\n");
		System.out.printf("Fecha actual: %s\n", LocalDate.now());
		System.out.println();
		System.out.printf("Creación de cuentas (constructores)\n");
		System.out.printf("-----------------------------------\n");
		System.out.printf("Intentando crear cuenta privada con una fecha no válida.\n");
		// Excepciones
		try {
			cuentaPrivada = new CuentaBancaria(10000, LocalDate.of(2027, 12, 10));
		} catch (IllegalArgumentException excepcion1) {
			System.out.printf("%s\n", excepcion1.getMessage());
		}
		System.out.println();
		System.out.printf("Intentando crear cuenta privada con un saldo no válido.\n");
		try {
			cuentaConjunta = new CuentaBancaria(-200);
		} catch (IllegalArgumentException exception2) {
			System.out.printf("%s\n", exception2.getMessage());
		}
		System.out.println();
		try {
			cuentaPrivada = new CuentaBancaria(1000.00, LocalDate.of(2021, 7, 1), -200.00);
			cuentaConjunta = new CuentaBancaria(200.00, LocalDate.of(2021, 7, 1));
			cuentaFamiliar = new CuentaBancaria();
		} catch (DateTimeException esesion) {
			System.out.println("El valor esta fuera de rango o la fecha es incorrecta.");
		}
		System.out.printf("Creando una cuenta privada válida con un constructor con tres parámetros...\n");
		System.out.printf("Cuenta privada creada: Id: %d - Saldo:	%.2f, - Embargada: ", cuentaPrivada.getId(),
				cuentaPrivada.getSaldo());
		if (cuentaPrivada.isEmbargada()) {
			System.out.println("Sí");
		} else {
			System.out.println("No");
		}
		System.out.println();
		System.out.printf("Creando una cuenta privada válida con un constructor con dos parámetros...\n");
		System.out.printf("Cuenta privada creada: Id: %d - Saldo:	%.2f, - Embargada: ", cuentaConjunta.getId(),
				cuentaConjunta.getSaldo());
		if (cuentaPrivada.isEmbargada()) {
			System.out.println("Sí");
		} else {
			System.out.println("No");
		}
		System.out.println();
		System.out.printf("Creando una cuenta privada válida con un constructor sin parámetros...\n");
		System.out.printf("Cuenta privada creada: Id: %d - Saldo:	%.2f, - Embargada: ", cuentaFamiliar.getId(),
				cuentaFamiliar.getSaldo());
		if (cuentaPrivada.isEmbargada()) {
			System.out.println("Sí");
		} else {
			System.out.println("No");
		}
		System.out.println();

		System.out.printf("Prueba de los getters de la cuenta privada:\n");
		System.out.printf("-------------------------------------------\n");
		System.out.printf("Id: %d\n", cuentaPrivada.getId());
		System.out.printf("Fecha de creación: %s\n", cuentaPrivada.getFechaCreacion());
		System.out.printf("Límite descubierto: %.2f\n", cuentaPrivada.getLimiteDescubierto());
		System.out.println("Está embargada: " + cuentaPrivada.isEmbargada());
		System.out.println("Está en descubierto: " + cuentaPrivada.isDescubierta());
		System.out.printf("Número de días que lleva la cuenta abierta: %d\n\n", cuentaPrivada.getDiasCuenta());

		System.out.println("Realización de operaciones sobre las cuentas");
		System.out.println("--------------------------------------------");
		try {
			cuentaFamiliar.ingresar(100);
			System.out.println("Ingresamos 100 euros en la cuenta familiar...");
		} catch (IllegalArgumentException excepcion11) {
			System.out.println("No puede ser negativo.");
		} catch (IllegalStateException excepcion12) {
			System.out.println("Has superado el sueldo máximo con este ingreso: Vuelve a intentarlo con menos plata.");
		}

		try {
			cuentaConjunta.extraer(100);
			System.out.println("Extraemos 100 euros de la cuenta conjunta...");
		} catch (IllegalArgumentException excepcion53) {
			System.out.println("No puede ser negativo.");
		} catch (IllegalStateException excepcion874) {
			System.out.println(
					"Has superado el límite descubierto máximo con este ingreso: Vuelve a intentarlo con menos plata.");
		}

		try {
			cuentaPrivada.transferir(1100, cuentaFamiliar);
			System.out.println("Transferimos 1100 euros de la cuenta privada a la familiar...\n");
		} catch (IllegalArgumentException excepcion16764) {
			System.out.println("No puede ser negativo.");
		} catch (IllegalStateException excepcion99998236) {
			System.out.println(
					"Has superado el límite descubierto máximo con este ingreso: Vuelve a intentarlo con menos plata.");
		}

		System.out.println("Estado final de las cuentas:");
		System.out.println("---------------------------:");
		System.out.printf("Estado final de la cuenta privada: Id: %d - Saldo:	%.2f - Embargada: ",
				cuentaPrivada.getId(), cuentaPrivada.getSaldo());
		if (cuentaPrivada.isEmbargada()) {
			System.out.println("Sí");
		} else {
			System.out.println("No");
		}
		System.out.printf("Estado final de la cuenta conjunta: Id: %d - Saldo:	%.2f - Embargada: ",
				cuentaConjunta.getId(), cuentaConjunta.getSaldo());
		if (cuentaConjunta.isEmbargada()) {
			System.out.println("Sí");
		} else {
			System.out.println("No");
		}
		System.out.printf("Estado final de la cuenta familiar: Id: %d - Saldo:	%.2f - Embargada: ",
				cuentaFamiliar.getId(), cuentaFamiliar.getSaldo());
		if (cuentaFamiliar.isEmbargada()) {
			System.out.println("Sí");
		} else {
			System.out.println("No");
		}
	}
}
