/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.espe.ec.pitagoras.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author heiso
 */

public class TriangleControllerTest {
    
    public TriangleControllerTest() {
    }
    
    /**
     * Test of main method, of class TriangleController.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TriangleController.main(args);
    }

    /**
     * Test of validateSides method, of class TriangleController.
     */
    @Test
    public void testValidateSides() {
        System.out.println("validateSides");
        double a = 3;
        double b = 4;
        boolean expResult = true;
        boolean result = TriangleController.validateSides(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateHypotenuseAndAngles method, of class TriangleController.
     */
    @Test
    public void testCalculateHypotenuseAndAngles() {
        System.out.println("calculateHypotenuseAndAngles");
        double a = 3;
        double b = 4;
        TriangleController.calculateHypotenuseAndAngles(a, b);
    }

    /**
     * Test of calculateHypotenuse method, of class TriangleController.
     */
    @Test
    public void testCalculateHypotenuse() {
        System.out.println("calculateHypotenuse");
        double a = 3;
        double b = 4;
        double expResult = 5;
        double result = TriangleController.calculateHypotenuse(a, b);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of isRightAngle method, of class TriangleController.
     */
    @Test
    public void testIsRightAngle() {
        System.out.println("isRightAngle");
        double a = 3;
        double b = 4;
        double c = 5;
        boolean expResult = true;
        boolean result = TriangleController.isRightAngle(a, b, c);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateAngles method, of class TriangleController.
     */
    @Test
    public void testCalculateAngles() {
        System.out.println("calculateAngles");
        double a = 3;
        double b = 4;
        double[] expResult = {36.86989764584402, 53.13010235415599};
        double[] result = TriangleController.calculateAngles(a, b);
        assertArrayEquals(expResult, result, 0.001);
    }
}
