
package ec.edu.espe.mazegenerator.view;

/**
 *
 * @author Marco Padilla
 */

import ec.edu.espe.mazegenerator.controller.Maze;
import ec.edu.espe.mazegenerator.controller.MazeGenerator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MazeFrame extends JFrame {

    private MazePanel mazePanel;
    private JTextField widthField;
    private JTextField heightField;
    private MazeGenerator mazeGenerator;

    public MazeFrame(MazeGenerator mazeGenerator) {
        this.mazeGenerator = mazeGenerator;

        setTitle("Maze Generator");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mazePanel = new MazePanel();
        add(mazePanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 2));

        controlPanel.add(new JLabel("Width:"));
        widthField = new JTextField("10");
        controlPanel.add(widthField);

        controlPanel.add(new JLabel("Height:"));
        heightField = new JTextField("10");
        controlPanel.add(heightField);

        JButton generateButton = new JButton("Generate Maze");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateMaze();
            }
        });
        controlPanel.add(generateButton);

        add(controlPanel, BorderLayout.SOUTH);
    }

    private void generateMaze() {
        int width = Integer.parseInt(widthField.getText());
        int height = Integer.parseInt(heightField.getText());

        Maze maze = mazeGenerator.generateMaze(width, height);
        mazePanel.setMaze(maze);
    }
}
