/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.basicoperations.view;

import ec.edu.espe.basicoperations.controller.BasicOperation;
import ec.edu.espe.basicoperations.controller.PersonController;
import java.time.LocalDate;

/**
 *
 * @author IAEN
 */
public class BasicOperations {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Basic Operations: \nManangon Zaith, OOP 14539");
        System.out.println("-->Unit Testing in actions<--");

        float addend1;
        float addend2;
        float sum;

        addend1 = 1.2F;
        addend2 = 2.4F;
        sum = BasicOperation.addTwoNumbers(addend1, addend2);
        System.out.println("The sum of " + addend1 + " + " + addend2 + " --> " + sum);
        
        addend1=1.3F;
        addend2=2.5F;
        
        sum = BasicOperation.addTwoNumbers(addend1, addend2);
        System.out.println("The sum of "+ addend1+" + "+addend2+" --> "+sum);
        
        addend1=1.8F;
        addend2=-2.2F;
        
        sum = BasicOperation.addTwoNumbers(addend1, addend2);
        System.out.println("The sum of "+ addend1+" + "+addend2+" --> "+sum);
        
        PersonController personController= new PersonController ();
        
        LocalDate bornOnDate ;
        bornOnDate = LocalDate.parse("2004-11-20");
        
        int days; 
        
        days=personController.computeAgeInDays (bornOnDate);
        System.out.println("my age in days are --> "+ days);
        
        int numberOfYears = personController.computeAgeInYears(bornOnDate);
        System.out.println("my age in years are "+ numberOfYears);
    }

      
}
