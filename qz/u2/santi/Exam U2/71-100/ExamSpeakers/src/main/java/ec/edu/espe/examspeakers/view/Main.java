
package ec.edu.espe.examspeakers.view;

import ec.edu.espe.examspeakers.controller.SpeakerController;
import ec.edu.espe.examspeakers.controller.SpeakerDAO;
import ec.edu.espe.examspeakers.controller.SpeakerDAOMongoDB;

/**
 *
 * @author Sjean
 */
public class Main {
    public static void main(String[] args) {
        SpeakerDAO speakerDAO = new SpeakerDAOMongoDB();
        SpeakerController controller = new SpeakerController(speakerDAO);
        MainMenuView mainMenu = new MainMenuView(controller);
        mainMenu.setVisible(true);
    }
}