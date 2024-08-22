package ec.edu.espe.composite.model;

import java.util.Vector;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public abstract class Supervisor extends Employee {

    protected Vector<Employee> directReports = new Vector<>();

    @Override
    public void stateName() {
        super.stateName(); 
        if (directReports.size() > 0) { 
            for (int i = 0; i < directReports.size(); ++i) {
                directReports.elementAt(i).stateName();
            }
        }
    }

    public void add(Employee anEmployee) {
        this.directReports.addElement(anEmployee);
    }
}
