/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.composite.model;

import java.util.Vector;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public abstract class Supervisor extends Employee {

    protected Vector<Employee> directReports = new Vector<>();

    @Override
    public void stateName() {
        super.stateName(); 
        if (directReports.size() > 0) { 
            for (int i = 0; i < directReports.size(); ++i) {
                directReports.elementAt(i).stateName();
            }
        }
    }

    public void add(Employee anEmployee) {
        this.directReports.addElement(anEmployee);
    }
}