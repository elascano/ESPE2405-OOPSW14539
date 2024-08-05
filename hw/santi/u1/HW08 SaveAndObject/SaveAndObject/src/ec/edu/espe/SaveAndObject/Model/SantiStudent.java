/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SaveAndObject.Model;

/**
 *
 * @author Sjean
 */
public class SantiStudent {
    private int id;
    private String name;
    private String nacionality;
    private String career;
    private boolean scholarship;

    @Override
    public String toString() {
        return "SantiStudent{" + "id=" + id + ", name=" + name + ", nacionality=" + nacionality + ", career=" + career + ", scholarship=" + scholarship + '}';
    }

    public SantiStudent(int id, String name, String nacionality, String career, boolean scholarship) {
        this.id = id;
        this.name = name;
        this.nacionality = nacionality;
        this.career = career;
        this.scholarship = scholarship;
    }

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

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }
    
}
