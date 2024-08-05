/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.managementuniversity.model;

/**
 *
 * @author Ricardo lainez
 */
public class University {
    private String id;
    private String name;
    private int establishedYear;
    private int studentCount;

    public University(String id, String name, int establishedYear, int studentCount) {
        this.id = id;
        this.name = name;
        this.establishedYear = establishedYear;
        this.studentCount = studentCount;
    }

    public double computeStudentToYearRatio() {
        return (double) studentCount / (2024 - establishedYear);
    }

    @Override
    public String toString() {
        return "University{" + "id=" + id + ", name=" + name + ", establishedYear=" + establishedYear + ", studentCount=" + studentCount + '}';
    }
    
    

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
}
