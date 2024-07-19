/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.bookmongodb.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.bookmongodb.model.Book;
import ec.edu.espe.bookmongodb.model.DatabaseConnection;
import org.bson.Document;

/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */


public class LibraryManager {

    private MongoDatabase database;

    public LibraryManager() {
        this.database = DatabaseConnection.getConnection();
    }

    public void saveBook(Book book) {
        MongoCollection<Document> collection = database.getCollection("book"); // Usar la colección "book"
        Document document = new Document("title", book.getTitle())
                                .append("author", book.getAuthor())
                                .append("year", book.getYear())
                                .append("genre", book.getGenre());
        collection.insertOne(document);
    }
}
