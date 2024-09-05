package ec.espe.edu.mazegenerator.view;

import ec.espe.edu.mazegenerator.controller.IMazeGenerator;
import ec.espe.edu.mazegenerator.controller.MazeController;
import ec.espe.edu.mazegenerator.controller.MazeGenerator;
import ec.espe.edu.mazegenerator.controller.MazePrinter;
import ec.espe.edu.mazegenerator.controller.RandomGenerator;
import ec.espe.edu.mazegenerator.model.Maze;
import java.util.Scanner;

/**
 *
 * @author Sigcha Kenned, PPS,DCCO-ESPE
 */
public class MazeSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid=false;
        int mazeWidth=0;
        int mazeHeight=0;  
        while(!isValid){
        System.out.println("Enter the width of the Maze: ");
        mazeWidth = scanner.nextInt();
        System.out.println("Enter the height of the Maze: ");
        mazeHeight = scanner.nextInt();
        if(mazeWidth >= 4 && mazeHeight >= 4){
            isValid = true;   
        } else {
            System.out.println("Debe ser mayor o igual a 4");
        }
        }
    Maze maze = new Maze(mazeWidth, mazeHeight);
    RandomGenerator randomGenerator = new RandomGenerator();
    MazeGenerator mazeGenerator = new MazeGenerator(randomGenerator);
    MazePrinter mazePrinter = new MazePrinter();
    MazeController mazeController = new MazeController(maze, mazeGenerator, mazePrinter, randomGenerator);
    mazeController.createMaze();
    mazeController.printMaze();
    }
}
