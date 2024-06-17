/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.computershop.model;

import income.Tax;

/**
 *
 * @author CODE_CRAFTING_ENGINEERS
 */
public class Person {
    private int id;
    private String name;
    private float monthlyPayment;
    private float isp;

    public Person(int id, String name, float monthlyPayment) {
        this.id = id;
        this.name = name;
        this.monthlyPayment = monthlyPayment;
        this.isp =  Tax.incomeTax(monthlyPayment)  ;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", monthlyPayment=" + monthlyPayment + ", isp=" + isp + '}';
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

    public float getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(float monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public float getIsp() {
        return isp;
    }

    public void setIsp(float  isp) {
        this.isp = isp;
    }
    
    
}
