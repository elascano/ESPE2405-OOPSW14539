package ec.edu.espe.q61_70.view;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
import ec.edu.espe.q61_70.model.Keyboard;
import java.util.List;

public class KeyboardView {

    public void displayKeyboardDetails(Keyboard keyboard) {
        System.out.println("Keyboard Details: " + keyboard);
    }

    public void displayKeyboardList(List<Keyboard> keyboards) {
        System.out.println("Keyboard List:");
        for (Keyboard keyboard : keyboards) {
            System.out.println(keyboard);
        }
    }

}
