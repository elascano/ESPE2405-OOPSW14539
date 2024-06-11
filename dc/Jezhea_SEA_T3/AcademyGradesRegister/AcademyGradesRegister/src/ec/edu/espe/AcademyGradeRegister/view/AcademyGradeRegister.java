/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AcademyGradeRegister.view;

import ec.edu.espe.AcademyGradeRegister.model.Professor;
import ec.edu.espe.AcademyGradeRegister.model.Student;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;


/**
 *
 * @author Ricardo Lainez JEZHE assosiation software engineers - DCCO ESPE
 */
public class AcademyGradeRegister {
    public Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  
        
        
        
        System.out.println("ACADEMY GRADE REGISTER");
        int operation;
        
            System.out.println("1. ingresar como docente: ");
            System.out.println("2. ingresar como estudiante: ");
            System.out.println("3. ingresar como padre de familia: ");
            System.out.println("4 ingresar como administrador: ");
            System.out.println("5. salir del programa.");
            operation = scanner.nextInt();
            
            switch(operation){
                case 1:
                    //enterProfessor();
                    break;
            }
    
        
        
        
        
        
    }

    private void enterProfessor() {
        System.out.println("ingrese su id: ");
        String Id = scanner.nextLine();
        
        System.out.println("ingrese su correo: ");
        String email = scanner.nextLine();
        
        System.out.println("ingrese sus usuario: ");
        String user = scanner.nextLine();
        
        System.out.println("ingrese su asignatura: ");
        String subject = scanner.nextLine();
        
        Professor professors = new Professor();
        professors.setProfessorID(Id);
        professors.setEmail(email);
        professors.setProfessorUser(user);
        professors.setDepartment(subject);
        
    }
}

