/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.testcasemru.controller;

/**
 *
 * @author WINDOWS
 */
public class CalculateVelocity {
    
    public double velocity(double distance, double time){
        if (time == 0) {
            throw new IllegalArgumentException("El tiempo no puede ser cero.");
        }if(time<0){
            throw new IllegalArgumentException("El tiempo no puede ser negativo.");
        }
        return distance / time;
    }
    
    
}
