

package ec.edu.espe.finalspeed.model;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class VelocidadFinal {

    public static double calcularVelocidadFinal(double vi, double a, double t) {
        double VF;
        VF= calcularVF(vi, a, t);
        return VF;
    }

    private static double calcularVF(double vi, double a, double t) {
        double VF;
        VF= vi + a * t;
        return VF;
    }
}


