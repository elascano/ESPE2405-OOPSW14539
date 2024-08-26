
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Zaith Manangón
 */
public class MacButton extends Button{

    public MacButton() {
        super("MacOS button");
    }

    @Override
    public void paint() {
        System.out.println("I'm MacOSButton: " + caption);
    }
    
}
