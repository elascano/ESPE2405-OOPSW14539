
package ec.edu.espe.examspeakers.view;

import ec.edu.espe.examspeakers.controller.SpeakerController;
import ec.edu.espe.examspeakers.model.Speaker;
import static java.awt.AWTEventMulticaster.add;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Sjean
 */
public class ListSpeakersView extends JFrame {
    private SpeakerController controller;
    private JTable speakerTable;

    public ListSpeakersView(SpeakerController controller) {
        this.controller = controller;
        setTitle("List Speakers");
        setSize(500, 300);

        List<Speaker> speakers = controller.listAllSpeakers();
        String[] columnNames = {"ID", "Brand", "Power", "Frequency", "Quality Index"};
        Object[][] data = new Object[speakers.size()][5];

        for (int i = 0; i < speakers.size(); i++) {
            Speaker speaker = speakers.get(i);
            data[i][0] = speaker.getId();
            data[i][1] = speaker.getBrand();
            data[i][2] = speaker.getPower();
            data[i][3] = speaker.getFrequency();
            data[i][4] = speaker.calculateQualityIndex();
        }

        speakerTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(speakerTable);
        add(scrollPane, BorderLayout.CENTER);
    }
}