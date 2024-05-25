/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Leydi Oña, Lenovo, DCCO-ESPE>
 */
public class Colony {
    Nest nest;
    Ant ants[];
    
    public  void  rum(){
        System.out.println("The colony s running");
    }

    public Colony(Nest nest, int size) {
        this.ants= new Ant[size];
        this.nest = nest;
        this.ants = ants;
    } 
    
    public Colony(Nest nest, Ant[] ants) {
        this.ants= new Ant[ants.length];
        this.nest = nest;
        this.ants = ants;
    }

    
    public Nest getNest() {
        return nest;
    }

    public void setNest(Nest nest) {
        this.nest = nest;
    }

    public Ant[] getAnts() {
        return ants;
    }

    public void setAnts(Ant[] ants) {
        this.ants = ants;
    }

    @Override
    public String toString() {
        String localAnts = "";
        for (int  i=0; i< ants.length; i++){
            localAnts = localAnts + ants[i];
        }
        return "Colony{" + "nest=" + nest + ", ants=" + localAnts+ '}';
    }
    
}
