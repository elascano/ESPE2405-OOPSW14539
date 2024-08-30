
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Zaith Manangón
 */
abstract class Button {
    public String caption;

    public Button(String caption) {
        this.caption = caption;
    }
    
    public abstract void paint();
}
