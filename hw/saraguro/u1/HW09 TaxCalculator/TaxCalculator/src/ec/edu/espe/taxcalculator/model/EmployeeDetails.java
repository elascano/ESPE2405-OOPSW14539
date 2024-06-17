
package ec.edu.espe.taxcalculator.model;

/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class EmployeeDetails {
    private String name;
    private float salary;
    private int dependents;
    private String maritalStatus;
    private float deductions;

    public EmployeeDetails(String name, float salary, int dependents, String maritalStatus, float deductions) {
        this.name = name;
        this.salary = salary;
        this.dependents = dependents;
        this.maritalStatus = maritalStatus;
        this.deductions = deductions;
    }
    

    @Override
    public String toString() {
        return "EmployeeDetails{" + "name=" + getName() + ", salary=" + getSalary() + ", dependents=" + getDependents() + ", maritalStatus=" + getMaritalStatus() + ", deductions=" + getDeductions() + '}';
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
     * @return the dependents
     */
    public int getDependents() {
        return dependents;
    }

    /**
     * @param dependents the dependents to set
     */
    public void setDependents(int dependents) {
        this.dependents = dependents;
    }

    /**
     * @return the maritalStatus
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * @param maritalStatus the maritalStatus to set
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * @return the deductions
     */
    public float getDeductions() {
        return deductions;
    }

    /**
     * @param deductions the deductions to set
     */
    public void setDeductions(float deductions) {
        this.deductions = deductions;
    }
    
    
 
}