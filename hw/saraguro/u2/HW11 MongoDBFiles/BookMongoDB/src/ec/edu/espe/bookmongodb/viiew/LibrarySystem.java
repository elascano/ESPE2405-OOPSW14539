/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.bookmongodb.viiew;

import ec.edu.espe.bookmongodb.controller.LibraryManager;
import ec.edu.espe.bookmongodb.model.Book;
import java.util.Scanner;

/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class LibrarySystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();

        
        System.out.println("Connecting to MongoDB Atlas cluster...");
       
        System.out.println("\nEnter book details:");
        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Genre: ");
        String genre = scanner.nextLine();


        Book book = new Book(title, author, year, genre);

      
        manager.saveBook(book);

        System.out.println("\nBook saved successfully to MongoDB.");
    }
}