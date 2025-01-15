// coger la fecha y hora del sistema y voy a mostrarla con el
// siguiente formato: hoy es tal dia del mes tal del a;o tan y son las horas y tantos minutos

package fechas;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.UnsupportedTemporalTypeException;

public class DiasMesesYAños {

	public static void main(String[] args) {
		try {
			LocalDateTime fechaDeAhora = LocalDateTime.now();
			
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd 'del mes' LLLL 'del año' yyyy 'y son las' HH 'horas y' mm 'minutos'");
			
			System.out.println("Hoy es " + fechaDeAhora.format(formato));			
		} catch (DateTimeException excepcion1) {
			excepcion1.getMessage();
		} catch (ArithmeticException exception3) {
			exception3.getMessage();
		}
	}

}
