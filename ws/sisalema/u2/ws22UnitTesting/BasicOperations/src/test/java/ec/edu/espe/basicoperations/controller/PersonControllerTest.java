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
 * @author Yostin Sisalema, Code Masters, DCCO - ESPE
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
        LocalDate birthDate = LocalDate.parse("1970-12-17");
        PersonController instance = new PersonController();
        int expResult = 19562; //19546
        int result = instance.computeAgeInDays(birthDate);
        assertEquals(expResult, result);
    }

    /**
     * Test of computerAgeInyears method, of class PersonController.
     */
    @org.junit.jupiter.api.Test
    public void testComputerAgeInyears() {
        System.out.println("computerAgeInyears");
        LocalDate birthDate = LocalDate.parse("1970-12-17");
        PersonController instance = new PersonController();
        int expResult = 53;
        int result = instance.computerAgeInyears(birthDate);
        assertEquals(expResult, result);
    }
    
}
