package ec.edu.espe.guifactory.model;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public abstract class Button {
    
    public String caption;
    
    public Button(String caption) {
    this.caption = caption;
    }
    public abstract void paint(); // Action to "paint" the button.    
}
