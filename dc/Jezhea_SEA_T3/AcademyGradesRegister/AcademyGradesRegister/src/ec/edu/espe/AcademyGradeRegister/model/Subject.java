/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AcademyGradeRegister.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo Lainez JEZHE assosiation software engineers - DCCO ESPE
 */
public class Subject {
    private String subjectID;
    private String subjectName;
    private Professor professor;
    private List<Student> students;
    private List<Grade> grades;

    public Subject(String subjectID, String subjectName, Professor professor) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.professor = professor;
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        double total = 0;
        for (Grade grade : grades) {
            total += grade.getScore();
        }
        return grades.size() > 0 ? total / grades.size() : 0;
    }

    public Student findStudentByID(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }
}