/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.managementuniversity.view;

/**
 *
 * @author Ricardo lainez
 */
import ec.edu.espe.managementuniversity.model.University;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class UniversityView {
    public void displayUniversityDetails(University university) {
        JOptionPane.showMessageDialog(null, 
            "Nombre: " + university.getName() + "\n" +
            "Año de Fundación: " + university.getEstablishedYear() + "\n" +
            "Número de Estudiantes: " + university.getStudentCount());
    }

    public void displayAllUniversities(List<University> universities) {
        String[] columnNames = {"ID", "Nombre", "Año de Fundación", "Número de Estudiantes"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (University university : universities) {
            Object[] row = {
                university.getId(),
                university.getName(),
                university.getEstablishedYear(),
                university.getStudentCount()
            };
            model.addRow(row);
        }

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Universidades", JOptionPane.INFORMATION_MESSAGE);
    }
}

