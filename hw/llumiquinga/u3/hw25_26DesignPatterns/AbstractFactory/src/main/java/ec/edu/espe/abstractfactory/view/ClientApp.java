/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.view;

import ec.edu.espe.abstractfactory.controller.GUIFactory;
import ec.edu.espe.abstractfactory.model.Button;
import ec.edu.espe.abstractfactory.model.Menu;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class ClientApp {
    public static void main(String[] args) {
        GUIFactory winFactory = GUIFactory.getFactory(0);
        Button winButton = winFactory.createButton();
        winButton.caption = "|----Play----|";
        winButton.paint();
        GUIFactory linuxFactory = GUIFactory.getFactory(1);
        
        Button linuxButton = linuxFactory.createButton();
        linuxButton.caption = "|----Play----|";
        linuxButton.paint();
        Menu winMenu = winFactory.createMenu();
        winMenu.caption = "Configuration -->";
        winMenu.paint();
        Menu linuxMenu = linuxFactory.createMenu();
        linuxMenu.caption = "Configuration --->";
        linuxMenu.paint();
    }
}