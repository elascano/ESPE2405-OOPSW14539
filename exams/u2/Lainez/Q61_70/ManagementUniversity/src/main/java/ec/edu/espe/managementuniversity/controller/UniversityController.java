/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.managementuniversity.controller;

/**
 *
 * @author Ricardo lainez
 */
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.managementuniversity.model.University;
import ec.edu.espe.managementuniversity.view.UniversityView;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;


public class UniversityController {
    private List<University> universities;
    private UniversityView view;
    private MongoDatabase database;

    public UniversityController(UniversityView view, MongoDatabase database) {
        this.universities = new ArrayList<>();
        this.view = view;
        this.database = database;
    }

    public void createUniversity(String name, int establishedYear, int studentCount) {
        String id = String.valueOf(universities.size() + 1); // Simple ID generation
        University university = new University(id, name, establishedYear, studentCount);
        universities.add(university);

        // Save to MongoDB
        MongoCollection<Document> collection = database.getCollection("universities");
        Document doc = new Document("id", id)
                .append("name", name)
                .append("establishedYear", establishedYear)
                .append("studentCount", studentCount);
        collection.insertOne(doc);
    }

    public List<University> getAllUniversities() {
        // Retrieve from MongoDB
        MongoCollection<Document> collection = database.getCollection("universities");
        List<University> universities = new ArrayList<>();

        for (Document doc : collection.find()) {
            University university = new University(
                    doc.getString("id"),
                    doc.getString("name"),
                    doc.getInteger("establishedYear"),
                    doc.getInteger("studentCount")
            );
            universities.add(university);
        }
        return universities;
    }

    public University getUniversityById(String id) {
        for (University university : universities) {
            if (university.getId().equals(id)) {
                return university;
            }
        }
        return null;
    }
    
    public void updateUniversity(String id, String name, int establishedYear, int studentCount) {
        MongoCollection<Document> collection = database.getCollection("universities");
        Document doc = new Document("id", id)
                .append("name", name)
                .append("establishedYear", establishedYear)
                .append("studentCount", studentCount);
        collection.updateOne(new Document("id", id), new Document("$set", doc));
    }

    public void deleteUniversity(String id) {
        MongoCollection<Document> collection = database.getCollection("universities");
        collection.deleteOne(new Document("id", id));
    }

    public UniversityView getView() {
        return view;
    }
}
