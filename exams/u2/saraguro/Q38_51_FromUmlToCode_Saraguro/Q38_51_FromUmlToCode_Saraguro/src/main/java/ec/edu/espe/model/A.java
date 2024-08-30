
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Leidy Saraguro, Paradigm Pioneers Squad, DCCO-ESPE
 */
public class A {        
    private ArrayList<A> as;    

    //0.2
    
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

    public A(ArrayList<A> as) {
        this.as = as;
    }

    @Override
    public String toString() {
        return "A{" + "as=" + as + '}';
    }
    
    
}