package herencia;

public class Programador extends Trabajador {
    String lenguajesProg;
    int annosExp;
    boolean esJefeEquip;

    public String toString () {
        StringBuilder resultado;
        resultado = new StringBuilder(super.toString());
        resultado.append("\nLenguajes: ");
        resultado.append(lenguajesProg);
        resultado.append("\nAños de experiencia: ");
        resultado.append(annosExp);
        resultado.append("\nEs jefe de quipo: ");
        resultado.append(esJefeEquip);
        return resultado.toString();
    }
}
