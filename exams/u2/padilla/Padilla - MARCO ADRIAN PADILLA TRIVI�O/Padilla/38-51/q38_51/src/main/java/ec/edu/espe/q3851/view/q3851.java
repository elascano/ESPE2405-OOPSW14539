

package ec.edu.espe.q3851.view;

import ec.edu.espe.q3851.model.G;
import ec.edu.espe.q3851.model.F;
import ec.edu.espe.q3851.model.D;
import ec.edu.espe.q3851.model.E;
import ec.edu.espe.q3851.model.J;
import ec.edu.espe.q3851.model.A;
import ec.edu.espe.q3851.model.C;
import ec.edu.espe.q3851.model.H;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Adrian Padilla
 */
public class q3851 {

    public static void main(String[] args) {
        ArrayList<A> as = new ArrayList<>();
        ArrayList<E> nonlimitedEs = new ArrayList<>();
        E[] es = new E[5];
        C[] cs = new C[3];
        D[] ds = new D[4];
        ArrayList<H> hs = new ArrayList<>();
        for(C c : cs){
            c = new C(nonlimitedEs, as);
        }
        
        A a = new  A(as);
        F f = new F();
        J j = new J();
        G g = new G(j);
        
        System.out.println(a);
        System.out.println(Arrays.toString(cs));
        System.out.println(Arrays.toString(ds));
        System.out.println(Arrays.toString(es));
        System.out.println(f);
        System.out.println(g);
        System.out.println(j);
    }
    
}
