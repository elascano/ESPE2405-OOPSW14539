package ec.edu.espe.hw29_observer.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
abstract class Stock {

    protected String symbol;
    protected double price;
    private ArrayList investors = new ArrayList();

    public Stock() {
    }

    public void addObserver(IInvestor iinvestor) {
        investors.add(iinvestor);
    }

    public String getSymbol() {
        return symbol;
    }

    public void deleteObserver(IInvestor iinvestor) {
        investors.remove(iinvestor);
    }

    public void notifyObservers(Object args) {
        Iterator i = investors.iterator();
        while (i.hasNext()) {
            IInvestor investor = (IInvestor) i.next();
            investor.update(this, args);
        }
    }

}
