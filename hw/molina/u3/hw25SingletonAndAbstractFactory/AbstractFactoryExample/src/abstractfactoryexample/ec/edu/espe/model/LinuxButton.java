/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactoryexample.ec.edu.espe.model;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public class LinuxButton extends Button {

//    public LinuxButton() {
//    }

    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
    
}