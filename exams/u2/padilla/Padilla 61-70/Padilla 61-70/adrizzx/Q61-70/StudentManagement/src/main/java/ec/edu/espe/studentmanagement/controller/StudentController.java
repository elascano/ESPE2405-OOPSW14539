
package ec.edu.espe.studentmanagement.controller;

/**
 *
 * @author Adrian Padilla
 */
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.studentmanagement.model.Student;
import ec.edu.espe.studentmanagement.view.StudentView;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Student> students;
    private StudentView view;
    private MongoDatabase database;

    public StudentController(StudentView view, MongoDatabase database) {
        this.students = new ArrayList<>();
        this.view = view;
        this.database = database;
    }

    public void createStudent(String name, int age, int grade) {
        String id = String.valueOf(students.size() + 1); // Generación simple de ID
        Student student = new Student(id, name, age, grade);
        students.add(student);

        // Guardar en MongoDB
        MongoCollection<Document> collection = database.getCollection("students");
        Document doc = new Document("id", id)
                .append("name", name)
                .append("age", age)
                .append("grade", grade);
        collection.insertOne(doc);
    }

    public List<Student> getAllStudents() {
        // Recuperar de MongoDB
        MongoCollection<Document> collection = database.getCollection("students");
        List<Student> students = new ArrayList<>();

        for (Document doc : collection.find()) {
            Student student = new Student(
                    doc.getString("id"),
                    doc.getString("name"),
                    doc.getInteger("age"),
                    doc.getInteger("grade")
            );
            students.add(student);
        }
        return students;
    }

    public Student getStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public StudentView getView() {
        return view;
    }
}