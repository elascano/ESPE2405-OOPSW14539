
package ec.edu.espe.createmaze.view;

import ec.edu.espe.createmaze.controller.MazeController;
import ec.edu.espe.createmaze.model.MazeModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sjean
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MazeModel model = new MazeModel();
                MazeView view = new MazeView(model);
                MazeController controller = new MazeController(model, view);

                JFrame frame = new JFrame("Maze Generator");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(view);

                JButton generateButton = new JButton("Generate Maze");
                generateButton.addActionListener(controller.getGenerateMazeListener());

                JPanel panel = new JPanel();
                panel.add(generateButton);

                frame.add(panel, "South");
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
