package ec.edu.espe.presidentialsystem.model;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public abstract class Employee {
    protected String name = "not assigned yet";
    protected String title = "not assigned yet";

    public void stateName() {
        System.out.println(title + " " + name);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }    
}
