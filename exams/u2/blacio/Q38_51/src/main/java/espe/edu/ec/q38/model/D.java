package espe.edu.ec.q38.model;
import java.util.ArrayList;

/**
 *
 * @Julio Blacio, Overnigth Developer Squad, DCCO - ESPE
 */
public class D extends A{//0.5

    private E[] e = new E[5];//0.25
    private ArrayList<F> f;//0.25

    public D(E[] e, ArrayList<F> f, ArrayList<A> as) {//0.2
        super(as);
        this.e = e;
        this.f = f;
    }
    /**
     * @return the e
     */
    public E[] getE() {//0.2
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(E[] e) {
        this.e = e;
    }

    /**
     * @return the f
     */
    public ArrayList<F> getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(ArrayList<F> f) {
        this.f = f;
    }
    
}
