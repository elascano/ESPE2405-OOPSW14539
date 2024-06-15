/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.ferercenddt.view;

import ec.edu.ec.ferercenddt.model.Professor;

/**
 *
 * @author CODE_CRAFTING_ENGINEERS
 */
public class ReferencedDt {
    public static void main(String[] args) {
        Professor professor;
        float salary;
        System.out.println("Leydi primitive versus referenced data types");
        professor = new Professor(1, "Leydi", 4078, true);
        salary = 2800;
        
         System.out.println("professor in the main -->"+ professor);
         changeSalary(salary);
         printprofessor(professor);
         
         System.out.println("salary after callinf the metho"+salary);
         
         System.out.println("salry after calling the method -->"+salary);
         
         System.out.println("professor in the after calling the method -->"+professor);
         
         Integer sal;
         sal = new Integer(10000);
         System.out.println("Integer Salary in the main -->"+ sal);
         changeSalary(sal);
         System.out.println("Integer sal after calling the method"+sal);
         
         float sals[]=  new float[3];
         sals [0] = 1000;
        sals[1] = 2000;
        sals [2] = 3000;
        
        System.out.println("salaries befor callin");
            for(float s: sals){
                System.out.println(s + ",");
        }
            
            modifySalary(sals);
            
            System.out.println("salaeries afeter calling");
            for(float s: sals){
                System.out.println(s + ",");
        }
    }
    
    public static void printprofessor(Professor professor) {
        professor.setSalary(2851.0F);
        System.out.println("professor inside PRINT --> "+ professor);
    }
    public static void changeSalary(float salary) {
        salary = 2851.0F;
        System.out.println("salaty inside changeSalary --> "+ salary);
    }
    public static void changeSalary(Integer salary) {
        salary = new Integer(50000);
        
        System.out.println("salaty inside changeSalary --> "+ salary);
    }
    
    public static void modifySalary(float salaries[]) {
        salaries [0] = 0;
        salaries [1] = 1;
        salaries [2] = 2;
        System.out.println("Salaries inside calling " );
        for (float s:salaries){
            
            System.out.println(s+",");
        }
    }
}
