
package ec.edu.espe.mazegenerator.controller;

import ec.edu.espe.mazegenerator.model.Maze;
import ec.edu.espe.mazegenerator.model.MazeBuilder;
import ec.edu.espe.mazegenerator.model.MazeGenerator;
import ec.edu.espe.mazegenerator.view.AsciiMazePrinter;
import ec.edu.espe.mazegenerator.view.MazePrinter;

/**
 *
 * @author Erick Tufiño
 */
public class Main {
    public static void main(String[] args) {
        int width = 5;
        int height = 5;

        MazeGenerator generator = new MazeBuilder();
        Maze maze = generator.generate(width, height);

        MazePrinter printer = new AsciiMazePrinter();
        printer.print(maze);
    }
}

