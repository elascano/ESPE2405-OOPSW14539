package ec.edu.espe.farmsimulator.model;

import java.util.List;

/**
 *
 * @author Erick
 */
public class ChickenCoop {
    private int id;
    private List<Chicken> chickens;

    @Override
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChickenCoop{id=").append(getId()).append(", chickens=[");
        for (Chicken chicken : getChickens()) {
            sb.append(chicken.toString(1)).append(";");
        }
        sb.append("]}");
        return sb.toString();
    }

    public String toString(int type) {
        if (type == 1) { // CSV
            StringBuilder sb = new StringBuilder();
            sb.append(getId()).append(",");
            for (Chicken chicken : getChickens()) {
                sb.append(chicken.toString(1)).append(";");
            }
            return sb.toString();
        }
        return toString();
    }

    public ChickenCoop(int id, List<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
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
     * @return the chickens
     */
    public List<Chicken> getChickens() {
        return chickens;
    }

    /**
     * @param chickens the chickens to set
     */
    public void setChickens(List<Chicken> chickens) {
        this.chickens = chickens;
    }
    
    
}
