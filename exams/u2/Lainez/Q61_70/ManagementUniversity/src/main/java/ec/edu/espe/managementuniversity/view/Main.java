/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.managementuniversity.view;

import ec.edu.espe.managementuniversity.controller.MongoDBConnection;
import ec.edu.espe.managementuniversity.controller.UniversityController;

/**
 *
 * @author Ricardo lainez
 */
public class Main {
    public static void main(String[] args) {
        // Conectar a la base de datos de MongoDB Atlas
        MongoDBConnection.connect();

        // Crear la vista y el controlador
        UniversityView view = new UniversityView();
        UniversityController controller = new UniversityController(view, MongoDBConnection.getDatabase());

        // Crear y mostrar el menú principal
        MainMenu mainMenu = new MainMenu(controller);
        mainMenu.setVisible(true);
    }
}
