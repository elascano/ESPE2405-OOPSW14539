/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.objectexample.view;

import ec.edu.espe.objectexample.model.Ball;
import static ec.edu.espe.objectexample.utils.SaveFile.SaveObject;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Joffre
 */
public class BallSystem {
public static void main(String[] args) {
        Ball ball = new Ball(1, "Futbol", "Blue", "Medium", "Adidas");
        System.out.println("Ball Data --> " + ball);
        
        SaveObject(ball);
    }
}
