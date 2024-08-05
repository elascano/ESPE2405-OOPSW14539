
package ec.edu.espe.theoryexamexcercise.model;

/**
 *
 * @author David Pilaguano, Lenovo , DCCO-ESPE
 */


import java.util.ArrayList;

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
