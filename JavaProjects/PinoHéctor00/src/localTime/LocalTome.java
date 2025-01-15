// pedir minutos horas y segundo al user, comparar con .now y damos un periodo de tiempo en horas

package localTime;

import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LocalTome {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int horas;
        int minutos;
        int segundos;
        
        // Variables para almacenar la hora actual y la hora ingresada por el usuario
        LocalTime horaUsuario;
        LocalTime horaAhora = LocalTime.now();
        
        // Mostrar la hora actual
        System.out.println("La hora actual es: " + horaAhora);
        
        // Solicitar al usuario la hora, minutos y segundos
        try {
            System.out.print("Dame la hora (0-23): ");
            horas = teclado.nextInt();
            // Validación de hora
            if (horas < 0 || horas > 23) {
                System.out.println("La hora debe estar entre 0 y 23.");
                return;
            }
            
            System.out.print("Dame los minutos (0-59): ");
            minutos = teclado.nextInt();
            // Validación de minutos
            if (minutos < 0 || minutos > 59) {
                System.out.println("Los minutos deben estar entre 0 y 59.");
                return;
            }
            
            System.out.print("Dame los segundos (0-59): ");
            segundos = teclado.nextInt();
            // Validación de segundos
            if (segundos < 0 || segundos > 59) {
                System.out.println("Los segundos deben estar entre 0 y 59.");
                return;
            }
            
            // Crear la hora ingresada por el usuario
            horaUsuario = LocalTime.of(horas, minutos, segundos);
            
            // Mostrar la hora ingresada por el usuario
            System.out.println("La hora ingresada es: " + horaUsuario);
            
            // Calcular la diferencia en varias unidades
            long diferenciaSegundos = horaAhora.until(horaUsuario, ChronoUnit.SECONDS);
            long diferenciaMinutos = horaAhora.until(horaUsuario, ChronoUnit.MINUTES);
            long diferenciaHoras = horaAhora.until(horaUsuario, ChronoUnit.HOURS);
            
            // Mostrar la diferencia en segundos, minutos y horas
            System.out.println("La diferencia en segundos es: " + diferenciaSegundos);
            System.out.println("La diferencia en minutos es: " + diferenciaMinutos);
            System.out.println("La diferencia en horas es: " + diferenciaHoras);
            
            // Si la diferencia en horas es negativa, podemos indicar que la hora ingresada es del día siguiente
            if (diferenciaHoras < 0) {
                System.out.println("La hora ingresada es en el día siguiente.");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Asegúrate de ingresar números enteros.");
        } finally {
            // Cerrar el scanner
            teclado.close();
        }
    }
}
