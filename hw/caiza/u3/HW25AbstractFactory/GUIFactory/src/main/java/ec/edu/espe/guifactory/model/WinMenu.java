package ec.edu.espe.guifactory.model;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class WinMenu extends Menu{

    @Override
    public void paint() {
        System.out.println("Creating a Windows-style menu with caption: " + caption);
        System.out.println("Setting up dropdown layout...");
        System.out.println("Adding menu items...");
        System.out.println("Finalizing menu creation.");
    }
    
}
