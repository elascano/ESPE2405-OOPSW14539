package ec.edu.espe.hw26_singleton.view;

import ec.edu.espe.hw26_singleton.model.USTax;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class Calculator {

    public static void main(String[] args) {
        USTax tax = USTax.getInstance(); // Obtain the singleton instance of USTax
        tax.salesTotal(); // Call the salesTotal method on the USTax instance
    }
}
