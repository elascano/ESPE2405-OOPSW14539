
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Zaith Manangón
 */
public class WinButton extends Button{

    public WinButton() {
        super("Windows button");
    }
    
    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
    
}
