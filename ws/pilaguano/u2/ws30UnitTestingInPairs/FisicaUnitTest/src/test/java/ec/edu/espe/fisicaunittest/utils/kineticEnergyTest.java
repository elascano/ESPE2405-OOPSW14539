/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.fisicaunittest.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author plusm
 */
public class kineticEnergyTest {
    
    public kineticEnergyTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculatekineticEnergy method, of class kineticEnergy.
     */
    @Test
    public void testCalculatekineticEnergy() {
        System.out.println("calculatekineticEnergy");
        double mass = 5.0;
        double velocity = 20.0;
        double expResult = 1000.0;
        double result = kineticEnergy.calculatekineticEnergy(mass, velocity);
        assertEquals(expResult, result,0.1);
     }

     @Test
     
       public void testCalculatekineticEnergy2() {
        System.out.println("calculatekineticEnergy");
        //mass negative
        double mass = -5.0;
        double velocity = 20.0;
        double expResult = 0.0;
        double result = kineticEnergy.calculatekineticEnergy(mass, velocity);
        assertEquals(expResult, result,0.1);
   
    
}
       
        @Test
     
       public void testCalculatekineticEnergy3() {
        System.out.println("calculatekineticEnergy");
        //velocity negative
        double mass = 5.0;
        double velocity = -20.0;
        double expResult = 0;
        double result = kineticEnergy.calculatekineticEnergy(mass, velocity);
        assertEquals(expResult, result,0.1);
   
    
}
       
            @Test
     
       public void testCalculatekineticEnergy4() {
        System.out.println("calculatekineticEnergy");
        //bothnegative
        double mass = -5.0;
        double velocity = -20.0;
        double expResult = 0;
        double result = kineticEnergy.calculatekineticEnergy(mass, velocity);
        assertEquals(expResult, result,0.1);
   
    
}
       
            @Test
     
       public void testCalculatekineticEnergy5() {
        System.out.println("calculatekineticEnergy");
        //float mass
        double mass = 5.5;
        double velocity = 20.0;
        double expResult = 1100;
        double result = kineticEnergy.calculatekineticEnergy(mass, velocity);
        assertEquals(expResult, result,0.1);
   
    
}
       
            @Test
     
       public void testCalculatekineticEnergy6() {
        System.out.println("calculatekineticEnergy");
        //FloatVelocity
        double mass = 5.0;
        double velocity = 20.5;
        double expResult = 1050.625;
        double result = kineticEnergy.calculatekineticEnergy(mass, velocity);
        assertEquals(expResult, result,1);
   
    
}
       
            @Test
     
       public void testCalculatekineticEnergy7() {
        System.out.println("calculatekineticEnergy");
        //Mass 0
        double mass = 0.0;
        double velocity = 20.0;
        double expResult = 0;
        double result = kineticEnergy.calculatekineticEnergy(mass, velocity);
        assertEquals(expResult, result,0.1);
   
    
}
       
            @Test
     
       public void testCalculatekineticEnergy8() {
        System.out.println("calculatekineticEnergy");
        //velocity 0
        double mass = 5.0;
        double velocity = 0.0;
        double expResult = 0;
        double result = kineticEnergy.calculatekineticEnergy(mass, velocity);
        assertEquals(expResult, result,0.1);
   
    
}
       
            @Test
     
       public void testCalculatekineticEnergy9() {
        System.out.println("calculatekineticEnergy");
        //both 0
        double mass = 0.0;
        double velocity = 0.0;
        double expResult = 0;
        double result = kineticEnergy.calculatekineticEnergy(mass, velocity);
        assertEquals(expResult, result,0.1);
   
    
}
       
            @Test
     
       public void testCalculatekineticEnergy10() {
        System.out.println("calculatekineticEnergy");
        //fraciones
        double mass = 0.3333333333333333333333333333333333333333;
        double velocity = 0.333333333333333333333333333;
        double expResult = 0.185185;
        double result = kineticEnergy.calculatekineticEnergy(mass, velocity);
        assertEquals(expResult, result,0.001);
   
    
}
       
}
