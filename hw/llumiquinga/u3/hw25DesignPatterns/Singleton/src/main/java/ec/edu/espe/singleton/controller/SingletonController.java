/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singleton.controller;

import ec.edu.espe.singleton.model.SingletonModel;

/**
 *
 * @author Jerson Llumiquinga M
 */
public class SingletonController {
    private SingletonModel model;

    public SingletonController() {
        this.model = SingletonModel.getInstance();
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
