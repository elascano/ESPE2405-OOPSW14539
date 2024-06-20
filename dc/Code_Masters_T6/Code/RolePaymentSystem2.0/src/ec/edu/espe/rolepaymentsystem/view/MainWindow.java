/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.rolepaymentsystem.view;
import ec.edu.espe.rolepaymentsystem.controller.EmployeeManager;
import ec.edu.espe.rolepaymentsystem.controller.LoginScreen;
import ec.edu.espe.rolepaymentsystem.controller.PayrollGenerator;
/**
 *
 * @author Code Masters
 */
public class MainWindow {
    public static void main(String[] args) {
            LoginScreen loginScreen = new LoginScreen();
            loginScreen.checkPassword();
            EmployeeManager employeeManager = new EmployeeManager();
            PayrollGenerator payrollGenerator = new PayrollGenerator();
            UserInterface userInterface = new UserInterface(employeeManager, payrollGenerator);
        
            userInterface.showMainMenu();
    }
}
 
