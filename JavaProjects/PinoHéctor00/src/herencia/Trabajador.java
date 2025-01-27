package herencia;
import java.time.LocalDate;

public class Trabajador {
    private String dni;
    private String nombre;
    private String apellidos;
    private final LocalDate fechaInicio;
    private int numHijos;
    private int cuantosTrabajadoresHay;

    public Trabajador (String dni, String nombre, String apellidos, LocalDate fechaInicio, int numHijos, int cuantosTrabajadoresHay) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaInicio = fechaInicio;
        this.numHijos = numHijos;
        this.cuantosTrabajadoresHay++;;
    }

    public Trabajador () {
        this("00000000V", "xxx", "xxx xxx", LocalDate.now(), 2,0);
    }

    public String toString () {
        StringBuilder resultado;
        
        resultado = new StringBuilder(super.toString());
        resultado.append("\nNombre: ");
        resultado.append(nombre);
        resultado.append("\nApellidos: ");
        resultado.append(apellidos);
        return resultado.toString();
    }
}
