/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mru_testcases.model;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class Velocity {
    
    private float Velocity;

    @Override
    public String toString() {
        return "Velocity{" + "Velocity=" + getVelocity() + '}';
    }

    public Velocity(float Velocity) {
        this.Velocity = Velocity;
    }

    /**
     * @return the Velocity
     */
    public float getVelocity() {
        return Velocity;
    }

    /**
     * @param Velocity the Velocity to set
     */
    public void setVelocity(float Velocity) {
        this.Velocity = Velocity;
    }
    
    
    
}
