package ec.edu.espe.refercenddt.view;
import ec.edu.espe.refercenddt.model.Professor;
/**
 *
 * @author G403
 */
public class referencedDt {
    
    public static void main(String[] args) {
        Professor professor;
        float salary;
        System.out.println("Jerson Primitive versus referenced data types");
        professor = new Professor(1,"Edison",4078,true);
        salary = 2000;
        System.out.println("Professor in the main -->"+professor);  
        System.out.println("Salary in the main--->"+salary);
        changeSalary(salary);
        printprofessor(professor);
         
        System.out.println("Salary after calling the method-->"+salary);
        System.out.println("Professor in the main after calling the method ->>"+professor);
        Integer sal;
        sal= 10000;
        System.out.println("Integer Salary in the main -->"+sal);
        changeSalary (sal);
        System.out.println("Integer sal before calling the method -->"+sal);     
        
        float sals[] = new float[3];
        sals[0]=1000;
        sals[1]=2000;
        sals[2]=3000;
        for (float s: sals)
        System.out.println(s+",");
        modifySalaries(sals);
        
        System.out.println("salaries after calling");
        for (float s : sals)
        System.out.println(s+",");
    }
    
    public static void printprofessor(Professor professor){
        professor.setSalary(1000);
        System.out.println("Professor inside PRINT -->"+professor);
    }
    public static void changeSalary(float salary){
        salary = 2851.0F;
        System.out.println("Salary inside changeSalary -->" +salary);
       
    }
    public static void changeSalary (Integer salary){
    salary = new Integer (5000);
    System.out.println("Salary Ineger inside change salary -->" + salary);
    }
    public static void modifySalaries(float salaries[]){
        salaries [0]=1;
        salaries [1]=2;
        salaries [2]=3;
        
        System.out.println("salaries after calling");
        for (float s : salaries){
        System.out.println(s+",");
    }
    }
}