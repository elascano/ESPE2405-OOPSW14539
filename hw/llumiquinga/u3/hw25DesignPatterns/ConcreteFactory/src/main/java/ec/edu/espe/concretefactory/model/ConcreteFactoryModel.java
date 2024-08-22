/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.concretefactory.model;

/**
 *
 * @author Jerson Llumiquinga M
 */
public class ConcreteFactoryModel implements AbstractFactoryModel {
    private String s;

    public ConcreteFactoryModel() {
        s = "Hello I am a string part of AbstractFactory class";
    }

    @Override
    public String getString() {
        return s;
    }

    @Override
    public void setString(String s) {
        this.s = s;
    }
}
