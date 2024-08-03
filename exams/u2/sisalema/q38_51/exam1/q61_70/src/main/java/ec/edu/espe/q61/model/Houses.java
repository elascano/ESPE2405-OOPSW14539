/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q61.model;

/**
 *
 * @author Yostin Sisalema, Code Master, DCCO-ESPE
 */
public class Houses {
    private int id;
    private String name;
    private String song;

    public Houses(int id, String name, String song) {
        this.id = id;
        this.name = name;
        this.song = song;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }


    
}
