/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromclassestocode.model;

/**
 *
 * @author Yostin Sisalema,Code Masters,DCCO-ESPE
 */
public class A {
    private B b;
    private int c;

    public C m(D d){
        C c;
        c= new C();
        return c;
    }

    public A(B b, int c){
        this.b= b;
        this.c= c;
    }

    public B getB() {
        return b;
    }

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
