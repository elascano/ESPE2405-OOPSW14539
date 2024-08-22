package ec.espe.edu.hwabstractfactory.view;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class MobileFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MobileButton();
    }

    @Override
    public TextField createTextField() {
        return new MobileTextField();
    }
}