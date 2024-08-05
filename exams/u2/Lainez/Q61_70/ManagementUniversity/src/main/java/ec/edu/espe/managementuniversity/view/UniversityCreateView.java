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

public class UniversityCreateView extends JFrame {
    private JTextField txtName;
    private JTextField txtYear;
    private JTextField txtStudentCount;
    private JButton btnAddUniversity;

    public UniversityCreateView(UniversityController controller) {
        setTitle("Agregar Universidad");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new JLabel("Nombre:"));
        txtName = new JTextField(20);
        add(txtName);

        add(new JLabel("Año de Fundación:"));
        txtYear = new JTextField(20);
        add(txtYear);

        add(new JLabel("Número de Estudiantes:"));
        txtStudentCount = new JTextField(20);
        add(txtStudentCount);

        btnAddUniversity = new JButton("Agregar Universidad");
        add(btnAddUniversity);

        btnAddUniversity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                int year = Integer.parseInt(txtYear.getText());
                int studentCount = Integer.parseInt(txtStudentCount.getText());
                controller.createUniversity(name, year, studentCount);
                JOptionPane.showMessageDialog(null, "Universidad agregada exitosamente!");
            }
        });
    }
}
