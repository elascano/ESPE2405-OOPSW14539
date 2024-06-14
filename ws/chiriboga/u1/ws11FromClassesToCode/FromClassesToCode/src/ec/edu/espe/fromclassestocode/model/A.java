
package ec.edu.espe.fromclassestocode.model;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class A {
    private B b;
    private int c;
    
    public C m(D d){
        C c;
        c = new C();
        return c;
    }

    @Override
    public String toString() {
        return "A{" + "b=" + b + ", c=" + c + '}';
    }

    
    public A(B b, int c) {
        this.b = b;
        this.c = c;
    }

    
    /**
     * @return the b
     */
    public B getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(B b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    
}
