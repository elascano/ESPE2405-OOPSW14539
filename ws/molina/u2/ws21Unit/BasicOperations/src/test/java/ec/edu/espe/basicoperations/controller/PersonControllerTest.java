
package ec.edu.espe.basicoperations.controller;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public class PersonControllerTest {
    
    public PersonControllerTest() {
    }

    /**
     * Test of computeAgeInDays method, of class PersonController.
     */
    @org.junit.jupiter.api.Test
    public void testComputeAgeInDays() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("2001-12-25");
        PersonController instance = new PersonController();
        int expResult = 8231;
        int result = instance.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of computeAgeInYears method, of class PersonController.
     */
    @org.junit.jupiter.api.Test
    public void testComputeAgeInYears() {
        System.out.println("computeAgeInyears");
        LocalDate birthDate = LocalDate.parse("2001-12-25");
        PersonController instance = new PersonController();
        int expResult = 22;
        int result = instance.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
        
    }
    
}
