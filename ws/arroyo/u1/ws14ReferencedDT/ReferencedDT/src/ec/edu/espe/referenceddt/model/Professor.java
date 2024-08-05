package ec.edu.espe.referenceddt.model;

/**
 *
 *  @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class Professor {
    private int id;
    private String name;
    private float salary;
    private boolean active;

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", active=" + active + '}';
    }
    
    public Professor(int id, String name, float salary, boolean active) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.active = active;
    }

    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }
    
    
    
    
}
