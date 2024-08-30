/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mazegenerate.view;

import java.util.Scanner;
import ec.edu.espe.mazegenerate.model.*;
import ec.edu.espe.mazegenerate.controller.*;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class MazeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar dimensiones del laberinto
        System.out.print("Ingrese el ancho del laberinto: ");
        int width = scanner.nextInt();
        System.out.print("Ingrese el alto del laberinto: ");
        int height = scanner.nextInt();

        // Crear el laberinto
        Maze maze = new Maze(width, height);
        Wall walls = new Wall();
        Room rooms = new Room();
        MazeGenerate generator = new MazeGenerate(maze, walls, rooms);

        // Generar y mostrar el laberinto
        generator.generate();
        MazePrinter printer = new MazePrinter();
        printer.print(maze);
    }
}
