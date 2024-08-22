package ec.edu.espe.guifactory.model;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class WinButton extends Button{

    @Override
    public void paint() {
        System.out.println("Creating a Windows-style button with caption: " + caption);
        System.out.println("Adding borders and shadows...");
        System.out.println("Finalizing button creation.");
    }
    
}
