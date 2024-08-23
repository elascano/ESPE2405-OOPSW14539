package ec.edu.espe.observer.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Leidy Saraguro
 */
public abstract class Stock {
    protected String symbol;
    protected double price;
    private ArrayList<IInvestor> investors = new ArrayList<>();

    public Stock() {}

    public void addObserver(IInvestor iinvestor) {
        investors.add(iinvestor);
    }

    public void deleteObserver(IInvestor iinvestor) {
        investors.remove(iinvestor);
    }

    public void notifyObservers(Object args) {
        Iterator<IInvestor> i = investors.iterator();
        while (i.hasNext()) {
            IInvestor investor = i.next();
            investor.update(this, args);
        }
    }

    // Métodos abstractos para ser implementados por las subclases
    public abstract String getSymbol();
    public abstract void setSymbol(String symbol);
    public abstract double getPrice();
    public abstract void setPrice(double price);
}

