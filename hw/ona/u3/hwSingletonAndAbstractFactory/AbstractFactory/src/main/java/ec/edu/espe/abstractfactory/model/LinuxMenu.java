/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Leydi Oña
 */
public class LinuxMenu extends Menu{

    public LinuxMenu() {
        super("Linux menu");
    }

    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
    
}
