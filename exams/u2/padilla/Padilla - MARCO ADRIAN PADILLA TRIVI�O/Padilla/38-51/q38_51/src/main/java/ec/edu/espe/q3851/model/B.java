
package ec.edu.espe.q3851.model;

import java.util.ArrayList;

/**
 *
 * @author Adrian Padilla
 */
public class B extends A{
    public void r(){
        
    }

    public B(ArrayList<A> as) {
        super(as);
    }
    
    @Override
    public String toString() {
        return "B" + "extends ->" + super.toString();
    }
    
    
}
