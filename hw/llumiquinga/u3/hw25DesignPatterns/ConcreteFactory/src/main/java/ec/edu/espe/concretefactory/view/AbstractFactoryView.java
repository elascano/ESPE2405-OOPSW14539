/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.concretefactory.view;

import ec.edu.espe.concretefactory.controller.AbstractFactoryController;

/**
 *
 * @author Jerson Llumiquinga M
 */
public class AbstractFactoryView {
     private AbstractFactoryController controller;

    public AbstractFactoryView(AbstractFactoryController controller) {
        this.controller = controller;
    }

    public void displayString() {
        System.out.println("String from model: " + controller.getString());
    }

    public void setUpperCase() {
        controller.toUpperCase();
    }

    public void setLowerCase() {
        controller.toLowerCase();
    }

    public static void main(String[] args) {
        // Create the controller
        AbstractFactoryController controller = new AbstractFactoryController();
        
        AbstractFactoryView view = new AbstractFactoryView(controller);

        view.displayString();
        
        view.setUpperCase();
        view.displayString();
        
        view.setLowerCase();
        view.displayString();
    }
}
