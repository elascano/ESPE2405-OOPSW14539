
package ec.edu.espe.designpatterns;

/**
 *
 * @author Sjean
 */
public class Main {

    public static void main(String[] args) {
        // Accessing the singleton instance
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        
        // Using the singleton instance
        System.out.println("Config Value: " + configManager.getConfigValue());
        
        // Setting a new configuration value
        configManager.setConfigValue("Updated Config Value");
        
        // Accessing the singleton again to show the updated value
        ConfigurationManager anotherConfigManagerReference = ConfigurationManager.getInstance();
        System.out.println("Updated Config Value: " + anotherConfigManagerReference.getConfigValue());
    }
}