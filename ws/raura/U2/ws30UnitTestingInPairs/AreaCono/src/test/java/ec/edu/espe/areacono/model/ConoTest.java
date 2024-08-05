/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.areacono.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */

public class ConoTest {

    @Test
    public void testCalcularAreaLateral() {
        Cono cono = new Cono(3, 4);
        double resultado = cono.calcularAreaLateral();
        double esperado = Math.PI * 3 * 5; // 5 es la generatriz calculada como sqrt(3^2 + 4^2)
        assertEquals(esperado, resultado, 0.001);
    }

    @Test
    public void testCalcularAreaTotal() {
        Cono cono = new Cono(3, 4);
        double resultado = cono.calcularAreaTotal();
        double areaBase = Math.PI * Math.pow(3, 2);
        double areaLateral = Math.PI * 3 * 5;
        double esperado = areaBase + areaLateral;
        assertEquals(esperado, resultado, 0.001);
    }

    // Pruebas que lo hagan fallar
    @Test
    public void testRadioNegativo() {
        Cono instance = new Cono(-3.0, 4.0);
        double expResult = -1.0; // Un resultado incorrecto intencionalmente para hacer que falle la prueba
        double result = instance.calcularAreaTotal();
        assertEquals(expResult, result, 0.001);
    }

    @Test
    public void testAlturaNegativa() {
        Cono instance = new Cono(3.0, 4.0);
        double expResult = 75.39; // Un resultado incorrecto intencionalmente para hacer que falle la prueba
        double result = instance.calcularAreaTotal();
        assertEquals(expResult, result, 0.001);
    }

    // Pruebas adicionales
    @Test
    public void testRadioCero() {
        Cono cono = new Cono(0, 4);
        double resultado = cono.calcularAreaTotal();
        double esperado = 0;
        assertEquals(esperado, resultado, 0.001);
    }

    @Test
    public void testAlturaCero() {
        Cono cono = new Cono(3, 0);
        double resultado = cono.calcularAreaTotal();
        double areaBase = Math.PI * Math.pow(3, 2);
        double areaLateral = Math.PI * 3 * 3; // Generatriz es igual al radio cuando la altura es cero
        double esperado = areaBase + areaLateral;
        assertEquals(esperado, resultado, 0.001);
    }

    @Test
    public void testValoresGrandes() {
        Cono cono = new Cono(1000, 2000);
        double resultado = cono.calcularAreaTotal();
        double areaBase = Math.PI * Math.pow(1000, 2);
        double areaLateral = Math.PI * 1000 * Math.sqrt(Math.pow(1000, 2) + Math.pow(2000, 2));
        double esperado = areaBase + areaLateral;
        assertEquals(esperado, resultado, 0.001);
    }

    @Test
    public void testValoresPequeños() {
        Cono cono = new Cono(0.001, 0.002);
        double resultado = cono.calcularAreaTotal();
        double areaBase = Math.PI * Math.pow(0.001, 2);
        double areaLateral = Math.PI * 0.001 * Math.sqrt(Math.pow(0.001, 2) + Math.pow(0.002, 2));
        double esperado = areaBase + areaLateral;
        assertEquals(esperado, resultado, 0.001);
    }

    @Test
    public void testValoresNormales() {
        Cono cono = new Cono(7, 9);
        double resultado = cono.calcularAreaTotal();
        double areaBase = Math.PI * Math.pow(7, 2);
        double areaLateral = Math.PI * 7 * Math.sqrt(Math.pow(7, 2) + Math.pow(9, 2));
        double esperado = areaBase + areaLateral;
        assertEquals(esperado, resultado, 0.001);
    }

    @Test
    public void testValoresIrracionales() {
        Cono cono = new Cono(Math.sqrt(2), Math.sqrt(3));
        double resultado = cono.calcularAreaTotal();
        double areaBase = Math.PI * Math.pow(Math.sqrt(2), 2);
        double areaLateral = Math.PI * Math.sqrt(2) * Math.sqrt(Math.pow(Math.sqrt(2), 2) + Math.pow(Math.sqrt(3), 2));
        double esperado = areaBase + areaLateral;
        assertEquals(esperado, resultado, 0.001);
    }
}
