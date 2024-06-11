package sales;

/**
 *
 * @author Yostin Sisalema,Code Masters ,DCC0-ESPE
 */
public class Tax {
    //private float ivapercentage=15.0F;
    public static float computeIva(float ivaPercentage,float amount ){
    float total;
    total=amount *ivaPercentage/100;
    return total;
    }
    
    public static float computerIva(){
        //TODO computer taxes
        return 0;
    }  
}
