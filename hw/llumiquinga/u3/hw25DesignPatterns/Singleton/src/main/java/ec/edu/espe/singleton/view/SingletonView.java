/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.controller.SingletonController;

/**
 *
 * @author Jerson Llumiquinga M
 */
public class SingletonView {
      private SingletonController controller;

    public SingletonView(SingletonController controller) {
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
        SingletonController controller = new SingletonController();
        SingletonView view = new SingletonView(controller);

        view.displayString();

        view.setUpperCase();
        view.displayString();

        view.setLowerCase();
        view.displayString();
    }
}
