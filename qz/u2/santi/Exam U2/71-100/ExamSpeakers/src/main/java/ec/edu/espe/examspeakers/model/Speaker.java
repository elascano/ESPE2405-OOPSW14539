
package ec.edu.espe.examspeakers.model;

/**
 *
 * @author Sjean
 */
public class Speaker {
    private String id;
    private String brand;
    private double power;
    private double frequency;

    public Speaker(String id, String brand, double power, double frequency) {
        this.id = id;
        this.brand = brand;
        this.power = power;
        this.frequency = frequency;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public double getPower() { return power; }
    public void setPower(double power) { this.power = power; }
    public double getFrequency() { return frequency; }
    public void setFrequency(double frequency) { this.frequency = frequency; }

    public double calculateQualityIndex() {
        return power * frequency;
    }
}