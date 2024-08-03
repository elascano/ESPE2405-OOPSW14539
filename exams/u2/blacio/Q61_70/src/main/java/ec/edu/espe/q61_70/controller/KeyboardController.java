package ec.edu.espe.q61_70.controller;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
import ec.edu.espe.q61_70.model.Keyboard;
import ec.edu.espe.q61_70.view.KeyboardView;
import java.util.ArrayList;
import java.util.List;

public class KeyboardController {

    private List<Keyboard> keyboards;
    private KeyboardView view;
    private int idCounter = 1;

    public KeyboardController(KeyboardView view) {
        this.keyboards = new ArrayList<>();
        this.view = view;
    }

    public void addKeyboard(String name, float price, float weight) {
        Keyboard keyboard = new Keyboard(idCounter++, name, price, weight);
        keyboards.add(keyboard);
    }

    public void removeKeyboard(int id) {
        keyboards.removeIf(keyboard -> keyboard.getId() == id);
    }

    public void updateKeyboard(Keyboard updatedKeyboard) {
        for (Keyboard keyboard : keyboards) {
            if (keyboard.getId() == updatedKeyboard.getId()) {
                keyboard.setName(updatedKeyboard.getName());
                keyboard.setPrice(updatedKeyboard.getPrice());
                keyboard.setWeight(updatedKeyboard.getWeight());
            }
        }
    }

    public Keyboard getKeyboard(int id) {
        for (Keyboard keyboard : keyboards) {
            if (keyboard.getId() == id) {
                return keyboard;
            }
        }
        return null; // Or throw an exception if preferred
    }

    public void listKeyboards() {
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
