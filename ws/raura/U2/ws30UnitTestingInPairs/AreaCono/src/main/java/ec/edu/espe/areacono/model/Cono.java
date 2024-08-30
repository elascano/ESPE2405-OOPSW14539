
package ec.edu.espe.areacono.model;

/**
 *
 * @author Andrea Raura, Paradigm Pioneers Squad, DCCO-ESPE
 */
public class Cono {
    private double radio;
    private double altura;

    public Cono(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el área lateral del cono
    public double calcularAreaLateral() {
        double generatriz = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));
        return Math.PI * radio * generatriz;
    }

    // Método para calcular el área total del cono
    public double calcularAreaTotal() {
        double areaBase = Math.PI * Math.pow(radio, 2);
        double areaLateral = calcularAreaLateral();
        return areaBase + areaLateral;
    }
}
