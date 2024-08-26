/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.pitagoras.model;

/**
 *
 * @author heiso
 */
public class Triangulo {
    private double CatetoA;
    private double CatetoB;
    private double calcularHipotenusa;

    public double getCatetoA() {
        return CatetoA;
    }

    public void setCatetoA(double CatetoA) {
        this.CatetoA = CatetoA;
    }

    public double getCatetoB() {
        return CatetoB;
    }

    public void setCatetoB(double CatetoB) {
        this.CatetoB = CatetoB;
    }

    public double getcalcularHipotenusa() {
        return calcularHipotenusa;
    }

    public void setcalcularHipotenusa(double Hipotenusa) {
        this.calcularHipotenusa = Hipotenusa;
    }

    public void calcularHipotenusa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}