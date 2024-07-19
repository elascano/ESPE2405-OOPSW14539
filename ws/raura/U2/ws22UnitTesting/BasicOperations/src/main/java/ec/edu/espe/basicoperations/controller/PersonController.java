package ec.edu.espe.basicoperations.controller;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class PersonController {
    
    public int computeAgeInDays(LocalDate birthDate){
        
        LocalDate today = LocalDate.now();
        int days;
        int numberOfDaysOfYears = Period.between(birthDate,today).getYears() * 365;
        int numberOfDaysOfMonths = (Period.between(birthDate,today).getMonths()) * 30;
        int numberOfDays = Period.between(birthDate, today).getDays();
        days = numberOfDaysOfYears + numberOfDaysOfMonths + numberOfDays;
        
        return days;
    }
    
    public int computeAgeInYears(LocalDate birthDate){
        LocalDate today = LocalDate.now();
        int years;
        years = Period.between(birthDate,today).getYears();
        
        return years;
    }
    
}