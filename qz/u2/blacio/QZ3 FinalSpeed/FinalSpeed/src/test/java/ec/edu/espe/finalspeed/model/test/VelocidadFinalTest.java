/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.finalspeed.model.test;

import ec.edu.espe.finalspeed.model.VelocidadFinal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class VelocidadFinalTest {
    
    public VelocidadFinalTest() {
    }


    /**
     * Test of calcularVelocidadFinal method, of class VelocidadFinal.
     */
    @Test
    public void testCalcularVelocidadFinal() {
        System.out.println("calcularVelocidadFinal");
        double vi = 90.0;
        double a = 5.0;
        double t = 4.0;
        double expResult = 110.0;
        double result = VelocidadFinal.calcularVelocidadFinal(vi, a, t);
        assertEquals(expResult, result, 0);
    }
    
}
