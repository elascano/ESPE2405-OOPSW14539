
package ec.espe.edu.areaTriangle.model;

/**
 *
 * @author KENNED
 */

public class Triangulo {
    private double base;
    private double height;
    private double area;

    public Triangulo(double base, double height) {
        this.base = base;
        this.height = height;
        this.area = calculateArea();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    private double calculateArea() {
        return (base * height) / 2;
    }
}


