package ec.edu.espe.observer.model;

/**
 *
 * @author Leidy Saraguro
 */
public class IBM extends Stock {
    public IBM(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public void setSymbol(String symbol) {
        this.symbol = symbol;
        notifyObservers(symbol);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
        notifyObservers(price);
    }
}
