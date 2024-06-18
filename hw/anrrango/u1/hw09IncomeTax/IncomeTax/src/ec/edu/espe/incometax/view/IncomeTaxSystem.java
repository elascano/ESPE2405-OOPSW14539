/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.incometax.view;

import static Sales.Tax.calculateIncomeTax;
import ec.edu.espe.incometax.model.Person;

/**
 *
 * @author Mario Anrrango, A-Byte Wizards, DCCO - ESPE
 */
public class IncomeTaxSystem {
    public static void main(String[] args) {
        
        Person person;
        person = new Person(1,"Angel",4103);
       double incomeTax = calculateIncomeTax(person.getIncome());
        System.out.println("Income Data -->" + person);
        System.out.printf("The income tax for %s is $%.2f%n", person.getName(), incomeTax);
    }
}
