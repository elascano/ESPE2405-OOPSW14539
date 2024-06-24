/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.incometax.view;

import ec.edu.espe.incometax.model.Person;

/**
 *
 * @author Joffre
 */
public class IncomeTaxSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Person person;
        person = new Person(1,"Angel",4103);
       double incomeTax = calculateIncomeTax(person.getIncome());
        System.out.println("Income Data -->" + person);
        System.out.printf("The income tax for %s is $%.2f%n", person.getName(), incomeTax);
    }
}
    
