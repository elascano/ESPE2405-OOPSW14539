package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Alvarado Grefa Frank Byte
 */
public abstract class GUIFactory {

    public static GUIFactory getFactory(String os_type) {
        int sys = readFromConfigFile(os_type);

        if (sys == 0) {
            return (new WindowsFactory());
        }
        if (sys == 1) {
            return (new LinuxFactory());
        } else {
            System.out.println("No os founded");
            return null;
        }

    }

    private static int readFromConfigFile(String os_type) {
        int option = 0;
        if (os_type == "Linux") {
            option = 1;
        }

        if (os_type == "Windows") {
            option = 0;
        }
        return option;
    }

    public abstract Button createButton();

    public abstract Menu createMenu();

}
