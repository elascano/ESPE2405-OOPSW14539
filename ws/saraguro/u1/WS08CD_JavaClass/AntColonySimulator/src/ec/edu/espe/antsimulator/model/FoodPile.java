/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Leidy Saraguro, Paradigm Pioneers Squad, DCCO-ESPE
 */
public class FoodPile {
    private Cell position;
    private int PileAmount;

    public FoodPile(Cell position, int PileAmount) {
        this.position = position;
        this.PileAmount = PileAmount;
    }
    
    public Food yieldFood(int amount){
        Food food = new Food(amount);
        return food;
    }

    /**
     * @return the position
     */
    public Cell getPosition() {
        return position;
    }

    /**
     * @return the PileAmount
     */
    public int getPileAmount() {
        return PileAmount;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Cell position) {
        this.position = position;
    }

    /**
     * @param PileAmount the PileAmount to set
     */
    public void setPileAmount(int PileAmount) {
        this.PileAmount = PileAmount;
    }
    
    
}
