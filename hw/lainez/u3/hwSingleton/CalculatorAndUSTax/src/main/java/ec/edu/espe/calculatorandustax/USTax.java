/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculatorandustax;

/**
 *
 * @author WINDOWS
 */
public class USTax {
    private static USTax instance;

    // Private constructor to prevent instantiation
    private USTax() {}

    // Public method to provide access to the single instance
    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    // Example method to calculate sales tax total
    public float salesTotal() {
        // Implement sales tax calculation logic here
        return 0.0f; // Placeholder return value
    }
}
