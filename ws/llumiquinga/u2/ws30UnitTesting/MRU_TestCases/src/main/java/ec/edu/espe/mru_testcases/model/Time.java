/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mru_testcases.model;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class Time {
    private float Time;

    @Override
    public String toString() {
        return "Time{" + "Time=" + getTime() + '}';
    }

    public Time(float Time) {
        this.Time = Time;
    }

    /**
     * @return the Time
     */
    public float getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(float Time) {
        this.Time = Time;
    }
    
}
