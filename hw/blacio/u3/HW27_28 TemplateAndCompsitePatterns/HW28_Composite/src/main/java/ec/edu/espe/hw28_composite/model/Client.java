package ec.edu.espe.hw28_composite.model;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class Client {
    public static Employee employee;

    public static void doClientTasks() {
        System.out.println("Client is evaluating the employee...");

        // Client assigns a task
        employee.setTask("Design a new software module");

        // Employee completes the task
        employee.performTask();

        employee.stateName();
    }
}
