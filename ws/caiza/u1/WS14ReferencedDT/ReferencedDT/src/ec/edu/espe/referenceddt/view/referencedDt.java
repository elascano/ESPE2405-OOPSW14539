/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.referenceddt.view;

import ec.edu.espe.referenceddt.model.Professor;

/**
 *
 * @author Miguel Caiza , Overnight Developers Squad , DCCO - ESPE.
 */
public class referencedDt {

    public static void main(String[] args) {
        Professor professor;
        float salary;
        System.out.println("Miguel primitive vs referenecd data types");

        professor = new Professor(1, "Edison", 4870, true);
        salary = 2000;

        System.out.println("Professor in the main --> " + professor);
        System.out.println("salary in the main --> " + salary);
        printProfessor(professor);
        changeSalary(salary);
        System.out.println("salary after calling the method --> " + salary);
        System.out.println("professor in the main after calling the metohd --> " + professor);

        Integer sal;
        sal = 1000;
        System.out.println("Integer salary in the main --> " + sal);
        changeSalary(sal);
        System.out.println("Integer salary after calling the method --> " + sal);

        float sals[] = new float[3];
        sals[0] = 1000;
        sals[1] = 2000;
        sals[2] = 3000;

        System.out.println("Salaries after calling");
        for (float s : sals) {
            System.out.println(s + ",");
        }

        modifySalaries(sals);

        System.out.println("Salaries before calling");
        for (float s : sals) {
            System.out.println(s + ",");
        }
    }

    public static void printProfessor(Professor professor) {
        professor.setSalry(1000);
        System.out.println("Professor inside PRINTT --> " + professor);
    }

    public static void changeSalary(float salary) {
        salary = 2851.0F;
        System.out.println("salary inside changeSalary --> " + salary);
    }

    public static void changeSalary(Integer salary) {
        salary = new Integer(5000);
        System.out.println("Integer in the change salary --> " + salary);
    }

    public static void modifySalaries(float salaries[]) {
        salaries[0] = 0;
        salaries[1] = 0;
        salaries[2] = 0;
        System.out.println("salaries inside calling");
        for (float s : salaries) {
            System.out.println(s + ",");
        }
    }
}
