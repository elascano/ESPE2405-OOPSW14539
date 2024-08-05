
package ec.edu.espe.q3851.model;

import java.util.ArrayList;

/**
 *
 * @author Adrian Padilla
 */
public class C extends A{
    ArrayList<E> es;

    public C(ArrayList<E> es, ArrayList<A> as) {
        super(as);
        this.es = es;
    }

    @Override
    public String toString() {
        return "C" + "is an aggregation of" + es + "extends ->" + super.toString();
    }

    
}
