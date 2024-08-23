package ec.espe.edu.hwabstractfactory.view;

import java.util.Scanner;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class FormView {

    private Scanner scanner;

    public FormView() {
        scanner = new Scanner(System.in);
    }

    public void renderTextField(String fieldName) {
        System.out.print(fieldName + ": ");
    }

    public String getInput() {
        return scanner.nextLine();
    }

    public void displayButton() {
        System.out.println("[Button] Submit");
    }

    public void displayTextField() {
        System.out.println("[TextField] Enter text here...");
    }

    public void displayFieldValue(String fieldName, String value) {
        System.out.println(fieldName + ": " + value);
    }
}
