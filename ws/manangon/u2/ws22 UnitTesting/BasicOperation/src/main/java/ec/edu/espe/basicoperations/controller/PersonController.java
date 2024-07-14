/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.basicoperations.controller;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author IAEN
 */
public class PersonController {
    public int computeAgeInDays(LocalDate birthDate){
        LocalDate today = LocalDate.now();
        
        int days;
        int numberOfDays = Period.between(birthDate,today).getYears()*365;
        int numberOfMonths = Period.between(birthDate,today).getMonths()*30;
        int numberOfYears= Period.between(birthDate,today).getDays();
        days = numberOfDays + numberOfMonths + numberOfYears;
        return days;
        
    }
    public int computeAgeInYears(LocalDate birthDate){
        
        LocalDate today = LocalDate.now();
        int years;
        years = Period.between(birthDate,today).getYears();
        return years;
    }
}
