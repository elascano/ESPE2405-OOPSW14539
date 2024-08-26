package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Zaith Manangón
 */
abstract class Menu {
    public String caption;

    public Menu(String caption) {
        this.caption = caption;
    }
    
    public abstract void paint();
}
