package ec.edu.espe.designpatterns;

/**
 *
 * @author Sjean
 */
public class ConfigurationManager {

    // Static variable to hold the single instance of the class
    private static ConfigurationManager instance;
    
    // Example of configuration settings stored within the singleton
    private String configValue;

    // Private constructor to prevent instantiation
    private ConfigurationManager() {
        // Load configuration settings (this is just a placeholder)
        configValue = "Default Config Value";
    }

    // Public method to provide access to the single instance
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    // Example of a method to get the configuration value
    public String getConfigValue() {
        return configValue;
    }

    // Example of a method to set the configuration value
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}