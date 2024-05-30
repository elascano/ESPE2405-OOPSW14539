/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.model;

/**
 *
 *@author Yostin Sisalema,Code masters, DCCO-ESPE
 */
public class ChickenFarmen {
    private int id;
    private String name;
    private ChickenCoop[] coops;

    public ChickenFarmen(int id, String name, ChickenCoop[] coops) {
        this.id = id;
        this.name = name;
        this.coops = coops;
    }
    
    public String toString(String type) {
    StringBuilder chickenFarmer = new StringBuilder();
    String chickenData = "";
    if (coops != null) {
        for (ChickenCoop coop : coops) {
            chickenFarmer.append(coop.toString(type)).append("\n");
        }
    }
    if (type.equals("csv")) { // csv
        chickenData = "ChickenFarmen, id=" + id + ", name=" + name + ", \n" 
                    + chickenFarmer.toString();
    } else if (type.equals("txt")) { // txt
        chickenData = "ChickenFarmen: id=" + id + ", name=" + name + ": \n" 
                    + chickenFarmer.toString() + "\n";
    } else if (type.equals("json")) { // json
        chickenData = "{\n"+ "  \"ChickenFarmen\": {\n"+ "    \"id\": \"" + id + "\",\n"+ "    \"name\": \"" + name + "\",\n"+ "    \"chickenFarmer\": [\n"+ chickenFarmer.toString() + "\n"+ "    ]\n"+ "  }\n"+ "}\n";
    }
        return chickenData;
    }
    
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ChickenCoop[] getCoops() {
        return coops;
    }

    public void setCoops(ChickenCoop[] coops) {
        this.coops = coops;
    }
}

