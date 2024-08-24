package ec.edu.espe.hw27_template.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class Tea extends CaffeineBeverage {

    void brew() {
        System.out.println("Sleep the tea");
    }

    void addCondiments() {
        System.out.println("Adding the lemon");
    }

    public boolean wantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like lemon with your tea (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("An error occurred while trying to read your input.");
        }
        return answer;
    }
}
