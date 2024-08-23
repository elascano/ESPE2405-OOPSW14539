package ec.edu.espe.abstractfactory.controller;

import ec.edu.espe.abstractfactory.model.Button;
import ec.edu.espe.abstractfactory.model.Menu;

/**
 *
 * @author Leidy Saraguro
 */

public abstract class GUIFactory {
    public static GUIFactory getFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0)
            return new WinFactory();
        else
            return new LinuxFactory();
    }
    
    private static int readFromConfigFile(String key) {
        return 0;
    }

    public abstract Button createButton();
    public abstract Menu createMenu();
}
