/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SchoolGUI.model;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class School {
    private int id;
    private String adress;
    private String city;
    private String phone;

    public School(int id, String adress, String city, String phone) {
        this.id = id;
        this.adress = adress;
        this.city = city;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getAdress() {
        return adress;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }
}
