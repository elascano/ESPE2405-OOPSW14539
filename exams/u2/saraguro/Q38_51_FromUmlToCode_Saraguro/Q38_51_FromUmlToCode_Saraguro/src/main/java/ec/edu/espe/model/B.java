
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Leidy Saraguro, Paradigm Pioneers Squad, DCCO-ESPE
 */
public class B extends A {     
    
    private ArrayList<H> hs;          
    
    public B(ArrayList<A> as) {
        super(as);
        this.hs = hs;
    }

    @Override
    public String toString() {
        return "B{" + "hs=" + getHs() + '}';
    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {
        this.hs = hs;
    }
     
}
