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

public class UniversityDeleteView extends JFrame {
    private JTextField txtId;
    private JButton btnDeleteUniversity;
    private JButton btnBackToMenu;

    public UniversityDeleteView(UniversityController controller) {
        setTitle("Eliminar Universidad");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new JLabel("ID de Universidad:"));
        txtId = new JTextField(20);
        add(txtId);

        btnDeleteUniversity = new JButton("Eliminar Universidad");
        add(btnDeleteUniversity);

        btnBackToMenu = new JButton("Volver al Menú");
        add(btnBackToMenu);

        btnDeleteUniversity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = txtId.getText();
                controller.deleteUniversity(id);
                JOptionPane.showMessageDialog(null, "Universidad eliminada exitosamente!");
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
