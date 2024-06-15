/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.objectexample.model;
/**
 * Autor: Joffre
 * Fecha: 2024-06-11
 * Descripción:
 */
public class Ball {
private int id;
private String type;
private String color;
private String size;
private String tradeMark;

    public Ball(int id, String type, String color, String size, String tradeMark) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.size = size;
        this.tradeMark = tradeMark;
    }

    @Override
    public String toString() {
        return "Ball{" + "id=" + id + ", type=" + type + ", color=" + color + ", size=" + size + ", tradeMark=" + tradeMark + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

}
