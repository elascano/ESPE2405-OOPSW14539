/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.concretefactory.controller;

import ec.edu.espe.concretefactory.model.AbstractFactoryModel;
import ec.edu.espe.concretefactory.model.ConcreteFactoryModel;

/**
 *
 * @author G403 Jerson Llumiquigna M
 */
public class AbstractFactoryController {
    private AbstractFactoryModel model;

    public AbstractFactoryController() {
        this.model = new ConcreteFactoryModel();
    }

    public String getString() {
        return model.getString();
    }

    public void setString(String s) {
        model.setString(s);
    }

    public void toUpperCase() {
        setString(getString().toUpperCase());
    }

    public void toLowerCase() {
        setString(getString().toLowerCase());
    }
}
