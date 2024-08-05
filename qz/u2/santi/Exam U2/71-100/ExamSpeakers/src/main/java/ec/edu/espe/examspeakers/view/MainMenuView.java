
package ec.edu.espe.examspeakers.view;

import ec.edu.espe.examspeakers.controller.SpeakerController;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

/**
 *
 * @author Sjean
 */
public class MainMenuView extends JFrame {
    private SpeakerController controller;

    public MainMenuView(SpeakerController controller) {
        this.controller = controller;
        
        setTitle("Speaker Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception ex) {
                
            }
        }

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        JMenu speakerMenu = new JMenu("Speakers");
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(speakerMenu);
        menuBar.add(helpMenu);
        
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem createSpeakerItem = new JMenuItem("Create Speaker");
        JMenuItem listSpeakersItem = new JMenuItem("List Speakers");
        JMenuItem aboutItem = new JMenuItem("About");
        fileMenu.add(exitItem);
        speakerMenu.add(createSpeakerItem);
        speakerMenu.add(listSpeakersItem);
        helpMenu.add(aboutItem);
    
        exitItem.addActionListener(e -> System.exit(0));
        createSpeakerItem.addActionListener(e -> new CreateSpeakerView(controller).setVisible(true));
        listSpeakersItem.addActionListener(e -> new ListSpeakersView(controller).setVisible(true));
        aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Speaker Management System\nVersion 1.0\nDeveloped by Your Name", "About", JOptionPane.INFORMATION_MESSAGE));
      
        JPanel mainPanel = new JPanel(new BorderLayout());
        setContentPane(mainPanel);
    
        JLabel welcomeLabel = new JLabel("Welcome to Speaker Management System", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        mainPanel.add(welcomeLabel, BorderLayout.CENTER);
    
        JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        statusBar.setBorder(BorderFactory.createLoweredBevelBorder());
        JLabel statusLabel = new JLabel("Ready");
        statusBar.add(statusLabel);
        mainPanel.add(statusBar, BorderLayout.SOUTH);
    }
}
