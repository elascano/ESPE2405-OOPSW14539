/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.basicoperation.view;

import ec.edu.espe.basicoperation.controller.BasicOperation;
import ec.edu.espe.basicoperation.controller.PersonController;
import java.time.LocalDate;

/**
 *
 * @author Leydi Oña
 */
public class BasicOperations {

    
    public static void main(String[] args) {
        System.out.println("Bsisc Operation ! \nLeydi Oña OOP 17539");
        System.out.println("--> unit Testing in action <--");
        
        float addend1;
        float addend2;
        float sum;
        addend1 = 1.2F;
        addend2 = 2.4F;
        
        sum = BasicOperation.addTwoNumbers(addend1, addend2);
        
        System.out.println("The sum of " +addend1+" + "+addend2 + "-->"+sum);
        
        addend1 = 1.3F;
        addend2 = 2.5F;
        
        sum = BasicOperation.addTwoNumbers(addend1, addend2);
        
        System.out.println("The sum of " +addend1+" + "+addend2 + "-->"+sum);
     
        addend1 = 1.8F;
        addend2 = -2.2F;
        
        sum = BasicOperation.addTwoNumbers(addend1, addend2);
        
        System.out.println("The sum of " +addend1+" + "+addend2 + "-->"+sum);
        
        PersonController personController = new PersonController();
        
        LocalDate bornOnDate;
        bornOnDate = LocalDate.parse("2001-02-31");

        int days;
        
        days = personController.computeAgeInDays(bornOnDate);
        
        System.out.println("My days are -->" +days);
        
        int numberOfYears = personController.computeAgeInDays(bornOnDate);
        
        System.out.println("My age in years--> "+ numberOfYears);
    }
    
}
