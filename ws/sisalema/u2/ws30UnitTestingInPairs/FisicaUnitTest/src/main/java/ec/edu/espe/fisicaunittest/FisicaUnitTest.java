
package ec.edu.espe.fisicaunittest;

import static ec.edu.espe.fisicaunittest.utils.kineticEnergy.calculatekineticEnergy;
import java.util.Scanner;
/**
 *
 * @author plusm
 */
public class FisicaUnitTest {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar la masa del objeto
        System.out.print("Ingrese la masa del objeto en kilogramos (kg): ");
        double mass = scanner.nextDouble();

        // Solicitar la velocidad del objeto
        System.out.print("Ingrese la velocidad del objeto en metros por segundo (m/s): ");
        double velocity = scanner.nextDouble();

        // Calcular la energía cinética
        double kineticEnergy = calculatekineticEnergy(mass, velocity);

        // Mostrar el resultado
        System.out.println("kineticEnergy " + kineticEnergy + " joules (J).");

        scanner.close();
        
    }
}
