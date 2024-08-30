package ec.edu.espe.guifactory.model;

import java.awt.Button;
import java.awt.Menu;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory {
    
    @Override
    public Button createButton() {
        return new LinuxButton("Play");
    }

    @Override
    public Menu createMenu() {
        return new LinuxMenu("File");
    }  
}
