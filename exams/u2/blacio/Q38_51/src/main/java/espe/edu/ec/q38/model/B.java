package espe.edu.ec.q38.model;
import java.util.ArrayList;

/**
 *
 * @Julio Blacio, Overnigth Developer Squad, DCCO - ESPE
 */
public class B extends A{//0.5
    
    private ArrayList<H> h = new ArrayList<>(1);//0.5

    public B(ArrayList<A> as) {
        super(as);
    }

    @Override
    public String toString() {
        return "B{" + "h=" + h + '}';
    }
    
    /**
     * @return the h
     */
    public ArrayList<H> getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(ArrayList<H> h) {
        this.h = h;
    }
    
    
}
