package ec.edu.espe.presidentialsystem.view;

import ec.edu.espe.presidentialsystem.controller.EmployeeController;
import ec.edu.espe.presidentialsystem.model.Clerk;
import ec.edu.espe.presidentialsystem.model.Manager;
import ec.edu.espe.presidentialsystem.model.President;
import ec.edu.espe.presidentialsystem.model.Teller;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class Main {
    public static void main(String[] args) {
        // Create view
        EmployeeView view = new EmployeeView();

        // Create model
        Manager manager = new Manager("John Doe");
        Clerk clerk = new Clerk("Jane Smith");
        Teller teller = new Teller("Emily Johnson");
        President president = President.getPresident("Alice Brown");

        // Create controllers
        EmployeeController managerController = new EmployeeController(manager, view);
        EmployeeController clerkController = new EmployeeController(clerk, view);
        EmployeeController tellerController = new EmployeeController(teller, view);
        EmployeeController presidentController = new EmployeeController(president, view);

        // Setup relationships
        manager.add(clerk);
        manager.add(teller);
        president.add(manager);

        // Update view through controllers
        System.out.println("Displaying details for President:");
        presidentController.updateView();

        System.out.println("\nDisplaying details for Manager:");
        managerController.updateView();

        System.out.println("\nDisplaying details for Clerk:");
        clerkController.updateView();

        System.out.println("\nDisplaying details for Teller:");
        tellerController.updateView();
    }    
}
