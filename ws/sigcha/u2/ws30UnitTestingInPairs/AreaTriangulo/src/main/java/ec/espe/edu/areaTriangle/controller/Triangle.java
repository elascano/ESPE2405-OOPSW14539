package ec.espe.edu.areaTriangle.controller;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        if (base <= 0) {
            throw new IllegalArgumentException("Base no puede ser cero o negativa");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Altura no puede ser cero o negativa");
        }
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public static boolean verificarSumaAngulos(double angulo1, double angulo2, double angulo3) {
        return Math.abs((angulo1 + angulo2 + angulo3) - 180) < 0.001;
    }

    public static void verificarVertices(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (x1 == x2 && y1 == y2 && x2 == x3 && y2 == y3) {
            throw new IllegalArgumentException("Vértices deben ser diferentes");
        }
    }

    public static void verificarLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Longitud de los lados debe ser positiva");
        }
    }

    public static boolean verificarDesigualdadTriangular(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    public static boolean verificarPlano(double x1, double y1, double x2, double y2, double x3, double y3) {
        return (y3 - y1) * (x2 - x1) == (y2 - y1) * (x3 - x1);
    }
}