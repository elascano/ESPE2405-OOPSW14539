
package ec.edu.espe.sales.model;

/**
 *
 *  @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class Tax {
    
    public static float computeIce(float icePercentage, float amount){
        float total;
        total = amount * icePercentage / 100;
        return total;
    }
    public static float computeIva(float ivaPercentage, float amount){
        float total;
        total = amount*ivaPercentage/100;
        return total;
    }
    
    
}

