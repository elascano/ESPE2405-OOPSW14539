/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q61.model;

/**
 *
 * @author Frank Alvarado
 */
public class Vehicle {
    private int id;
    private String mark;
    private int consumeGasoline;

    public Vehicle(int id, String mark, int horsesPower) {
        this.id = id;
        this.mark = mark;
        this.consumeGasoline = horsesPower;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", mark=" + mark + ", horsesPower=" + consumeGasoline + '}';
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
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return the consumeGasoline
     */
    public int getHorsesPower() {
        return consumeGasoline;
    }

    /**
     * @param horsesPower the consumeGasoline to set
     */
    public void setHorsesPower(int horsesPower) {
        this.consumeGasoline = horsesPower;
    }
    
}
