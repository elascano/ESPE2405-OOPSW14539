
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Zaith Manangón
 */
public class MacMenu extends Menu {

    public MacMenu() {
        super("MacOS menu");
    }

    @Override
    public void paint() {
        System.out.println("I'm MacOSMenu: " + caption);
    }

}
