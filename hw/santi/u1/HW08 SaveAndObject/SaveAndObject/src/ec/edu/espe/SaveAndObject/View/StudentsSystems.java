/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SaveAndObject.View;

import static Utils.FileManager.SaveObject;
import ec.edu.espe.SaveAndObject.Model.SantiStudent;

/**
 *
 * @author Sjean
 */
public class StudentsSystems {
    public static void main(String[] args) {
        SantiStudent student;
        student = new SantiStudent(1, "Jeancarlo", "Ecuadorian", "Software Engineer", true);
        System.out.println("Student Data --> " + student);
      
        SaveObject(student);
    }
}
