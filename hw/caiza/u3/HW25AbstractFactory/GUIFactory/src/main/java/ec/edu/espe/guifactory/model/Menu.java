package ec.edu.espe.guifactory.model;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public abstract class Menu {
    public String caption;
    
    public Menu(String caption) {
    this.caption = caption;
    }
    public abstract void paint(); //Action to "paint" the Menu
}
