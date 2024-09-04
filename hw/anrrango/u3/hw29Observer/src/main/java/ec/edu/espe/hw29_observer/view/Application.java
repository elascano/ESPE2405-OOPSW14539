package ec.edu.espe.hw29_observer.view;

import ec.edu.espe.hw29_observer.model.IBM;
import ec.edu.espe.hw29_observer.model.Investor;

/**
 *
 * @author Damian Toscano
 */
public class Application {

    public static void main(String[] args) {
        Investor s = new Investor("Sorros");
        Investor b = new Investor("Berkshire");

        IBM ibm = new IBM("IBM", 120.00);
        ibm.addObserver(s);
        ibm.addObserver(b);

        ibm.setPrice(120.10);
        ibm.setPrice(121.00);
        ibm.setPrice(120.50);
        ibm.setPrice(120.75);
        ibm.setSymbol("IBMTEST");
    }
}
