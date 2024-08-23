package ec.espe.edu.hwabstractfactory.view;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class DesktopFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new DesktopButton();
    }

    @Override
    public TextField createTextField() {
        return new DesktopTextField();
    }
}