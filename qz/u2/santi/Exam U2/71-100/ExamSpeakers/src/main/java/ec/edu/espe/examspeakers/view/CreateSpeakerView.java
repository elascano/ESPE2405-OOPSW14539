
package ec.edu.espe.examspeakers.view;

import ec.edu.espe.examspeakers.controller.SpeakerController;
import ec.edu.espe.examspeakers.model.Speaker;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sjean
 */
public class CreateSpeakerView extends JFrame {
    private SpeakerController controller;
    private JTextField idField, brandField, powerField, frequencyField;

    public CreateSpeakerView(SpeakerController controller) {
        this.controller = controller;
        setTitle("Create Speaker");
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Brand:"));
        brandField = new JTextField();
        add(brandField);

        add(new JLabel("Power:"));
        powerField = new JTextField();
        add(powerField);

        add(new JLabel("Frequency:"));
        frequencyField = new JTextField();
        add(frequencyField);

        JButton createButton = new JButton("Create");
        add(createButton);

        createButton.addActionListener(e -> createSpeaker());
    }

    private void createSpeaker() {
        try {
            String id = idField.getText();
            String brand = brandField.getText();
            double power = Double.parseDouble(powerField.getText());
            double frequency = Double.parseDouble(frequencyField.getText());

            Speaker speaker = new Speaker(id, brand, power, frequency);
            controller.createSpeaker(speaker);
            JOptionPane.showMessageDialog(this, "Speaker created successfully!");
            dispose();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please check your values.");
        }
    }
}
