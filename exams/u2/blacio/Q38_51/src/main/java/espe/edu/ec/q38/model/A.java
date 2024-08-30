package espe.edu.ec.q38.model;
import java.util.ArrayList;

/**
 *
 * @Julio Blacio, Overnigth Developer Squad, DCCO - ESPE
 */

public class A {//0.5
    
    private ArrayList<A> as;//0.5

    @Override
    public String toString() {//0.2
        return "A{" + "as=" + as + '}';
    }

    public A(ArrayList<A> as) {
        this.as = as;
    }

    /**
     * @return the as
     */
    public ArrayList<A> getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(ArrayList<A> as) {
        this.as = as;
    }
    
}

