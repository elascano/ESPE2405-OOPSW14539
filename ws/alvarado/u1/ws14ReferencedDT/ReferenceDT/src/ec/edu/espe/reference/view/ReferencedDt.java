/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.reference.view;

import ec.edu.espe.reference.controller.Professor;

/**
 *
 * @author Frank Alvaradom, As-Byte Wizards, DCCO-ESPE
 */
public class ReferencedDt {
    
    
    public static void main(String[] args) {
        float salary;
        Professor professor;
        System.out.println("Frank primitive versus referenced data files");
        professor = new Professor(1, "Edison", 4078, true);
        salary = 2000;
        System.out.println("professor in te main--->" + professor);
        System.out.println("salary in te main--->" + salary);
        printprofessor(professor);
        changSalay(salary);
        System.out.println("salary after calling the method--->" + salary);
        System.out.println("professor in the main afther calling the method--->" + professor);
        Integer sal;
        sal= new Integer(10000);
        System.out.println("Integer Salary in the main--->"+sal);
        changeSalary(sal);
        System.out.println("Integer sal afther calling the method --->"+sal);
        
        
        float sals[]= new float[3];
        sals[0]=1000;
        sals[1]=2000;
        sals[2]=3000;
        System.out.println("salaries before calling");
        for(float s:sals){
            System.out.println(s+ ",");
        }
        modifySalaries(sals);
        System.out.println("salaries afther calling");
        
          for(float s:sals){
            System.out.println(s+",");
        }
        
    }
    public  static void printprofessor(Professor professor){
        professor.setSalary(1000);
        System.out.println("professor inside PRINT--->"+professor);
    }
    
    public static void changSalay(float salary) {
        salary = 2851.0F;
        System.out.println("salary insid changeSalary--->" + salary);
    }

    public static void changeSalary(Integer salary) {
         salary =new Integer(5000);
        
        System.out.println("Salary Integer inside change salary--->"+salary);
    }
    public static void modifySalaries(float salaries[]){
    salaries[0]=0;
    salaries[1]=1;
    salaries[2]=3;
        System.out.println("salaries before calling");
       for (float s:salaries)
       {
           System.out.println(s+",");
       }
          
    }
}
