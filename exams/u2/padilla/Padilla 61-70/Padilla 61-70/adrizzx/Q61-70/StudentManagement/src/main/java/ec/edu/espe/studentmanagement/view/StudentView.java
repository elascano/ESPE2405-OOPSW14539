
package ec.edu.espe.studentmanagement.view;

/**
 *
 * @author WINDOWS
 */
import ec.edu.espe.studentmanagement.model.Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class StudentView {
    public void displayStudentDetails(Student student) {
        JOptionPane.showMessageDialog(null,
                "Name: " + student.getName() + "\n" +
                        "Age: " + student.getAge() + "\n" +
                        "Grade: " + student.getGrade());
    }

    public void displayAllStudents(List<Student> students) {
        String[] columnNames = {"ID", "Name", "Age", "Grade"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (Student student : students) {
            Object[] row = {
                    student.getId(),
                    student.getName(),
                    student.getAge(),
                    student.getGrade()
            };
            model.addRow(row);
        }

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        JOptionPane.showMessageDialog(null, scrollPane, "Student List", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
