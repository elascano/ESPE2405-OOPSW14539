/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singleton.model;

/**
 *
 * @author Jerson Llumiquinga M
 */
public class SingletonModel {
    private static SingletonModel single_instance = null;

    private String s;

    private SingletonModel() {
        s = "Hello I am a string part of Singleton class";
    }

    public static SingletonModel getInstance() {
        if (single_instance == null) {
            single_instance = new SingletonModel();
        }
        return single_instance;
    }

    public String getString() {
        return s;
    }

    public void setString(String s) {
        this.s = s;
    }
}
