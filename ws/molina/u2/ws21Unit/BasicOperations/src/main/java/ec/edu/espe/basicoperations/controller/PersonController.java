
package ec.edu.espe.basicoperations.controller;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public class PersonController {

    public int computeAgeInDays(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        
        int days;
        
        
        days = (int)ChronoUnit.DAYS.between(birthDate, today);

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
