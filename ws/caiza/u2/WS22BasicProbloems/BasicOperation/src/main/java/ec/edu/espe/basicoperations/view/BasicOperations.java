/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espe.basicoperations.view;
import ec.edu.espe.basicoperations.controller.BasicOperation;
import ec.edu.espe.basicoperations.controller.PersonController;
import java.time.LocalDate;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class BasicOperations extends BasicOperation {

    public static void main(String[] args) {
        System.out.println("Basic Operations!\n Miguel Caiza, OOP 14539");
        System.out.println("--> unit testing in action <--");

        float addend1;
        float addend2;
        float sum;

        addend1 = 1.2F;
        addend2 = 2.4F;
        
        sum = BasicOperation.addTwoNumbers(addend1, addend2);
        System.out.println("The sum of" + addend1 + " + " + addend2 + " --> " + sum);

        addend1 = 1.3F;
        addend2 = 2.5F;

        sum = BasicOperation.addTwoNumbers(addend1, addend2);

        System.out.println("The sum of " + addend1 + " + " + addend2 + " --> " + sum);
        
        addend1 = 1.8F;
        addend2 = -2.2F;
        
        sum = BasicOperation.addTwoNumbers(addend1, addend2);
        
        System.out.println("The sum of " + addend1 + " + " + addend2 + " --> " + sum);
        
        PersonController personController = new PersonController();
        
        LocalDate bornOnDate;
        bornOnDate = LocalDate.parse("2004-04-25");
        int days;
        
        days = personController.computeAgeInDays(bornOnDate);
        
        System.out.println("My days are --> " + days);
        
        int numberOfYears = personController.computeAgeInyears(bornOnDate);
        System.out.println("My age in years --> " + numberOfYears);
    }

}
