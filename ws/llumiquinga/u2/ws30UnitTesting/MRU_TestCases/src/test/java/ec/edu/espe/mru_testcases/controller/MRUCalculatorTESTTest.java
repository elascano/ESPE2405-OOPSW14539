/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.mru_testcases.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class MRUCalculatorTESTTest {
    public MRUCalculatorTESTTest() {
    }

    /**
     * Test of calcularVelocidad method, of class MRUCalculatorTEST.
     */
      @Test
    public void testCalcularVelocidad() {
        // Caso de prueba 1
        assertEquals(10.0, MRUCalculatorTEST.calcularVelocidad(100, 10), 0.0001);

        // Caso de prueba 2
        assertEquals(1.403127, MRUCalculatorTEST.calcularVelocidad(3230, 2302), 0.0001);
        
        // Caso de prueba 3
        assertEquals(-0.0, MRUCalculatorTEST.calcularVelocidad(0, -2), 0.0001);

        // Caso de prueba 4
        assertEquals(2.5025, MRUCalculatorTEST.calcularVelocidad(10.01, 4), 0.0001);

        // Caso de prueba 5
        assertEquals(1.5, MRUCalculatorTEST.calcularVelocidad(3, 2), 0.0001);

        // Caso de prueba 6
        assertEquals(-0.235294, MRUCalculatorTEST.calcularVelocidad(4, -17), 0.0001);

        // Caso de prueba 7
        assertEquals(126.582278, MRUCalculatorTEST.calcularVelocidad(20000, 158), 0.0001);

        // Caso de prueba 8
        assertEquals(2.053486150907354, MRUCalculatorTEST.calcularVelocidad(6.02, 2.9316), 0.0001);

        // Caso de prueba 9
        assertEquals(10.0, MRUCalculatorTEST.calcularVelocidad(75, 7.5), 0.0001);

        // Caso de prueba 10
        assertEquals(10.0, MRUCalculatorTEST.calcularVelocidad(120, 12), 0.0001);
    }

    /**
     * Test of main method, of class MRUCalculatorTEST.
     */
    @Test
    public void testMain() {
        
    }
    
}
