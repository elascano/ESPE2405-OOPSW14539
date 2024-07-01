/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.referecenddt.view;
import ec.edu.espe.referecenddt.model.Professor;
/**
 *
 * @author Yostin Sisalema,Code Masters,DCC0-ESPE
 */
public class ReferencedDT {
    public static void main(String[] args){
    Professor professor;
    float salary;
    professor =new Professor(1,"Edison",4078,true);
    salary=2000;
    System.out.println("Yostin primitive versus referenced date types");
    System.out.println("professor in the main -->"+professor);
    System.out.println("professor in the main -->"+salary);
    changeSalary(salary);
    printprofessor(professor);
    
    System.out.println("salary after calling the method -->"+salary);
    //?
    System.out.println("professor in the main after calling the method -->"+professor);
    Integer sal;
    sal=new Integer(10000);
    System.out.println("Integer Salary in the main-->"+sal);
    changeSalary(sal);
    System.out.println("Integer sal after calling the method -->"+sal);
    
    float sals[]=new float [3];
    sals[0]=1000;
    sals[1]=2000;
    sals[2]=3000;
    
    System.out.println("salaries before calling");
        for(float s:sals){
        System.out.println(s+",");
        }
        modifySalaries(sals);
    System.out.println("salaries after calling ");
        for(float s:sals){
        System.out.println(s+",");
        }
    }
    
    public static void printprofessor(Professor professor){
    professor.setSalary(1000);
    System.out.println("professor inside PRINT -->"+professor);
    }
    
    public static void changeSalary(float salary){
    salary=2851.0F;
    System.out.println("salary inside changeSalary -->"+salary);
    }
    public static void changeSalary(Integer salary){
    salary=new Integer(5000);
    
    System.out.println("salary inside changeSalary -->"+salary);
    }
    public static void modifySalaries(float salaries[]){
    salaries[0]=1;
    salaries[1]=2;
    salaries[2]=3;
    System.out.println("salaries inside calling");
    for(float s:salaries)
    System.out.println(s+",");
    }
    
}
