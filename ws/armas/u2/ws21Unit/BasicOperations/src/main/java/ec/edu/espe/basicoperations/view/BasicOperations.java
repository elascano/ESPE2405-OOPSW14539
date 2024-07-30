package ec.edu.espe.basicoperations.view;

import ec.edu.espe.basicoperations.controller.BasicOperation;
import ec.edu.espe.basicoperations.controller.PersonController;
import java.time.LocalDate;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class BasicOperations {

    public static void main(String[] args) {
        System.out.println("Basic Operations! \nJoffre Gomez, OOP 14539");
        System.out.println("--> Unit Testing in Action <---");

        float addend1;
        float addend2;
        float sum;

        addend1 = 1.2F;
        addend2 = 2.4F;

        sum = BasicOperation.addTwoNumbers(addend1, addend2);

        System.out.println("The sum of " + addend1 + " + " + addend2 + " --> " + sum);

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
        bornOnDate = LocalDate.parse("2005-08-03");
        int days;
        
        days = personController.computeAgeInDays(bornOnDate);
        
        System.out.println("my days are -->" + days);

        int numberOfYears = personController.computeAgeInYears(bornOnDate);
        
        System.out.println("my age in years --> " + numberOfYears);
    }

}
