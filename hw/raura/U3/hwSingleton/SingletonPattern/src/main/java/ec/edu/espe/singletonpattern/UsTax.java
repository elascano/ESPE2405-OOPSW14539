package ec.edu.espe.singletonpattern;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class UsTax {
    private static UsTax instance;

    private UsTax() {
        System.out.println("Nueva instancia de USTax creada.");
    }

    public static UsTax getInstance() {
        if (instance == null) {
            instance = new UsTax();
        } else {
            System.out.println("Instancia de USTax ya existe.");
        }
        return instance;
    }

    public float salesTotal() {
        System.out.println("Calculando el total de ventas...");
        return 0.0f; 
    }
}
