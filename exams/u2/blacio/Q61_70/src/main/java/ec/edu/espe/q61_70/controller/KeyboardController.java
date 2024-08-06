package ec.edu.espe.q61_70.controller;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
import ec.edu.espe.q61_70.model.Keyboard;
import ec.edu.espe.q61_70.view.KeyboardView;
import java.util.List;

public class KeyboardController {

    private KeyboardView view;
    private int idCounter = 1; // This can be managed by the database in a real-world scenario

    public KeyboardController(KeyboardView view) {
        this.view = view;
    }

    public void addKeyboard(String name, float price, float weight) {
        // Generate a unique ID for the new keyboard
        int id = idCounter++;
        // Save keyboard to the database
        ToCloud.uploadKeyboardData(id, name, price, weight, 1, price, weight);
    }

    public void removeKeyboard(int id) {
        // Remove the keyboard from the database
        ToCloud.deleteKeyboardById(id);
    }

    public void updateKeyboard(Keyboard updatedKeyboard) {
        // Update the keyboard in the database
        ToCloud.uploadKeyboardData(
                updatedKeyboard.getId(),
                updatedKeyboard.getName(),
                updatedKeyboard.getPrice(),
                updatedKeyboard.getWeight(),
                updatedKeyboard.getAmount(),
                updatedKeyboard.getTotalPrice(),
                updatedKeyboard.getApproximatedWeight()
        );
    }

    public Keyboard getKeyboard(int id) {
        return ToCloud.findKeyboardById(id);
    }

    public void listKeyboards() {

        List<Keyboard> keyboards = ToCloud.getAllKeyboards();
        view.displayKeyboardList(keyboards);
    }

    public void showKeyboardDetails(int id) {
        Keyboard keyboard = getKeyboard(id);
        if (keyboard != null) {
            view.displayKeyboardDetails(keyboard);
        } else {
            System.out.println("Keyboard not found");
        }
    }
}
