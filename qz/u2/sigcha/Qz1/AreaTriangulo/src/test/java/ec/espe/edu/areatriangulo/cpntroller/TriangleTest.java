package ec.espe.edu.areatriangulo.cpntroller;

import ec.espe.edu.areaTriangle.controller.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void testNoAlturasNegativas() {
        System.out.println("testNoAlturasNegativas");
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> new Triangle(5, -20),
            "Expected Triangle constructor to throw, but it didn't"
        );
        assertTrue(thrown.getMessage().contains("Altura no puede ser cero o negativa"));
    }

    @Test
    public void testNoBasesNegativas() {
        System.out.println("testNoBasesNegativas");
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> new Triangle(-5, 10),
            "Expected Triangle constructor to throw, but it didn't"
        );
        assertTrue(thrown.getMessage().contains("Base no puede ser cero o negativa"));
    }

    @Test
    public void testAreaCalculo() {
        System.out.println("testAreaCalculo");
        Triangle triangle = new Triangle(10, 5);
        double expResult = 25.0;
        double result = triangle.getArea();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSumaAngulos() {
        System.out.println("testSumaAngulos");
        assertTrue(Triangle.verificarSumaAngulos(60, 60, 60));
    }

    @Test
    public void testVerticesDiferentes() {
        System.out.println("testVerticesDiferentes");
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> Triangle.verificarVertices(0, 0, 0, 0, 0, 0),
            "Expected verificarVertices() to throw, but it didn't"
        );
        assertTrue(thrown.getMessage().contains("Vértices deben ser diferentes"));
    }

    @Test
    public void testAlturaNoCero() {
        System.out.println("testAlturaNoCero");
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> new Triangle(5, 0),
            "Expected Triangle constructor to throw, but it didn't"
        );
        assertTrue(thrown.getMessage().contains("Altura no puede ser cero o negativa"));
    }

    @Test
    public void testBaseNoCero() {
        System.out.println("testBaseNoCero");
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> new Triangle(0, 5),
            "Expected Triangle constructor to throw, but it didn't"
        );
        assertTrue(thrown.getMessage().contains("Base no puede ser cero o negativa"));
    }

    @Test
    public void testLongitudLadosPositivas() {
        System.out.println("testLongitudLadosPositivas");
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> Triangle.verificarLado(-5),
            "Expected verificarLado() to throw, but it didn't"
        );
        assertTrue(thrown.getMessage().contains("Longitud de los lados debe ser positiva"));
    }

    @Test
    public void testDesigualdadTriangular() {
        System.out.println("testDesigualdadTriangular");
        assertTrue(Triangle.verificarDesigualdadTriangular(3, 4, 5));
    }

    @Test
    public void testBaseAlturaMismoPlano() {
        System.out.println("testBaseAlturaMismoPlano");
        assertTrue(Triangle.verificarPlano(0, 0, 0, 10, 0, 5));
    }
}