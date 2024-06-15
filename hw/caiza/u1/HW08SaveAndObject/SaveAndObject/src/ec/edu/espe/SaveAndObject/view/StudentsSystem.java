/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SaveAndObject.view;

import ec.edu.espe.SaveAndObject.model.CaizaStudent;
import static ec.edu.espe.SaveAndObject.utils.FileManager.SaveObject;


/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class StudentsSystem {

    public static void main(String[] args) {
        CaizaStudent student;
        student = new CaizaStudent(1, "Miguel", "Ecuadorian", "Software Engineer", true);
        System.out.println("Student Data --> " + student);
      
        SaveObject(student);
    }
}
