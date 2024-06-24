/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.referenceddt.view;

import ec.edu.espe.referenddt.model.Professor;

/**
 *
 * @author heiso
 */
public class ReferencedDT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor professor;
        float salary;
        System.out.println("Heidy primitive versus referend");
        
        professor = new Professor( 1, "Heidy", 4078, true);
        salary=2000;
        
        System.out.println("Professor in the main -->" +professor);
        System.out.println("salary in the main -->"+salary);
        changeSalary(salary);
        printprofessor(professor);
        
        System.out.println("salary after calling the method -->"+salary);
    }
    
    public void printprofessor(Professor professor){
        professor.setSalary(1000);
        System.out.println("Professor inside PRINT -->" +professor);
    }
    
    public void changeSalary(float salary){
        salary =2871.0F;
        System.out.println("Professor inside PRINT -->" +salary);
    }
    
    public static void changeSalary(Integer salary){
        salary=new Integer (5000);
        System.out.println("Salary Integer inside change salary -->" +salary);
    }
    
    public static void modifySalaries(float salaries[]){
        salaries[0]=1000;
        salaries[1]=2000;
        salaries[2]=3000;
        
        System.out.println("salaries after calling");
        
        for(float s: sales)
            System.out.println(s+","); 
    }
}
