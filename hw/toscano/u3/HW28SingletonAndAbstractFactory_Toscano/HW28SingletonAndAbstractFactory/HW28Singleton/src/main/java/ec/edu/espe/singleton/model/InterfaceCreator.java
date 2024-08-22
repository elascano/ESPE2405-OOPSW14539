
/*
 * License: Update as needed
 */

package ec.edu.espe.singleton.model;

/**
 * Singleton class responsible for creating user interface components based on the operating system.
 *
 * @author Damian Toscano
 */
public class InterfaceCreator {

    private static InterfaceCreator instance;
    private static String typeOfOS;

    // Private constructor to prevent instantiation
    private InterfaceCreator(String typeOfOS) {
        InterfaceCreator.typeOfOS = typeOfOS;
    }

    /**
     * Returns the singleton instance of the InterfaceCreator class.
     * If the instance does not exist, it will be created based on the provided operating system.
     *
     * @param typeOfOS The operating system type for which the interface is being created.
     * @return The singleton instance of InterfaceCreator.
     */
    public static InterfaceCreator getInstance(String typeOfOS) {
        if (instance == null) {
            instance = new InterfaceCreator(typeOfOS);
        }
        return instance;
    }

    /**
     * Simulates the creation of a button for the specified operating system.
     */
    public void createButton() {
        System.out.println("Creating a button for the operating system: " + typeOfOS);
    }

    /**
     * Simulates the creation of an interface for the specified operating system.
     */
    public void createInterface() {
        System.out.println("Creating an interface for the operating system: " + typeOfOS);
    }
}
