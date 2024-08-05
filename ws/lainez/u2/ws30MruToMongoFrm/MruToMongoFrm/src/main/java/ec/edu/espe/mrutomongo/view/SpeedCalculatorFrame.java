/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mrutomongo.view;

import ec.edu.espe.testcasemru.model.ComputeSpeed;
import ec.edu.espe.testcasemru.util.MruToMongo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpeedCalculatorFrame extends JFrame {
    private JTextField txtDistance;
    private JTextField txtTime;
    private JLabel lblSpeed;
    private JButton btnCalculate;
    private MRUToMongo mruToMongo;

    public SpeedCalculatorFrame() {
        setTitle("Calculadora de Velocidad MRU");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel lblDistance = new JLabel("Distancia (m):");
        lblDistance.setBounds(50, 50, 100, 30);
        add(lblDistance);

        txtDistance = new JTextField();
        txtDistance.setBounds(150, 50, 150, 30);
        add(txtDistance);

        JLabel lblTime = new JLabel("Tiempo (s):");
        lblTime.setBounds(50, 100, 100, 30);
        add(lblTime);

        txtTime = new JTextField();
        txtTime.setBounds(150, 100, 150, 30);
        add(txtTime);

        btnCalculate = new JButton("Calcular");
        btnCalculate.setBounds(50, 150, 250, 30);
        add(btnCalculate);

        lblSpeed = new JLabel("Velocidad (m/s):");
        lblSpeed.setBounds(50, 200, 250, 30);
        add(lblSpeed);

        mruToMongo = new MRUToMongo();

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSpeed();
            }
        });
    }

    private void calculateSpeed() {
        try {
            double distance = Double.parseDouble(txtDistance.getText());
            double time = Double.parseDouble(txtTime.getText());

            ComputeSpeed computeSpeed = new ComputeSpeed(distance, time);
            double speed = computeSpeed.getSpeed();

            lblSpeed.setText("Velocidad (m/s): " + speed);

            mruToMongo.saveSpeedRecord(distance, time, speed);

            JOptionPane.showMessageDialog(this, "Velocidad calculada y guardada en la base de datos.");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos para la distancia y el tiempo.");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SpeedCalculatorFrame().setVisible(true);
            }
        });
    }
}