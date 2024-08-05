/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.basicoperations.controller;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class PersonController {
    
    public int computeAgeInDays(LocalDate birthDate){
        
        int days;
        
        LocalDate today = LocalDate.now();
        int numbersOfDaysOfYears = Period.between(birthDate, today).getYears()*365;
        int numbersOfDaysOfMonths = Period.between(birthDate, today).getMonths()*30;
        int numbersOfDays = Period.between(birthDate, today).getDays();
        days = numbersOfDaysOfYears + numbersOfDaysOfMonths + numbersOfDays;
        
        return days;
    }
    
    public int computeAgeInYears(LocalDate birtDate){
        LocalDate today = LocalDate.now();
        int years;
        years = Period.between(birtDate, today).getYears();
        return years;
    }
    
}
