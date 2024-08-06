/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.testcasemru.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author WINDOWS
 */
public class CalculateVelocityTest {
    
    public CalculateVelocityTest() {
    }

    /**
     * Test of velocity method, of class CalculateVelocity.
     */
    @Test
    public void testVelocity() {
        System.out.println("velocity");
        double distance = -5;
        double time = 0;
        CalculateVelocity instance = new CalculateVelocity();
        double expResult = 0;
        double result = instance.velocity(distance, time);
        assertEquals(expResult, result, 0);
        
    }
    
    
    
}
