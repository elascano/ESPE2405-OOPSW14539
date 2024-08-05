package sales;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class IVA {
    
    private static final double IVA_RATE = 0.15;
    
 
    public static double calculateIVA(double amount) {
        return amount * IVA_RATE;
    }
    
 
    public static double calculateTotalWithIVA(double amount) {
        return amount + calculateIVA(amount);
    }
    
    public static void main(String[] args) {
        double amount = 100.0;
        double iva = calculateIVA(amount);
        double total = calculateTotalWithIVA(amount);
        
        System.out.println("Monto base: $" + amount);
        System.out.println("IVA (15%): $" + iva);
        System.out.println("Monto total con IVA: $" + total);
    }
}
    

