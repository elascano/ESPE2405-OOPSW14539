/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sales;

/**
 *
 * @author CODE_CRAFTING_ENGINEERS
 */
public class Tax {

    
    public static float computeIva(float ivaPercentage, float amount) {
        float total;
        total = amount * ivaPercentage / 100;
        return total;
    }

    public static float computeIva() {
        //total compute taxes
        return 0;
    }
}
