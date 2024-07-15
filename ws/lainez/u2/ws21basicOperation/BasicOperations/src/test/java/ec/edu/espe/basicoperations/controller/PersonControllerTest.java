/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.basicoperations.controller;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author WINDOWS
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
        LocalDate birthDate = LocalDate.parse("2005-03-06");
        PersonController instance = new PersonController();
        int expResult = 7064;
        int result = instance.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of computeAgeInYears method, of class PersonController.
     */
    @org.junit.jupiter.api.Test
    public void testComputeAgeInYears() {
        System.out.println("computeAgeInYears");
        LocalDate birthDate = LocalDate.parse("2005-03-06");
        PersonController instance = new PersonController();
        int expResult = 19;
        int result = instance.computeAgeInYears(birthDate);
        assertEquals(expResult, result);
        
    }
    
}
