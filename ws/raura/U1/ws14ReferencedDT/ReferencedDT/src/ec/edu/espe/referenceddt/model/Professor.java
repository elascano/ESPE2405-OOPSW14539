package ec.edu.espe.referenceddt.model;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class Professor {
    
    private int id;
    private String name;
    private float salary;
    private boolean active;

    public Professor(int id, String name, float salary, boolean active) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.active = active;
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + getId() + ", name=" + getName() + ", salary=" + getSalary() + ", active=" + isActive() + '}';
    }

   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
    
}
