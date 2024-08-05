
package sales;

/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class Tax {
    public static float computeIva(float ivaPercentage, float amount){
        float total;
        total = amount * ivaPercentage / 100;
        return total;
    }
   
    public static float computeIce(){
        //TOTAL compute taxes
        return 0;
    }
   
     public static float calculate(float salary) {
        float baseRate = 0.15f;
        return salary * baseRate;
    }
    
    public static float calculate(float salary, int dependents, String maritalStatus, float deductions) {
        float baseRate = 0.15f;
        
        
        float dependentsReduction = dependents * 1000;
        float taxableSalary = salary - dependentsReduction;
        
        if (maritalStatus.equalsIgnoreCase("married")) {
            float maritalStatusReduction = salary * 0.05f; 
            taxableSalary -= maritalStatusReduction;
        }
        
        taxableSalary -= deductions;

        if (taxableSalary < 0) {
            taxableSalary = 0;
        }
        
        float tax = taxableSalary * baseRate;
        
        return tax;
    }
}
