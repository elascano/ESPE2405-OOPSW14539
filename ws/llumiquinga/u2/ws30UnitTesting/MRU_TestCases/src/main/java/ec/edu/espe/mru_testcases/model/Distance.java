/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mru_testcases.model;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class Distance {
    private float Distance;

    @Override
    public String toString() {
        return "Distance{" + "Distance=" + getDistance() + '}';
    }

    public Distance(float Distance) {
        this.Distance = Distance;
    }

    /**
     * @return the Distance
     */
    public float getDistance() {
        return Distance;
    }

    /**
     * @param Distance the Distance to set
     */
    public void setDistance(float Distance) {
        this.Distance = Distance;
    }
    
    
    
    
}
