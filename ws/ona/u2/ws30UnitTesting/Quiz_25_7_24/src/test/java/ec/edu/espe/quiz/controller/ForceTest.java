/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.quiz.controller;

import ec.edu.espe.quiz.controller.Force;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Molina Gabriel,Oña Leydi CodeCrafting Engineers
 */
public class ForceTest {

    public ForceTest() {
    }

    @Test
    public void testForceCalculation1() {
        System.out.println("Force");
        float addend1 = -2F;
        float addend2 = -2F;
        float expResult = 0F;
        float result = Force.ForceCalculeitor(addend1, addend2);
        assertEquals(expResult, result, 0);

    }
    
    @Test
    public void testForceCalculation2() {
        System.out.println("Force");
        float addend1 = 12.23F;
        float addend2 = -5.3F;
        float expResult = -66.409F;
        float result = Force.ForceCalculeitor(addend1, addend2);
        assertEquals(expResult, result, 0);

    }
    
    @Test
    public void testForceCalculation3() {
        System.out.println("Force");
        float addend1 = 24.3F;
        float addend2 = -12.3F;
        float expResult = -298.89F;
        float result = Force.ForceCalculeitor(addend1, addend2);
        assertEquals(expResult, result, 0);

    }
    
    @Test
    public void testForceCalculation4() {
        System.out.println("Force");
        float addend1 = 12.33F;
        float addend2 = 24F;
        float expResult = 297.153F;
        float result = Force.ForceCalculeitor(addend1, addend2);
        assertEquals(expResult, result, 0);

    }
    
    @Test
    public void testForceCalculation5() {
        System.out.println("Force");
        float addend1 = 24F;
        float addend2 = 5.5F;
        float expResult = 132F;
        float result = Force.ForceCalculeitor(addend1, addend2);
        assertEquals(expResult, result, 0);

    }
    
    @Test
    public void testForceCalculation6() {
        System.out.println("Force");
        float addend1 = 5F;
        float addend2 = 10.6F;
        float expResult = 53F;
        float result = Force.ForceCalculeitor(addend1, addend2);
        assertEquals(expResult, result, 0);

    }
    
    @Test
    public void testForceCalculation7() {
        System.out.println("Force");
        float addend1 = -2F;
        float addend2 = -7.21F;
        float expResult = 0F;
        float result = Force.ForceCalculeitor(addend1, addend2);
        assertEquals(expResult, result, 0);

    }
    
    @Test
    public void testForceCalculation8() {
        System.out.println("Force");
        float addend1 = -4F;
        float addend2 = -32.3F;
        float expResult = 0F;
        float result = Force.ForceCalculeitor(addend1, addend2);
        assertEquals(expResult, result, 0);

    }
    
    @Test
    public void testForceCalculation9() {
        System.out.println("Force");
        float addend1 = 35F;
        float addend2 = 5F;
        float expResult = 17.5F;
        float result = Force.ForceCalculeitor(addend1, addend2);
        assertEquals(expResult, result, 0);

    }
    
    @Test
    public void testForceCalculation10() {
        System.out.println("Force");
        float addend1 = 2F;
        float addend2 = -2F;
        float expResult = -4F;
        float result = Force.ForceCalculeitor(addend1, addend2);
        assertEquals(expResult, result, 0);

    }

    
}
