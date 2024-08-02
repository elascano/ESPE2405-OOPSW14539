
package ec.edu.espe.studentmanagement.view;

/**
 *
 * @author WINDOWS
 */
import ec.edu.espe.studentmanagement.controller.StudentController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JButton btnCreateStudent;
    private JButton btnListStudents;

    public MainMenu(StudentController controller) {
        setTitle("Main Menu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        btnCreateStudent = new JButton("Create Student");
        btnListStudents = new JButton("List Students");

        add(btnCreateStudent);
        add(btnListStudents);

        btnCreateStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentCreateView createView = new StudentCreateView(controller);
                createView.setVisible(true);
                dispose();
            }
        });

        btnListStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.getView().displayAllStudents(controller.getAllStudents());
            }
        });
    }
}