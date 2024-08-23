/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.templatemethod.view;

import ec.edu.espe.templatemethod.controller.TemplateMethodController;

/**
 *
 * @author G403
 */
public class TemplateMethodView {
    private TemplateMethodController controller;

    public TemplateMethodView(TemplateMethodController controller) {
        this.controller = controller;
    }

    public void displayProcessing() {
        controller.executeProcess();
    }

    public static void main(String[] args) {
        TemplateMethodController controller = new TemplateMethodController();
        TemplateMethodView view = new TemplateMethodView(controller);

        view.displayProcessing();
    }
}
