package ec.edu.espe.farmsimulator.model;

/**
 *
 * @autor Kerlly Chiriboga, ODS
 */
public class ChickenCoop {
    private int id;
    private Chicken[] chickens;

    public ChickenCoop(int id, Chicken[] chickens) {
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
     * @return the chickens
     */
    public Chicken[] getChickens() {
        return chickens;
    }

    /**
     * @param chickens 
     */
    public void setChickens(Chicken[] chickens) {
        this.chickens = chickens;
    }
    
}

