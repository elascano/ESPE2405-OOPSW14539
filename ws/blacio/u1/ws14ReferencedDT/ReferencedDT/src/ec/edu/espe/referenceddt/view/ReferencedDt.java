package ec.edu.espe.referenceddt.view;

import ec.edu.espe.referenceddt.model.Professor;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class ReferencedDt {

    public static void main(String[] args) {
        Professor professor;
        float salary;

        professor = new Professor(1, "Edison", 4078, true);
        salary = 2000;

        System.out.println("professor in the main --> " + professor);
        System.out.println("salary in the main --> " + salary);

        changeSalary(salary);
        printprofessor(professor);

        //
        //
        System.out.println("salary after calling the method " + salary);

        System.out.println("Professor in the main after calling the method" + professor);

        Integer sal;
        sal = 10000;
        System.out.println("Integer Salary in the Main" + sal);
        changeSalary(sal);
        System.out.println("Integer sal after calling the method --> " + sal);

        float sals[] = new float[3];
        sals[0] = 1000;
        sals[1] = 2000;
        sals[2] = 3000;

        System.out.println("Salaries after the call");
        for (float s : sals) {
            System.out.println(s + ",");
        }
        
        modifySalaries(sals);
        
        System.out.println("salaries before the call");
        for (float s : sals) {
            System.out.println(s + ",");
        }

    }

    public static void printprofessor(Professor professor) {
        professor.setSalary(1000);
        System.out.println("professor inside PRINT --> " + professor);
    }

    public static void changeSalary(float money) {
        money = 2851.0F;
        System.out.println("salary in the changeSalary --> " + money);
    }

    public static void changeSalary(Integer salary) {
        salary = new Integer(5000);
        System.out.println("salary integer inside change salary  --> " + salary);
    }

    public static void modifySalaries(float salaries[]) {
        salaries[0] = 0;
        salaries[1] = 1;
        salaries[2] = 2;
        
        System.out.println("Salaries inside the calling");
        for (float s : salaries) {
            System.out.println(s + ",");
        }

    }
}
