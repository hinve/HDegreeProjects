package ejercicio5;

import java.time.LocalDate;

public class Alumno {
    // Atributos de clase constantes
    private static final int limiteMaximoAlumnos = 20; // Límite máximo de alumnos permitido
    private static final int limiteModulosMatricula = 10; // Límite máximo de módulos en los que un alumno puede matricularse

    // Atributos de clase variables
    private static int numeroAlumnos; // Contador de alumnos registrados
    private static int alumnosTodoAprobado; // Contador de alumnos que han aprobado todos los módulos

    // Atributos de objeto constantes

    // Atributos de objeto variable
    private String dni; // DNI del alumno, puede estar escrito mal al matricularse
    private String nombre; // Nombre del alumno, puede estar escrito mal al matricularse
    private String apellidos; // Apellidos del alumno, pueden estar escritos mal al matricularse
    private LocalDate fechaNac; // Fecha de nacimiento del alumno, puede estar escrita mal al matricularse
    private boolean tieneBeca; // Indica si el alumno tiene beca
    private double mediaModulo; // Media de los módulos del alumno
    private int numeroModulosMatriculados; // Número de módulos en los que está matriculado el alumno
}
