/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.exam.model;

/**
 *
 * @author Joffre
 */
public class Exam {

    public static void main(String[] args) {
        // Instanciación de las clases
        A aInstance = new A();
        H hInstance = new H() {
            // Implementación vacía de los métodos de la interfaz H
        };
        B bInstance = new B(hInstance);
        C cInstance = new C();
        D dInstance = new D();
        E eInstance = new E();
        F fInstance = new F();
        G gInstance = new G();
        J jInstance = new J(gInstance);

 

        System.out.println("Instancias creadas e inicializadas correctamente.");
    }
}

