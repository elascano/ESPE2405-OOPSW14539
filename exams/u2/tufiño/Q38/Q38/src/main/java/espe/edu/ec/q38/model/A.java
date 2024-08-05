
package espe.edu.ec.q38.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G400
 */

public class A {
    private A partOfA;
    private List<B> bList;
    private List<C> cList;
    private List<D> dList;

    public A() {
        bList = new ArrayList<>();
        cList = new ArrayList<>();
        dList = new ArrayList<>();
    }

    public void addB(B b) {
        bList.add(b);
    }

    public void addC(C c) {
        if (cList.size() < 3) {
            cList.add(c);
        }
    }

    public void addD(D d) {
        if (dList.size() < 4) {
            dList.add(d);
        }
    }
}

