/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Leydi Oña, Lenovo, DCCO-ESPE>
 */
public class FoodPile {
    Cell position;
    int pileAmount;
    
    public Food yieldFood(int amount){
        Food food = new Food(amount);
        return food;
    }

    public FoodPile(Cell position, int pileAmount) {
        this.position = position;
        this.pileAmount = pileAmount;
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public int getPileAmount() {
        return pileAmount;
    }

    public void setPileAmount(int pileAmount) {
        this.pileAmount = pileAmount;
    }

    @Override
    public String toString() {
        return "FoodPile{" + "position=" + position + ", pileAmount=" + pileAmount + '}';
    }
    
}
