
package ec.edu.espe.exam.view;

/**
 *
 * @author David Pilaguano, Lenovo , DCCO-ESPE
 */
import ec.edu.espe.exam.controller.ProfessorController;
import ec.edu.espe.exam.model.Professor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmDeleteProfessor extends JFrame {
    private JTextField txtId;
    private JButton btnDelete;
    private JButton btnSearch;
    private JLabel lblResult;

    public FrmDeleteProfessor() {
        setTitle("Delete Professor");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel lblId = new JLabel("Professor ID:");
        txtId = new JTextField(20);
        btnSearch = new JButton("Search");
        btnDelete = new JButton("Delete");
        lblResult = new JLabel();

        add(lblId);
        add(txtId);
        add(btnSearch);
        add(btnDelete);
        add(lblResult);

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchProfessor();
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteProfessor();
            }
        });
    }

    private void searchProfessor() {
        String id = txtId.getText().trim();
        if (!id.isEmpty()) {
            Professor professor = ProfessorController.getInstance().findProfessorById(id);
            if (professor != null) {
                lblResult.setText(professor.toString());
            } else {
                lblResult.setText("Professor not found");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a valid ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteProfessor() {
        String id = txtId.getText().trim();
        if (!id.isEmpty()) {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this professor?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                boolean deleted = ProfessorController.getInstance().deleteProfessor(id);
                if (deleted) {
                    JOptionPane.showMessageDialog(this, "Professor deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    txtId.setText("");
                    lblResult.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete professor", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a valid ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FrmDeleteProfessor().setVisible(true);
            }
        });
    }
}