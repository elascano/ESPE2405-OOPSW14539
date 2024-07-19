/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.basicoperation.controller;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Leydi Oña
 */
public class PersonController {
    public int computeAgeInDays (LocalDate birtDate){
        int days;
        
        LocalDate today = LocalDate.now();
        int numberPfDayYears = Period.between(birtDate, today).getYears()*365;
        int numberPfDayMonths = (Period.between(birtDate, today).getMonths())*30;
        int numberPfDays = Period.between(birtDate, today).getDays();
        days = numberPfDayYears + numberPfDayMonths + numberPfDays;

        return days ;
    
        
    }
    public int computeAgeInyears (LocalDate birthDate){
        LocalDate today = LocalDate.now();
        int years;
        years = Period.between(birthDate, today).getYears();
        return years;
    }
          
}
