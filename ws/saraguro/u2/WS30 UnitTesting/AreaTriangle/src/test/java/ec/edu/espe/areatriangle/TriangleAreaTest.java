/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.areatriangle;

import ec.edu.espe.areatriangle.model.TriangleArea;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class TriangleAreaTest {
    
   // Test case 1: Normal values
    @Test
    public void testCalculateAreaNormal1() {
        double base = 3.0;
        double height = 4.0;
        double expResult = 6.0;
        double result = TriangleArea.calculateArea(base, height);
        assertEquals(expResult, result, 0.0);
    }
    
    // Test case 2: Normal values
    @Test
    public void testCalculateAreaNormal2() {
        double base = 5.0;
        double height = 6.0;
        double expResult = 15.0;
        double result = TriangleArea.calculateArea(base, height);
        assertEquals(expResult, result, 0.0);
    }
    
    // Test case 3: Large values
    @Test
    public void testCalculateAreaLargeValues() {
        double base = 1e6;
        double height = 2e6;
        double expResult = 1e6 * 1e6;
        double result = TriangleArea.calculateArea(base, height);
        assertEquals(expResult, result, 0.0);
    }
    
    // Test case 4: Base is zero
    @Test
    public void testCalculateAreaBaseZero() {
        double base = 0.0;
        double height = 10.0;
        double expResult = 0.0;
        double result = TriangleArea.calculateArea(base, height);
        assertEquals(expResult, result, 0.0);
    }
    
    // Test case 5: Height is zero
    @Test
    public void testCalculateAreaHeightZero() {
        double base = 10.0;
        double height = 0.0;
        double expResult = 0.0;
        double result = TriangleArea.calculateArea(base, height);
        assertEquals(expResult, result, 0.0);
    }
    
    // Test case 6: Base and height are zero
    @Test
    public void testCalculateAreaBaseAndHeightZero() {
        double base = 0.0;
        double height = 0.0;
        double expResult = 0.0;
        double result = TriangleArea.calculateArea(base, height);
        assertEquals(expResult, result, 0.0);
    }
    
    // Test case 7: Negative base
    @Test
    public void testCalculateAreaNegativeBase() {
        double base = -5.0;
        double height = 6.0;
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleArea.calculateArea(base, height);
        });
    }
    
    // Test case 8: Negative height
    @Test
    public void testCalculateAreaNegativeHeight() {
        double base = 5.0;
        double height = -6.0;
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleArea.calculateArea(base, height);
        });
    }
    
    // Test case 9: Negative base and height
    @Test
    public void testCalculateAreaNegativeBaseAndHeight() {
        double base = -5.0;
        double height = -6.0;
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleArea.calculateArea(base, height);
        });
    }
    
    // Test case 10: Valid small values
    @Test
    public void testCalculateAreaSmallValues() {
        double base = 0.1;
        double height = 0.2;
        double expResult = 0.01;
        double result = TriangleArea.calculateArea(base, height);
        assertEquals(expResult, result, 0.0);
    }
    
}
