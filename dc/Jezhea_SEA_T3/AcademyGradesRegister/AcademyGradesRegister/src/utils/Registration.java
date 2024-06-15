/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author WINDOWS
 */
import java.util.ArrayList;

public class Registration {
    private String professorID;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String phoneNumber;
    private ArrayList<String> coursesTaught;

    public Registration(String professorID, String firstName, String lastName, String email, String department, String phoneNumber, ArrayList<String> coursesTaught) {
        this.professorID = professorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.coursesTaught = coursesTaught;
    }

    @Override
    public String toString() {
        return "ProfessorRegistration{" + "professorID=" + professorID + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", department=" + department + ", phoneNumber=" + phoneNumber + ", coursesTaught=" + coursesTaught + '}';
    }

    public String getProfessorID() {
        return professorID;
    }

    public void setProfessorID(String professorID) {
        this.professorID = professorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<String> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(ArrayList<String> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}
