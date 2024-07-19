/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.basicoperations.controller;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Marco Padilla
 */
public class PersonController {
    public int computeAgeInDays(LocalDate birthDate){
        LocalDate today = LocalDate.now();
        int days;
        int numberOfDaysOfYears = Period.between(birthDate, today).getYears() *365;
        int numberOfDaysOfMonths = (Period.between(birthDate, today).getMonths()) * 30;
        int numberOfDaysOfDays = Period.between(birthDate, today).getDays();
        days = numberOfDaysOfYears + numberOfDaysOfMonths + numberOfDaysOfDays;
        return days;
    }
    
    public int computeAgeInYears(LocalDate birthDate){
        LocalDate today = LocalDate.now();
        int years;
        years = Period.between(birthDate, today).getYears();
        return years;
    }
}
