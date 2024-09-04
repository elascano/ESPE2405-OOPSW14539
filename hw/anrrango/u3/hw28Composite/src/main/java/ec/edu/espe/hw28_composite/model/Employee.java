package ec.edu.espe.hw28_composite.model;

/**
 *
 * @author Damian Toscano
 */
public abstract class Employee {
    String name = "not assigned yet";
    String title = "not assigned yet";
    String task = "no task assigned";

    public void stateName() {
        System.out.println(title + " " + name);
    }

    public void setTask(String task) {
        this.task = task;
        System.out.println(title + " " + name + " has been assigned the task: " + task);
    }

    public void performTask() {
        System.out.println(title + " " + name + " is performing the task: " + task);
    }
}
