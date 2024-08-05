/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sales;

/**
 *
 * @author IAEN
 */
public class Tax {
    public static float computeIva(float ivaPercentage, float amount){
    float total;
    total = amount * ivaPercentage/100;
    return total;        
    
    
    }
    
    public static float computeIce(){
        //compute taxes
        return 0;
        
    }
}
