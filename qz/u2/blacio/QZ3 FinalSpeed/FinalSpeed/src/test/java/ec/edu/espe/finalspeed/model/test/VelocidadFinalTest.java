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

    @Test
    public void testCalcularVelocidadFinal1() {
        System.out.println("calcularVelocidadFinal");
        double vi = 24.0;
        double a = 5.0;
        double t = 4.0;
        double expResult = 45.0;
        double result = VelocidadFinal.calcularVelocidadFinal(vi, a, t);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularVelocidadFinal3() {
        System.out.println("calcularVelocidadFinal");
        double vi = 5.0;
        double a = 6.0;
        double t = 7.0;
        double expResult = 47.0;
        double result = VelocidadFinal.calcularVelocidadFinal(vi, a, t);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularVelocidadFinal4() {
        System.out.println("calcularVelocidadFinal");
        double vi = 10.0;
        double a = 9.0;
        double t = 8.0;
        double expResult = 72.0;
        double result = VelocidadFinal.calcularVelocidadFinal(vi, a, t);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularVelocidadFinal5() {
        System.out.println("calcularVelocidadFinal");
        double vi = 10.0;
        double a = 5.0;
        double t = 4.0;
        double expResult = 40.0;
        double result = VelocidadFinal.calcularVelocidadFinal(vi, a, t);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularVelocidadFinal6() {
        System.out.println("calcularVelocidadFinal");
        double vi = 15.0;
        double a = 3.0;
        double t = 4.0;
        double expResult = 30.0;
        double result = VelocidadFinal.calcularVelocidadFinal(vi, a, t);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularVelocidadFinal7() {
        System.out.println("calcularVelocidadFinal");
        double vi = 70.0;
        double a = 5.0;
        double t = 6.0;
        double expResult = 100.0;
        double result = VelocidadFinal.calcularVelocidadFinal(vi, a, t);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularVelocidadFinal8() {
        System.out.println("calcularVelocidadFinal");
        double vi = 90.0;
        double a = 5.0;
        double t = 4.0;
        double expResult = 110.0;
        double result = VelocidadFinal.calcularVelocidadFinal(vi, a, t);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularVelocidadFinal9() {
        System.out.println("calcularVelocidadFinal");
        double vi = 90.0;
        double a = 5.0;
        double t = 4.0;
        double expResult = 110.0;
        double result = VelocidadFinal.calcularVelocidadFinal(vi, a, t);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularVelocidadFinal10() {
        System.out.println("calcularVelocidadFinal");
        double vi = 90.0;
        double a = 5.0;
        double t = 4.0;
        double expResult = 110.0;
        double result = VelocidadFinal.calcularVelocidadFinal(vi, a, t);
        assertEquals(expResult, result, 0);
    }

}
