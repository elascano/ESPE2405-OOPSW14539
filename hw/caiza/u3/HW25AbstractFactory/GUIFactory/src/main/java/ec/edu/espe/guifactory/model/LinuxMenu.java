package ec.edu.espe.guifactory.model;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class LinuxMenu extends Menu{

    public LinuxMenu() {
    }
     @Override
    public void paint() {
        System.out.println("Creating a Linux-style menu with caption: " + caption);
        System.out.println("Setting up list-style layout...");
        System.out.println("Adding menu items...");
        System.out.println("Finalizing menu creation.");
    }   
}
