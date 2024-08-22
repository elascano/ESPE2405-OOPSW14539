package ec.edu.espe.guifactory.model;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class LinuxButton extends Button{

    public LinuxButton(String caption) {
        super(caption);
    }

    @Override
    public void paint() {
        System.out.println("Creating a Linux-style button with caption: " + caption);
        System.out.println("Setting simple flat design...");
        System.out.println("Finalizing button creation.");
    }
    
}
