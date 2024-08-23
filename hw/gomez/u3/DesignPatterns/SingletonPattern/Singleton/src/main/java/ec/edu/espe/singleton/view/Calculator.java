/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.controller.USTax;

/**
 *
 * @author Yostin Sisalema, Code Master, DCCO-ESPE
 */
public class Calculator {

    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        System.out.println("<-----Number of Products is --->: 5\nPrice: 10$");
        System.out.println("!!!!!!!!Total sale--------->: " + tax.salesTotal(5.0F, 10));
        USTax tax2 = USTax.getInstance();
    }
}
