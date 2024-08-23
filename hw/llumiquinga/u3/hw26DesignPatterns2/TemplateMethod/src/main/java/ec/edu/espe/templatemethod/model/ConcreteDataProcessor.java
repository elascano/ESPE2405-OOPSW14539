/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.templatemethod.model;

/**
 *
 * @author G403 LLumiquinga
 */ 
public class ConcreteDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("Reading data from source...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing data...");
    }

    @Override
    protected void writeData() {
        System.out.println("Writing data to destination...");
    }
}