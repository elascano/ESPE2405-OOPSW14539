/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.objectexample.view;

import ec.edu.espe.objectexample.model.Book;
import static ec.edu.espe.objectexample.utils.SaveManager.saveToJsonFile;
import java.util.Scanner;

/**
 *
 * @author Erick Tufiño
 */
public class BookSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos para crear un objeto Ball
        System.out.println("Ingrese el ID :");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Ingrese el titulo:");
        String title = scanner.nextLine();

        System.out.println("Ingrese el autor:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese la categoría:");
        String category = scanner.nextLine();

        System.out.println("Ingrese el idioma:");
        String language = scanner.nextLine();

         Book book = new Book(id, title, autor, category, language);

       
        saveBookToJsonFile(book);

        System.out.println("Objeto guardado en el archivo correctamente.");
    }

    private static void saveBookToJsonFile(Book book) {
       
        String fileName = "book.json";
        saveToJsonFile(book, fileName);
    }
}

        
    
    
