

package ec.edu.ec.espe.fromclassestocode.model;

import java.util.ArrayList;

/**
 *
 * @author Erick Tufiño
 */
public class B {
    private int i;
    private ArrayList<C> cs;

    @Override
    public String toString() {
        return "B{" + "i=" + i + ", cs=" + cs + '}';
    }
    
    public B(int i, ArrayList<C> cs) {
        this.i = i;
        this.cs = cs;
    }
    
    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * @return the cs
     */
    public ArrayList<C> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }
    
}
