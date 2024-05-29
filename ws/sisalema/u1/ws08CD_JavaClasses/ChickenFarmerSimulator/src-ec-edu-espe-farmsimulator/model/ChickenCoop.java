/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.model;

/**
 *
 * @author Yostin Sisalema,Code Masters, DCCO-ESPE
 */
public class ChickenCoop {
    private int id;
    private Chicken[] chickensCoop; 

    public ChickenCoop(int id, Chicken[] chickensCoop) {
        this.id = id;
        this.chickensCoop = chickensCoop;
    }

public String toString(String type) {
    StringBuilder chickensType = new StringBuilder();
    String chickenData = "";
    if (chickensCoop != null) {
        for (Chicken chicken : chickensCoop) {
            chickensType.append(chicken.toString(type)).append("\n");
        }
    }
    if (type.equals("csv")) { // csv
        chickenData = "ChickenCoop, id=" + id + ", chickensCoop=" + chickensType.toString();
    } else if (type.equals("txt")) { // txt
        chickenData = "ChickenCoop: id=" + id + ", chickensCoop=" + chickensType.toString()+"\n";
    } else if (type.equals("json")) { // json
        chickenData = "{\"ChickenCoop\": {\"id\": \"" + id + "\", \"chickensCoop\": \"" + chickensType.toString() + "\"}}"+"\n";
    }
    return chickenData;
}

        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Chicken[] getChickens() {
        return chickensCoop;
    }

    public void setChickens(Chicken[] chickens) {
        this.chickensCoop = chickens;
    }
}
