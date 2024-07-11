/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.basicoperations.controller;

import ec.edu.espe.basicoperation.controller.BasicOperation;

/**
 *
 * @author Leydi Oña
 */
public class BasicoperationTest {
    public BasicoperationTest(){
    
}
    public void testAddTwoNumbers(){
        System.out.println("addTwoNumbers");
        float addend1 = 1.2F;
        float addend2 = 2.4F;
        float expReuslt = 3.6F;
        float result = BasicOperation.addTwoNumbers(addend1, addend2);
        assertEquals(expReuslt,result,0);
    }
}
