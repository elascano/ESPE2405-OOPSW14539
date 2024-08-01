/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam2theory.model;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class A {
    private B b;
    private C c;
    private D d;

    public A(B b, C c, D d) {
        this.b = b;
        this.c = c;
        this.d = d;
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

    /**
     * @return the c
     */
    public C getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(C c) {
        this.c = c;
    }

    /**
     * @return the d
     */
    public D getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(D d) {
        this.d = d;
    }
}