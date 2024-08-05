
package ec.edu.espe.studentmanagement.view;

/**
 *
 * @author Adrian Padilla
 */

import ec.edu.espe.studentmanagement.controller.StudentController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentCreateView extends JFrame {
    private JTextField txtName;
    private JTextField txtAge;
    private JTextField txtGrade;
    private JButton btnAddStudent;

    public StudentCreateView(StudentController controller) {
        setTitle("Add Student");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(new JLabel("Name:"));
        txtName = new JTextField(20);
        add(txtName);

        add(new JLabel("Age:"));
        txtAge = new JTextField(20);
        add(txtAge);

        add(new JLabel("Grade:"));
        txtGrade = new JTextField(20);
        add(txtGrade);

        btnAddStudent = new JButton("Add Student");
        add(btnAddStudent);

        btnAddStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                int age = Integer.parseInt(txtAge.getText());
                int grade = Integer.parseInt(txtGrade.getText());
                controller.createStudent(name, age, grade);
                JOptionPane.showMessageDialog(null, "Student added successfully!");
            }
        });
    }
}