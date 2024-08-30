package ec.edu.espe.singletonpattern;

/**
 *
 * @author David Pilaguano, Lenovo , DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        UsTax tax = UsTax.getInstance();
        tax.salesTotal();
        
        UsTax tax2 = UsTax.getInstance();
        tax2.salesTotal();
    }
}
    
