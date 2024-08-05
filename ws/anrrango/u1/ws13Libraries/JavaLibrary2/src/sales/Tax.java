/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sales;

/**
 *
 * @author Mario Anrrango, A-Byte Wizards, DCCO - ESPE
 */
public class Tax {
     public static float computerIva(float ivaPercentage, float amount){
        float total;
        total = amount + ivaPercentage /100;
        return total;
    }
    
    public static float computerIce(){
        //to compute Taxe
        return 0;
    }
}
