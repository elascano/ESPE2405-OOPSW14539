
package ec.edu.espe.mazegenerator.view;

/**
 *
 * @author Marco Padilla
 */
import ec.edu.espe.mazegenerator.controller.MazeGenerator;
import ec.edu.espe.mazegenerator.controller.SimpleMazeGenerator;
import javax.swing.*;

public class MazeApplication {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MazeGenerator generator = new SimpleMazeGenerator();
                MazeFrame frame = new MazeFrame(generator);
                frame.setVisible(true);
            }
        });
    }
}
