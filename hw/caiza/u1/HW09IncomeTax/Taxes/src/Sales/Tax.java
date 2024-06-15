/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sales;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
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
        
          public static double calculateIncomeTax(double income) {
        if ((0 <= income) && (income < 11902)) {
            return 0;
            
        } else if ((11902 <= income) && (income < 14930)) {
            return (income - 11902) * 0.05;
            
        } else if ((14930 <= income) && (income < 18800)) {
            return 2998 * 0.05 + (income - 14930) * 0.10;
            
        } else if ((18800 <= income) && (income < 25930)) {
            return 2998 * 0.05 + 3880 * 0.10 + (income - 18800) * 0.15;
            
        } else if ((18800 <= income) && (income < 34330)) {
            return 2998 * 0.05 + 3880 * 0.10 + 7100 * 0.15 + (income - 25930) * 0.20;
            
        } else {
            return 2998 * 0.05 + 3880 * 0.10 + 7100 * 0.15 + 8400 * 0.20 + (income - 34330) * 0.30;
        }
    }
}

