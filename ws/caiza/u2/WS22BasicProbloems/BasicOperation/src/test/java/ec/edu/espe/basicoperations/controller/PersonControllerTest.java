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
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class PersonControllerTest {

    /**
     * Test of computeAgeInDays method, of class PersonController.
     */
    @Test
    public void testComputeAgeInDays() {
        System.out.println("computeAgeInDays");
        LocalDate birthDate = LocalDate.parse("2004-04-25");
        PersonController instance = new PersonController();
        int expResult = 7373;//7379
        int result = instance.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    /**
     * Test of computeAgeInyears method, of class PersonController.
     */
    @Test
public void testComputeAgeInyears() {
        System.out.println("computeAgeInyears");
        LocalDate birthDate = LocalDate.parse("2004-04-25");
        PersonController instance = new PersonController();
        int expResult = 20;
        int result = instance.computeAgeInyears(birthDate);
        assertEquals(expResult, result);
    }

}
