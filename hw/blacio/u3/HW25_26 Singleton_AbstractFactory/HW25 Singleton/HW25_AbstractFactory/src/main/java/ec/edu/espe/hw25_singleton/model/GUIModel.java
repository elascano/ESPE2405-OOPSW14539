package ec.edu.espe.hw25_singleton.model;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class GUIModel {

    private Button button;
    private Menu menu;

    public void setButton(Button button) {
        this.button = button;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Button getButton() {
        return button;
    }

    public Menu getMenu() {
        return menu;
    }
}
