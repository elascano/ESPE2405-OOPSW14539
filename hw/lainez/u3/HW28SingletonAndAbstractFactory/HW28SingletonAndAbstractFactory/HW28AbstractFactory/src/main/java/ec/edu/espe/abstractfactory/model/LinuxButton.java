/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Lainez Ricardo JEZHE ESPE
 */
public class LinuxButton extends Button{

    public LinuxButton() {
        super("Linux button");
    }

    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
    
}
