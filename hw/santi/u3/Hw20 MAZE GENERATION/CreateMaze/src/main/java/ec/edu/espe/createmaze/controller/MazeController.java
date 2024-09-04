
package ec.edu.espe.createmaze.controller;

import ec.edu.espe.createmaze.model.MazeModel;
import ec.edu.espe.createmaze.view.MazeView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sjean
 */
public class MazeController {
    private MazeModel model;
    private MazeView view;

    public MazeController(MazeModel model, MazeView view) {
        this.model = model;
        this.view = view;
    }

    public void generateMaze(int width, int height) {
        model.generateMaze(width, height);
    }

    public ActionListener getGenerateMazeListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = javax.swing.JOptionPane.showInputDialog("Enter maze size (width height):");
                if (input != null) {
                    String[] dimensions = input.split(" ");
                    if (dimensions.length == 2) {
                        try {
                            int width = Integer.parseInt(dimensions[0]);
                            int height = Integer.parseInt(dimensions[1]);
                            generateMaze(width, height);
                        } catch (NumberFormatException ex) {
                            javax.swing.JOptionPane.showMessageDialog(null, "Invalid input. Please enter two numbers.");
                        }
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(null, "Invalid input. Please enter two numbers separated by a space.");
                    }
                }
            }
        };
    }
}