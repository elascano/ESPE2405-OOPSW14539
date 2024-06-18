package sales;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
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
}
