/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.areatriangle.view;

import ec.edu.espe.areatriangle.model.MongoDBConnection;
import ec.edu.espe.areatriangle.model.TriangleArea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class TriangleAreaGUI extends JFrame {
    private JTextField baseField;
    private JTextField heightField;
    private JTextField areaField;
    private JButton calculateButton;
    private JButton saveButton;

    private MongoDBConnection mongoDBConnection;

    public TriangleAreaGUI() {
        setTitle("Triangle Area Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        mongoDBConnection = new MongoDBConnection();

        // Create components
        baseField = new JTextField();
        heightField = new JTextField();
        areaField = new JTextField();
        areaField.setEditable(false);

        calculateButton = new JButton("Calculate");
        saveButton = new JButton("Save");

        // Add components to the frame
        add(new JLabel("Base:"));
        add(baseField);
        add(new JLabel("Height:"));
        add(heightField);
        add(new JLabel("Area:"));
        add(areaField);
        add(calculateButton);
        add(saveButton);

        // Add action listeners
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double base = Double.parseDouble(baseField.getText());
                double height = Double.parseDouble(heightField.getText());
                double area = TriangleArea.calculateArea(base, height);
                areaField.setText(String.valueOf(area));
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double base = Double.parseDouble(baseField.getText());
                double height = Double.parseDouble(heightField.getText());
                double area = Double.parseDouble(areaField.getText());
                mongoDBConnection.saveTriangleArea(base, height, area);
                JOptionPane.showMessageDialog(null, "Data saved successfully!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TriangleAreaGUI().setVisible(true);
            }
        });
    }
}
