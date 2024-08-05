/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.basicoperations.controller;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Leydi Oña, CodeCrafting Engineers
 */
public class PersonController {

    public int computeAgeInDays(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        int days;
        int numberOfDaysOfYears = computeAgeInYears(birthDate) * 365;
        int numberOfDaysOfMonths = computeAgeInMonths(birthDate) * 30;
        int numberOfDays = Period.between(birthDate, today).getDays();

        days = numberOfDaysOfYears + numberOfDaysOfMonths + numberOfDays;

        return days;
    }

    public int computeAgeInMonths(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        int years;

        years = Period.between(birthDate, today).getMonths();

        return years;
    }
    
    public int computeAgeInYears(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        int years;

        years = Period.between(birthDate, today).getYears();

        return years;
    }
}
