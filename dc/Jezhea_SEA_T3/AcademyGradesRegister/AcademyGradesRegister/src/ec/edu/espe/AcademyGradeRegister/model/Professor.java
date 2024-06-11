/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AcademyGradeRegister.model;

/**
 *
 * @author Ricardo Lainez JEZHE assosiation software engineers - DCCO ESPE
 */

public class Professor {
    private String professorID;
    private String professorUser;
    private String email;
    private String department;

/*
    public Professor(String professorID, String professorUser, String email, String department) {
        this.professorID = professorID;
        this.professorUser = professorUser;
        this.email = email;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Professor{" + "professorID=" + professorID + ", professorUser=" + professorUser + ", email=" + email + ", department=" + department + '}';
    }
*/
    public String getProfessorID() {
        return professorID;
    }

    public void setProfessorID(String professorID) {
        this.professorID = professorID;
    }

    public String getProfessorUser() {
        return professorUser;
    }

    public void setProfessorUser(String professorUser) {
        this.professorUser = professorUser;
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
    
    
    
}