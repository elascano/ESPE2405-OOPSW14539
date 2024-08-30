/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.managementuniversity.view;

/**
 *
 * @author WINDOWS
 */
import ec.edu.espe.managementuniversity.controller.UniversityController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UniversityUpdateView extends JFrame {
    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtYear;
    private JTextField txtStudentCount;
    private JButton btnUpdateUniversity;
    private JButton btnBackToMenu;

    public UniversityUpdateView(UniversityController controller) {
        setTitle("Actualizar Universidad");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new JLabel("ID de Universidad:"));
        txtId = new JTextField(20);
        add(txtId);

        add(new JLabel("Nombre:"));
        txtName = new JTextField(20);
        add(txtName);

        add(new JLabel("Año de Fundación:"));
        txtYear = new JTextField(20);
        add(txtYear);

        add(new JLabel("Número de Estudiantes:"));
        txtStudentCount = new JTextField(20);
        add(txtStudentCount);

        btnUpdateUniversity = new JButton("Actualizar Universidad");
        add(btnUpdateUniversity);

        btnBackToMenu = new JButton("Volver al Menú");
        add(btnBackToMenu);

        btnUpdateUniversity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = txtId.getText();
                String name = txtName.getText();
                int year = Integer.parseInt(txtYear.getText());
                int studentCount = Integer.parseInt(txtStudentCount.getText());
                controller.updateUniversity(id, name, year, studentCount);
                JOptionPane.showMessageDialog(null, "Universidad actualizada exitosamente!");
            }
        });

        btnBackToMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu mainMenu = new MainMenu(controller);
                mainMenu.setVisible(true);
                dispose();
            }
        });
    }
}
