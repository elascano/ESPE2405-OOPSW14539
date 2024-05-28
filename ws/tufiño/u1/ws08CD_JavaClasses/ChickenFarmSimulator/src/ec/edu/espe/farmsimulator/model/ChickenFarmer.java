package ec.edu.espe.farmsimulator.model;

import java.util.List;

/**
 *
 * @author Erick
 */
public class ChickenFarmer {
    private int id;
    private String name;
    private List<ChickenCoop> coops;
    
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChickenFarmer{id=").append(id).append(", name=").append(name).append(", coops=[");
        for (ChickenCoop coop : coops) {
            sb.append(coop.toString(1)).append(";");
        }
        sb.append("]}");
        return sb.toString();
    }

    public String toString(int type) {
        if (type == 1) { // CSV
            StringBuilder sb = new StringBuilder();
            sb.append(id).append(",").append(name).append(",");
            for (ChickenCoop coop : coops) {
                sb.append(coop.toString(1)).append(";");
            }
            return sb.toString();
        }
        return toString();
    }

    public ChickenFarmer(int id, String name, List<ChickenCoop> coops) {
        this.id = id;
        this.name = name;
        this.coops = coops;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the coops
     */
    public List<ChickenCoop> getCoops() {
        return coops;
    }

    /**
     * @param coops the coops to set
     */
    public void setCoops(List<ChickenCoop> coops) {
        this.coops = coops;
    }
    
    
}
