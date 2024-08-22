package ec.edu.espe.presidentialsystem.controller;
import ec.edu.espe.presidentialsystem.model.Employee;
import ec.edu.espe.presidentialsystem.view.EmployeeView;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class EmployeeController {
    private Employee employee;
    private EmployeeView view;

    public EmployeeController(Employee employee, EmployeeView view) {
        this.employee = employee;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        employee.setName(name);
    }

    public void setEmployeeTitle(String title) {
        employee.setTitle(title);
    }

    public void updateView() {
        view.displayEmployeeDetails(employee);
    }    
}
