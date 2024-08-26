/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.GoalKeeper.model;
import java.io.Serializable;

public class Goals implements Serializable {
    private int id;
    private String name;
    private int age;
    private int saves;

    public Goals (int id, String name, int age, int saves) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.saves = saves;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    @Override
    public String toString() {
        return "Goalkeeper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", saves=" + saves +
                '}';
    }
}
