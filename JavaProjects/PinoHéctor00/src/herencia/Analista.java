package herencia;

public class Analista extends Trabajador {
    String herramienta;
    int annosExp;
    boolean haSidoProgramador;

    public String toString () {
        StringBuilder resultado;
        resultado = new StringBuilder(super.toString());
        resultado.append("\nHerramienta: ");
        resultado.append(herramienta);
        resultado.append("\nAños de experiencia: ");
        resultado.append(annosExp);
        resultado.append("\nHa sido programador: ");
        resultado.append(haSidoProgramador);
        return resultado.toString();
    }
}
