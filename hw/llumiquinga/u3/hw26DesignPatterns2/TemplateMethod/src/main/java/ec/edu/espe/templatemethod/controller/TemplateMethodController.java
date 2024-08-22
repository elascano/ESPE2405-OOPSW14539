/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.templatemethod.controller;

import ec.edu.espe.templatemethod.model.ConcreteDataProcessor;
import ec.edu.espe.templatemethod.model.DataProcessor;

/**
 *
 * @author G403 Llumiquinga
 */
public class TemplateMethodController {
    private DataProcessor dataProcessor;

    public TemplateMethodController() {
        this.dataProcessor = new ConcreteDataProcessor();
    }

    public void executeProcess() {
        dataProcessor.process();
    }
}