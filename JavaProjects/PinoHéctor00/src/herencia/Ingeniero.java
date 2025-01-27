package herencia;

public class Ingeniero extends Trabajador {
    boolean senior;
    boolean directivo;

    public String toString () {
        StringBuilder resultado;
        resultado = new StringBuilder(super.toString());
        resultado.append("\nEs senior: ");
        resultado.append(senior);
        resultado.append("\nEs directivo: ");
        resultado.append(directivo);
        return resultado.toString();
    }
}
