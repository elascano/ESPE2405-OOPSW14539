/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.basicoperations.controller;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Yostin Sisalema, Code Masters, DCCO - ESPE
 */
public class PersonController {
    public int computeAgeInDays(LocalDate birthDate){
        LocalDate today =LocalDate.now();
        int days;
        int numberOfDaysOfYears=Period.between(birthDate,today).getYears()*365;
        int numberOfDaysOfMonths=(Period.between(birthDate,today).getMonths()*30);
        int numberOfDays=Period.between(birthDate,today).getDays(); 
        days=numberOfDaysOfYears+numberOfDaysOfMonths+numberOfDays;
        int totalDays = (int) ChronoUnit.DAYS.between(birthDate, today);  
        //return days;
        return totalDays;
    }
    public int computerAgeInyears(LocalDate birthDate){
        LocalDate today =LocalDate.now();
        int years;
        years=Period.between(birthDate,today).getYears();
        return years;
    }
    
    /*
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        // Calcular el número de días considerando los años bisiestos
        int numberOfDaysOfYears = years * 365 + years / 4 - years / 100 + years / 400;
        // Calcular el número de días en los meses, asumiendo un promedio de 30.44 días por mes
        int numberOfDaysOfMonths = (int) (months * 30.44);
        // Añadir los días restantes
        int totalDays = numberOfDaysOfYears + numberOfDaysOfMonths + days;

        return totalDays;    
    */
    
}
//hacer pruebas 