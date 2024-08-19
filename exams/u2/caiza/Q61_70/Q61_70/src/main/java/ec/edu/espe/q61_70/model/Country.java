package ec.edu.espe.q61_70.model;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class Country {
    private int id;
    private String name;
    private String capital;
    private long population;
    private double area;
    private double populationDensity;

    // Constructor
    public Country(int id, String name, String capital, long population, double area) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        setPopulationDensity(); // Calculate density when created
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCapital() { return capital; }
    public void setCapital(String capital) { this.capital = capital; }

    public long getPopulation() { return population; }
    public void setPopulation(long population) { 
        this.population = population; 
        setPopulationDensity(); // Recalculate density when population changes
    }

    public double getArea() { return area; }
    public void setArea(double area) { 
        this.area = area; 
        setPopulationDensity(); // Recalculate density when area changes
    }

    public double getPopulationDensity() { return populationDensity; }
    public void setPopulationDensity() {
        if (area > 0) {
            this.populationDensity = population / area;
        } else {
            this.populationDensity = 0;
        }
    }

    @Override
    public String toString() {
        return "Country{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", capital='" + capital + '\'' +
               ", population=" + population +
               ", area=" + area +
               ", populationDensity=" + populationDensity +
               '}';
    }
}
