/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.managementuniversity.view;

/**
 *
 * @author Ricardo lainez
 */
import ec.edu.espe.managementuniversity.controller.UniversityController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JButton btnCreateUniversity;
    private JButton btnListUniversities;
    private JButton btnUpdateUniversity;
    private JButton btnDeleteUniversity;

    public MainMenu(UniversityController controller) {
        setTitle("Menú Principal");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        btnCreateUniversity = new JButton("Crear Universidad");
        btnListUniversities = new JButton("Listar Universidades");
        btnUpdateUniversity = new JButton("Actualizar Universidad");
        btnDeleteUniversity = new JButton("Eliminar Universidad");

        add(btnCreateUniversity);
        add(btnListUniversities);
        add(btnUpdateUniversity);
        add(btnDeleteUniversity);

        btnCreateUniversity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UniversityCreateView createView = new UniversityCreateView(controller);
                createView.setVisible(true);
                dispose();
            }
        });

        btnListUniversities.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.getView().displayAllUniversities(controller.getAllUniversities());
            }
        });

        btnUpdateUniversity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UniversityUpdateView updateView = new UniversityUpdateView(controller);
                updateView.setVisible(true);
                dispose();
            }
        });

        btnDeleteUniversity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UniversityDeleteView deleteView = new UniversityDeleteView(controller);
                deleteView.setVisible(true);
                dispose();
            }
        });
    }
}
