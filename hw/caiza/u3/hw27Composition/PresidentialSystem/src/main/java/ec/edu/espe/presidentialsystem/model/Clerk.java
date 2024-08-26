/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.presidentialsystem.model;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class Clerk extends Employee{
    
    public Clerk(String aName) {
        super();
        this.name = aName;
        this.title = "Clerk";
    }

    @Override
    public void stateName() {
        super.stateName();
    }    
}
