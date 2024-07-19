
package ec.edu.espe.basicoperations.view;

import ec.edu.espe.basicoperations.controller.BasicOperation;

/**
 *
 * @author Sjean
 */
public class BasicOperations {

    public static void main(String[] args) {
        System.out.println("Basic Operations!  \nJeancalo Santi , OOP 14539");
        System.out.println("--> Unit Testing in action <--");
        
        float addend1;
        float addend2;
        float sum;
        
        addend1 = 1.2F;
        addend2 = 2.4F;
        
        sum = BasicOperation.addTwoNumbers(addend1, addend2);
        System.out.println("The sum of  " + addend1 + "  + "  + addend2 + "  --> " + sum);
        
        addend1 = 1.5F;
        addend2 = 2.3F;
        
        sum = addend1 + addend2 ;
        
         System.out.println("The sum of  " + addend1 + "  + "  + addend2 + "  --> " + sum);
        
        addend1 = 1.8F;
        addend2 = -2.2F;
        
        sum = addend1 + addend2 ;
        
        System.out.println("The sum of  " + addend1 + "  + "  + addend2 + "  --> " + sum);
  
    }
}
