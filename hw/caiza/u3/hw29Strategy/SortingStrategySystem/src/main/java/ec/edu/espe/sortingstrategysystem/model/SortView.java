package ec.edu.espe.sortingstrategysystem.model;
import ec.edu.espe.sortingstrategysystem.view.FrmSortView;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class SortView extends FrmSortView{
    private JTextField inputField = new JTextField(20);
    private JComboBox<String> algorithmCombo = new JComboBox<>(new String[]{"BubbleSort", "QuickSort", "InsertionSort"});
    private JButton sortButton = new JButton("Sort");
    private JTextArea resultArea = new JTextArea(5, 20);

    public SortView() {
        // Configuración básica de la ventana
        setTitle("Sorting Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Crear el panel y añadir componentes
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter numbers (comma-separated):"));
        panel.add(inputField);
        panel.add(new JLabel("Select Algorithm:"));
        panel.add(algorithmCombo);
        panel.add(sortButton);
        panel.add(new JScrollPane(resultArea));

        // Añadir el panel a la ventana
        getContentPane().add(panel, BorderLayout.CENTER);
    }

    public String getInputText() {
        return inputField.getText();
    }

    public String getSelectedAlgorithm() {
        return (String) algorithmCombo.getSelectedItem();
    }

    public void setResult(String result) {
        resultArea.setText(result);
    }

    public JButton getSortButton() {
        return sortButton;
    }    
}
