/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mrutomongo.model;

/**
 *
 * @author WINDOWS
 */
public class ComputeSpeed {
    private double distance;
    private double time;
    private double speed;

    public ComputeSpeed(double distance, double time) {
        this.distance = distance;
        this.time = time;
        this.speed = calculateSpeed();
    }

    private double calculateSpeed() {
        if (time == 0) {
            throw new IllegalArgumentException("El tiempo no puede ser cero.");
        }
        return distance / time;
    }

    public double getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }

    public double getSpeed() {
        return speed;
    }
}