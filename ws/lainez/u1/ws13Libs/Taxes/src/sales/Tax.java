/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sales;

/**
 *
 * @author WINDOWS
 */
public class Tax {
    //no es necesario poner 
    
    public static float computeIva(float ivaPercentage, float amount){
        float total;
        total = amount*ivaPercentage/100;
        return total;
    }
    
    public static float computeIce(){
        return 0;
    }
}
