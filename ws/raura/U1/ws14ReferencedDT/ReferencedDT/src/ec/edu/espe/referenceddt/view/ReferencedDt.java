package ec.edu.espe.referenceddt.view;

import ec.edu.espe.referenceddt.model.Professor;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class ReferencedDt {
    
    public static void main(String [] args){
        Professor professor;
        float salary;
        System.out.println("-----Andrea primitive versus referenced datatypes-----");
        professor = new Professor (1,"Edison", 4078,true);
        salary = 2000;
        
        System.out.println("professor in the main -->" + professor);
        System.out.println("salary in the main-->" + salary);
        
       changeSalary(salary);
       printProfessor(professor);
       
        System.out.println("salary after callig the method-->"+salary);
        System.out.println("professor in the main after calling the method-->" + professor);
        
        Integer sal;
        sal = new Integer(1000);  //funcion usada pero luego desaparecerá 
        sal = 10000;
        System.out.println("Integer Salary in the main-->" + sal);
        
        changeSalary(sal);
        System.out.println("Integer salary after calling the method -->" + sal);
        
        float sals[] = new float[3];
        sals[0] = 1000;
        sals[1] = 2000;
        sals[2] = 3000;
        
        System.out.println("salaries before calling");
        for (float s:sals)
            System.out.println(s + ",");
        
        modifySalaries(sals);
        
        System.out.println("salaries after calling");
        for (float s:sals)
            System.out.println(s + ",");
    }
    
    public static void printProfessor(Professor professor){
        professor.setSalary(1000);
        System.out.println("professor inside PRINT -->" + professor);
    }
    
    public static void changeSalary(float salary){
        salary = 2851.0F;
        System.out.println("salary inside changeSalary-->" + salary);
    }
    
    public static void changeSalary(Integer salary){            //polimorfismo, usar la misma funcion con diferente parametro
        //salary = 5000;
        salary = new Integer(5000);
        System.out.println("salary integer inside changeSalary-->" + salary);
    }
    
    public static void modifySalaries(float salaries[]){
        salaries[0] = 1;
        salaries[1] = 2;
        salaries[2] = 3;
        
        System.out.println("salaries inside calling");
        for (float s:salaries)
            System.out.println(s + ",");
        
        
        
    }
}
