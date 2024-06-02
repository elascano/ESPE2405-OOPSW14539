package ec.edu.espe.farmsimulator.model;

/**
 *
 * @autor Kerlly Chiriboga, ODS
 */
public class ChickenFarmer {
    private int id;
    private String name;
    private ChickenCoop[] coops;

    public ChickenFarmer(int id, String name, ChickenCoop[] coops) {
        this.id = id;
        this.name = name;
        this.coops = coops;
    }

    @Override
    public String toString() {
        StringBuilder coopsInfo = new StringBuilder();
        for (ChickenCoop coop : getCoops()) {
            coopsInfo.append(coop.toString()).append("\n");
        }
        return "ChickenFarmer {" + id + "," + name + "} \n" + coopsInfo.toString();
    }
    
        public String toCSV() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(",").append(name).append("\n");
        for (ChickenCoop coop : coops) {
            sb.append(coop.toCSV()).append("\n");
        }
        return sb.toString();
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id 
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
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the coops
     */
    public ChickenCoop[] getCoops() {
        return coops;
    }

    /**
     * @param coops 
     */
    public void setCoops(ChickenCoop[] coops) {
        this.coops = coops;
    }

}