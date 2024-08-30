package espe.edu.ec.q38.model;
import java.util.ArrayList;

/**
 *
 * @Julio Blacio, Overnigth Developer Squad, DCCO - ESPE
 */
public class C extends A{//0.5
    
    private ArrayList<E> e;//0.5
    
    public C(ArrayList<E> e, ArrayList<A> as) {//0.2
        super(as);
        this.e = e;
    }

    /**
     * @return the e
     */
    public ArrayList<E> getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(ArrayList<E> e) {
        this.e = e;
    }
    
}
