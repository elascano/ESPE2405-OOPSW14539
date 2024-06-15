/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.objectexample.model;
/**
 * Erick Tufiño
 */
public class Book {
private int id;
private String title;
private String autor;
private String category;
private String language;

    public Book(int id, String title, String autor, String category, String language) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.category = category;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Ball{" + "id=" + id + ", title=" + title + ", autor=" + autor + ", category=" + category + ", language=" + language + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return title;
    }

    public void setType(String type) {
        this.title = type;
    }

    public String getColor() {
        return autor;
    }

    public void setColor(String color) {
        this.autor = color;
    }

    public String getSize() {
        return category;
    }

    public void setSize(String size) {
        this.category = size;
    }

    public String getTradeMark() {
        return language;
    }

    public void setTradeMark(String tradeMark) {
        this.language = tradeMark;
    }

}
