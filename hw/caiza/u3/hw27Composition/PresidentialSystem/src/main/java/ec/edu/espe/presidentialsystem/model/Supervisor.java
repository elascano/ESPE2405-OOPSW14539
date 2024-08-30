package ec.edu.espe.presidentialsystem.model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public abstract  class Supervisor extends Employee{
    
    protected List<Employee> directReports = new ArrayList<>();

    @Override
    public void stateName() {
        super.stateName();
        if (!directReports.isEmpty()) {
            for (Employee employee : directReports) {
                employee.stateName();
            }
        }
    }

    public void add(Employee anEmployee) {
        this.directReports.add(anEmployee);
    }    
}
