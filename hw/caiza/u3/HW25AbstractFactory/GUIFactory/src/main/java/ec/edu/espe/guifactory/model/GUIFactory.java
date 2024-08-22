package ec.edu.espe.guifactory.model;
import java.awt.Button;
import java.awt.Menu;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new LinuxFactory();
        }
    }

    public abstract Button createButton();
    public abstract Menu createMenu();

    private static int readFromConfigFile(String param) {
        // Simulation: 0 for Windows, 1 for Linux.
        return 0;
    }   
}
