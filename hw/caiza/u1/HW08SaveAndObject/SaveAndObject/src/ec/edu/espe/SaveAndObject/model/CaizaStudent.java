/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SaveAndObject.model;

import java.io.Serializable;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class CaizaStudent implements Serializable{

    private int id;
    private String name;
    private String nacionality;
    private String career;
    private boolean scholarship;

    @Override
    public String toString() {
        return "CaizaSrudent{" + "id=" + id + ", name=" + name + ", nacionality=" + nacionality + ", career=" + career + ", scholarship=" + scholarship + '}';
    }

    public CaizaStudent(int id, String name, String nacionality, String career, boolean scholarship) {
        this.id = id;
        this.name = name;
        this.nacionality = nacionality;
        this.career = career;
        this.scholarship = scholarship;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the mattricula
     */
    public String getNacionality() {
        return nacionality;
    }

    /**
     * @param nacionality the mattricula to set
     */
    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    /**
     * @return the career
     */
    public String getCareer() {
        return career;
    }

    /**
     * @param career the career to set
     */
    public void setCareer(String career) {
        this.career = career;
    }

    /**
     * @return the scholarship
     */
    public boolean getScholarship() {
        return scholarship;
    }

    /**
     * @param scholarship the scholarship to set
     */
    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }

}
