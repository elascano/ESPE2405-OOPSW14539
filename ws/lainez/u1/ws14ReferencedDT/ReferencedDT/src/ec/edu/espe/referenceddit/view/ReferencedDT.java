/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.referenceddit.view;

import ec.edu.espe.referenceddit.model.Professor;

/**
 *
 * @author Ricardo Lainez jezhe ESPE
 */
public class ReferencedDT {
    public static void main(String[] args) {
        float salary =2000;
        Professor professor;
        professor = new Professor(1, "Ricardo", 4878, true);
        System.out.println("professor in the main -->"+professor);
        System.out.println("salary in the main --> "+salary);
        changeSalary(salary);
        printProfessor(professor);
        
        System.out.println("salary after calling the method ->"+salary);
        System.out.println("profesdor in the main after calling the method->"+professor);
    
        Integer sal ;
        sal= new Integer(10000);
        System.out.println("integer salary in the main -->"+sal);
        changeSalary(sal);
        System.out.println("integer salary after the change salary-->"+sal);
        
        float sals [] = new float [3];
        sals [0] = 1000;
        sals [1] = 2000;
        sals [2] = 3000;
        
        System.out.println("salaries before calling");
        for(float s : sals){
            System.out.println(s+", ");
        }
        
        modifySalary(sals);
        
        System.out.println("salaries after calling");
        for(float s : sals){
            System.out.println(s+", ");
        }
        
    }

    public static void printProfessor(Professor professor){
        professor.setSalary(1000);
        System.out.println("professor inside print -->"+professor);
    }
    
    public static void changeSalary(float money){
        money = 2851.0F;
        System.out.println("salary inside the change salary -->"+money);
    }
    
    
    public static void changeSalary(Integer salary){
        salary = new Integer(5000);
        System.out.println("salary in the method change salary integer-->" +salary);
    }
    
    public static void modifySalary(float salaries[]){
        salaries [0] = 0;
        salaries [1] = 1;
        salaries [2] = 2;
        
        System.out.println("salaries inside calling");
        for(float s : salaries){
            System.out.println(s+", ");
        }
        
    }

    
}
