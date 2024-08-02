
package ec.edu.espe.studentmanagement.view;

import ec.edu.espe.studentmanagement.controller.MongoDBConnection;
import ec.edu.espe.studentmanagement.controller.StudentController;
import ec.edu.espe.studentmanagement.view.StudentView;
import ec.edu.espe.studentmanagement.view.MainMenu;
/**
 *
 * @author Adrian Padilla
 */
public class Main {
    public static void main(String[] args) {
        // Conectar a la base de datos de MongoDB Atlas
        MongoDBConnection.connect();

        // Crear la vista y el controlador
        StudentView view = new StudentView();
        StudentController controller = new StudentController(view, MongoDBConnection.getDatabase());

        // Crear y mostrar el menú principal
        MainMenu mainMenu = new MainMenu(controller);
        mainMenu.setVisible(true);
    }
}