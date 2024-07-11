/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.basicoperations.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class BasicOperationTest {

    public BasicOperationTest() {
    }

    /**
     * Test of addTwoNumbers method, of class BasicOperation.
     */
    @Test
    public void testAddTwoNumbers() {
        System.out.println("addTwoNumbers");
        float addend1 = 1.4F;
        float addend2 = 2.5F;
        float expResult = 3.9F;
        float result = BasicOperation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);

    }

    @Test
    public void testAddTwoNumbersNegative() {
        System.out.println("addTwoNumbers");
        float addend1 = 1.4F;
        float addend2 = -2.5F;
        float expResult = -1.1F;
        float result = BasicOperation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testAddTwoNumbersInteger() {
        System.out.println("addTwoNumbers");
        float addend1 = 12;
        float addend2 = 3;
        float expResult = 15;
        float result = BasicOperation.addTwoNumbers(addend1, addend2);
        assertEquals(expResult, result, 0);
    }
}
