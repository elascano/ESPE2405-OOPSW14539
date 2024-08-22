/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.composite.view;

import ec.edu.espe.composite.controller.GraphicController;
import ec.edu.espe.composite.model.Component;

/**
 *
 * @author LLumiquinga
 */
public class GraphicView {
        private GraphicController controller;

    public GraphicView(GraphicController controller) {
        this.controller = controller;
    }

    public void displayHierarchy() {
        Component root = controller.getRoot();
        root.display(0);
    }

    public static void main(String[] args) {
        GraphicController controller = new GraphicController();
        GraphicView view = new GraphicView(controller);

        // Display the hierarchy of components
        view.displayHierarchy();
    }
}
