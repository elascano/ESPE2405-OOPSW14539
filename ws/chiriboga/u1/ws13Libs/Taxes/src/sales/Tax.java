
package sales;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class Tax {
    public static float computerIva(float ivaPercentage, float amount){
        float total;
        total = amount * ivaPercentage / 100;
        return total;
    }
    public static float computerIce(){
        //TO compute taxes
        return 0;        
    }
}
