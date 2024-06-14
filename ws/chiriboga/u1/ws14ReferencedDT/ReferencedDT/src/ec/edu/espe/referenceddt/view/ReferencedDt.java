
package ec.edu.espe.referenceddt.view;

import ec.edu.espe.referenceddt.model.Professor;
import java.awt.BorderLayout;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class ReferencedDt {
    public static void main(String[] args) {
        Professor professor;
        float salary;
        System.out.println("Kerlly primitive versus referenced data types");
        professor = new Professor (1, "Kerlly", 4078, true);
        salary = 2000;
        
        System.out.println("Professor in the MAIN --> " + professor);
        System.out.println("Salary in the MAIN --> " + salary);
        changeSalary(salary);
        printProfessor(professor);
        
        System.out.println("Salary after calling the method --> " + salary);
        System.out.println("Professor in the MAIN after calling the method --> " + professor);
        
        Integer sal;
        sal = new Integer(10000);
        System.out.println("Integer salary in the main --> " + sal);
        changeSalary(sal);
        System.out.println("Integer sal after de calling method --> " + sal );
        
        float sals[] = new float[3];
        sals[0]=1000;
        sals[1]=2000;
        sals[2]=3000;
        
        System.out.println("Salaries before calling");
        for(float s : sals)
            System.out.println(s + ",");
        
        modifySalaries(sals);
        
        System.out.println("Salaries after calling");
        for(float s : sals)
            System.out.println(s + ",");        
        
    }
    
    public static void printProfessor(Professor professor){
        professor.setSalary(1000);
        System.out.println("Professor inside PRINT --> " + professor);
    }
            
    public static void changeSalary(float salary){
        salary = 2851.0F;
        System.out.println("Salary inside changeSalary --> " + salary);
    }
    
    public static void changeSalary(Integer salary){
        salary = new Integer(5000);
        
        System.out.println("Salary Integer inside change salary --> " + salary);
        
    }
    
    public static void modifySalaries(float salaries []){
        salaries[0]=1;
        salaries[1]=2;
        salaries[2]=3;
        
        System.out.println("Salaries inside calling");
        for (float s : salaries)
            System.out.println(s + ",");
        }
            
    }

