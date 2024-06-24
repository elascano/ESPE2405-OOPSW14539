
package ec.edu.espe.antsimulator.view;

import ec.edu.espe.antsimulator.model.*;
import java.io.IOException;
import java.util.Scanner;
import utils.FileManager;



public class AntColonySimulator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kerlly's Ant Simulator");
        Ant ants[] = new Ant[3];
        Cell cell = new Cell(1, 1);
        Colony colony;
        Food food = new Food(3);
        FoodPile foodpile = new FoodPile(cell, 1);
        Nest nest;
        Food[] stockPile = new Food[5];
        
        System.out.println("Enter file type to save (csv/json): ");
        String fileType = scanner.nextLine().toLowerCase();
        

        Ant ant = new Ant(cell, 1);
        ants[0] = new Ant(cell, 2);
        ants[1] = ant;
        ants[2] = ant;
        
        ants[0].run();
        
        
        nest = new Nest(cell, stockPile);
        colony = new Colony(nest, ants);
        String data = ant.toCSV();

        try {
              FileManager.save(data, "ants", fileType);
            } catch (IOException e) {
               System.err.println("An error occurred while saving the data: " + e.getMessage());
            }
        }
                
        
        
//        System.out.println("Colony --> " + colony);
//        System.out.println("Food --> " + food);
//        System.out.println("Cell --> " + cell);
//        System.out.println("Food Pile --> " + foodpile);
//        System.out.println("Ants --> " + Arrays.toString(ants));
//        System.out.println("Ant --> " + ant);
//        

        
        
    }
