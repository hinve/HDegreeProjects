package herencia;
import java.time.LocalDate;

public class Trabajador {
    String dni;
    String nombre;
    String apellidos;
    LocalDate fechaInicio;
    int numHijos;
    boolean cuantosTrabajadoresHay;

    public Trabajador (String dni, String nombre, String apellidos, LocalDate fechaInicio, int numHijos, boolean cuantosTrabajadoresHay) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaInicio = fechaInicio;
        this.numHijos = numHijos;
        this.cuantosTrabajadoresHay = cuantosTrabajadoresHay;
    }

    public Trabajador () {
        this("00000000V", "Hector", "Pino Montiel", LocalDate.now(), 2,true);
    }

    public String toString () {
        String resultado;
        
        resultado = new String(super.toString());
        return resultado;
    }
}
