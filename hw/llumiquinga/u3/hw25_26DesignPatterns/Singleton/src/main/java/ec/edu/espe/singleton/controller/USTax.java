/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singleton.controller;

/**
 *
 * @author Jerson Llumiquinga M
 */
public class USTax {
    private  float iva;
    private static USTax instance;
    
    private USTax() {
        this.iva = 0.15F;
    }
    public static USTax getInstance() {
        
        if (instance == null) {
            instance = new USTax();
        }else{
            System.out.println("This class has already been instantiated.");
        }
        return instance;
    }
    
    public float salesTotal(float numberOfProducts, float price){
        return (price*iva*numberOfProducts) + (price*numberOfProducts) ;
    }
}