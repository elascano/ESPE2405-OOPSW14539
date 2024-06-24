/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.booksaraguro.controller;

import ec.edu.espe.booksaraguro.model.Book;
import java.util.ArrayList;
import java.util.Scanner;
import utils.BookFileManager;

/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class LibraryManager {
    private ArrayList<Book> books;
    private final BookFileManager fileManager;
    private String filename;

    public LibraryManager() {
        fileManager = new BookFileManager();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filename for books data (e.g., books.dat): ");
        filename = scanner.nextLine();
        books = fileManager.loadBooksFromFile(filename);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Welcome to the Library System");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Delete Book");
            System.out.println("4. Save and Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    displayAllBooks();
                    break;
                case 3:
                    deleteBook(scanner);
                    break;
                case 4:
                    fileManager.saveBooksToFile(filename, books);
                    System.out.println("Books saved. Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);

        scanner.close();
    }

    private void addBook(Scanner scanner) {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();

        Book book = new Book(title, author, year, publisher, genre);
        books.add(book);
    }

    private void displayAllBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    private void deleteBook(Scanner scanner) {
        displayAllBooks();
        if (books.isEmpty()) {
            System.out.println("No books to delete.");
            return;
        }

        System.out.print("Enter the number of the book to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (index < 1 || index > books.size()) {
            System.out.println("Invalid book number.");
            return;
        }

        Book removedBook = books.remove(index - 1);
        System.out.println("Book removed: " + removedBook.getTitle());
    }
}
