
package ec.edu.espe.q3851.model;

import java.util.ArrayList;

/**
 *
 * @author Adrian Padilla
 */
public class A {
    ArrayList<A> as;

    @Override
    public String toString() {
        return "A" + "composed by" + as + '}';
    }

    
    
    public A(ArrayList<A> as) {
        this.as = as;
    }
    
    
}
