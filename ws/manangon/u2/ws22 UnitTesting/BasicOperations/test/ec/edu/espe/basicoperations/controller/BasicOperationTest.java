/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.basicoperations.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author IAEN
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    /**
     * Test of addTwoNumbers method, of class BasicOperation.
     */
    @Test
    public void testAddTwoNumbersNegative() {
        System.out.println("addTwoNumbers");
        float addend1 = -1.2F;
        float addend2 = -2.4F;
        float expResult = -3.6F;
        float result = BasicOperation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
        
    }
    public void testAddTwoNumbers() {
        System.out.println("addTwoNumbers");
        float addend1 = 1.2F;
        float addend2 = 2.4F;
        float expResult = 3.6F;
        float result = BasicOperation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
        
    }
    
}
