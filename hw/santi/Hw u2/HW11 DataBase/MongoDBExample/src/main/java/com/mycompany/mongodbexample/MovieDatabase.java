
package com.mycompany.mongodbexample;

/**
 *
 * @author Sjean
 */

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.client.model.Filters;

public class MovieDatabase {
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public MovieDatabase(String uri, String dbName, String collectionName) {
        mongoClient = MongoClients.create(uri);
        database = mongoClient.getDatabase(dbName);
        collection = database.getCollection(collectionName);
    }

    public void addMovie(Movie movie) {
        Document doc = new Document("title", movie.getTitle())
                .append("director", movie.getDirector())
                .append("year", movie.getYear())
                .append("genre", movie.getGenre());
        collection.insertOne(doc);
    }

    public Movie getMovie(String title) {
        Document doc = collection.find(Filters.eq("title", title)).first();
        if (doc != null) {
            return new Movie(
                    doc.getString("title"),
                    doc.getString("director"),
                    doc.getInteger("year"),
                    doc.getString("genre")
            );
        }
        return null;
    }

    public void updateMovie(String title, Movie updatedMovie) {
        Document update = new Document("title", updatedMovie.getTitle())
                .append("director", updatedMovie.getDirector())
                .append("year", updatedMovie.getYear())
                .append("genre", updatedMovie.getGenre());
        collection.updateOne(Filters.eq("title", title), new Document("$set", update));
    }

    public void deleteMovie(String title) {
        collection.deleteOne(Filters.eq("title", title));
    }

    public void close() {
        mongoClient.close();
    }
}
