/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.composite.view;

import ec.edu.espe.composite.controller.*;
import ec.edu.espe.composite.model.*;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class Setup {

    public static void main(String[] args) {
        Teller lonny = new Teller("Lonny");
        Clerk cal = new Clerk("Cal");
        Manager able = new Manager("Able");
        able.add(lonny);
        able.add(cal);

        Teller juanita = new Teller("Juanita");
        Teller tina = new Teller("Tina");
        Teller thelma = new Teller("Thelma");
        Manager becky = new Manager("Becky");
        becky.add(juanita);
        becky.add(tina);
        becky.add(thelma);

        President pete = President.getPresident("Pete");
        pete.add(able);
        pete.add(becky);
        
        Client.employee = pete;
        Client.doClientTasks();
        
    }
}