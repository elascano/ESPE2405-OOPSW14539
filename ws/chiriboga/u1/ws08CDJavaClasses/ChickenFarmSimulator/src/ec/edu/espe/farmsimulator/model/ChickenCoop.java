package ec.edu.espe.farmsimulator.model;

import java.util.List;

/**
 *
 * @autor Kerlly Chiriboga, ODS
 */
public class ChickenCoop {
    private int id;
    private List<Chicken> chickens;

    public ChickenCoop(int id, List<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        StringBuilder chickensInfo = new StringBuilder();
        for (Chicken chicken : chickens) {
            chickensInfo.append(chicken.toString()).append("\n");
        }
        return "ChickenCoop {" + id + "} \n" + chickensInfo.toString();
    }
    
    public String toCSV() {
        StringBuilder csvData = new StringBuilder();
        csvData.append("Coop ID: ").append(id).append("\n");
        for (Chicken chicken : chickens) {
            csvData.append(chicken.toCSV()).append("\n");
        }
        return csvData.toString();
    }

    public void addChicken(Chicken chicken) {
        chickens.add(chicken);
    }

    public void removeChicken(Chicken chicken) {
        chickens.remove(chicken);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(List<Chicken> chickens) {
        this.chickens = chickens;
    }
}

