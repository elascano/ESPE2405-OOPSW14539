package ec.edu.espe.farmsimulator.model;


import java.util.List;

/**
 *
 * @autor Kerlly Chiriboga, ODS
 */
public class ChickenFarmer {
    private int id;
    private String name;
    private List<ChickenCoop> coops;

    public ChickenFarmer(int id, String name, List<ChickenCoop> coops) {
        this.id = id;
        this.name = name;
        this.coops = coops;
    }

    @Override
    public String toString() {
        StringBuilder coopsInfo = new StringBuilder();
        for (ChickenCoop coop : coops) {
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

    public void addCoop(ChickenCoop coop) {
        coops.add(coop);
    }

    public void removeCoop(ChickenCoop coop) {
        coops.remove(coop);
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

    public List<ChickenCoop> getCoops() {
        return coops;
    }

    public void setCoops(List<ChickenCoop> coops) {
        this.coops = coops;
    }
}
