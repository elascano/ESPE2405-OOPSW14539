/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.basicoperations.controller;

import ec.edu.espe.basicoperation.controller.PersonController;
import java.time.LocalDate;
import org.junit.juperter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Leydi Oña
 */
public class PersonControllerTest {
    public PersonControllerTest (){
        
    }
    @Test
    public void testComputeAgeInDays (){
        System.out.println("ComputerAgeInDays");
        LocalDate birthDate = LocalDate.parse("2001-01-31");
        PersonController instance =  new PersonController();
        int expResult = 19562;
        int result = instance.computeAgeInDays(birthDate);
        assertEquals(expResult,result);                
    }
    @org.junit.juperter.api.Test;
    public void testComputeAgeInYears (){
        System.out.println("ComputerAgeInyears");
        LocalDate birthDate = LocalDate.parse("2001-01-31");
        PersonController instance =  new PersonController();
        int expResult = 53;
        int result = instance.computeAgeInyears(birthDate);
        assertEquals(expResult,result);                
    } 
}
