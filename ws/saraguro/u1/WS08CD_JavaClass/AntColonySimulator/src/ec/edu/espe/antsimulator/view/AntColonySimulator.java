/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.antsimulator.view;

import ec.edu.espe.antsimulator.model.*;

/**
 *
 * @author Leidy Saraguro, Paradigm Pioneers Squad, DCCO-ESPE
 */
public class AntColonySimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Leidy's Ant Simulator");
        Ant ants[] = new Ant[3];
        Cell cell = new Cell(1, 1);
        Colony colony;
        Food food = new Food(3);
        FoodPile foodpile = new FoodPile(cell, 1);
        Nest nest;
        Food[] stockPile = new Food[5];
        
        Ant ant = new Ant(cell, 1);
        ants[0]= new Ant(cell,2);
        ants[1] = ant;
        ants[2] = new Ant(cell, 3);
        
        ants[0].run();
        
        nest = new Nest(cell, stockPile);
        colony = new Colony(nest, ants);
        
        System.out.println("Colony --> " + colony);
        System.out.println("Food --> " + food);
        System.out.println("Cell --> " + cell);
        System.out.println("FoodPile --> " + foodpile);
        System.out.println("Ants --> " + ants);
        System.out.println("Ant --> " + ant);
    }
    
}
