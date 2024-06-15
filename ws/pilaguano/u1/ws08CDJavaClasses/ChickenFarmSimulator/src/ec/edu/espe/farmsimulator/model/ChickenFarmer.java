package ec.edu.espe.farmsimulator.model;

/**
 *
 * @author David Pilaguano, Lenovo , DCCO-ESPE
 */
public class ChickenFarmer {
    private int farmerId;
    private String farmerName;
    private ChickenCoop[] coops;

    @Override
    public String toString() {
        return "ChickenFarmer{" + "id=" + farmerId + ", name=" + farmerName + ", coops=" + coops + '}';
    }

    public String toString(int type) {
        StringBuilder farmerData = new StringBuilder();
        if (type == 1) { // csv
            farmerData.append(farmerId).append(",").append(farmerName).append(",");
            for (ChickenCoop coop : coops) {
                farmerData.append(coop.toString(1)).append(";");
            }
        } else if (type == 2) { // txt
            farmerData.append("Farmer ID: ").append(farmerId).append("\n")
                      .append("Name: ").append(farmerName).append("\n");
            for (ChickenCoop coop : coops) {
                farmerData.append(coop.toString(2)).append("\n");
            }
        } else if (type == 3) { // json
            farmerData.append("{\n  \"id\": ").append(farmerId).append(",\n  \"name\": \"").append(farmerName).append("\",\n  \"coops\": [\n");
            for (int i = 0; i < coops.length; i++) {
                farmerData.append(coops[i].toString(3));
                if (i < coops.length - 1) {
                    farmerData.append(",\n");
                }
            }
            farmerData.append("\n  ]\n}");
        }
        return farmerData.toString();
    }

    public ChickenFarmer(int id, String name, ChickenCoop[] coops) {
        this.farmerId = id;
        this.farmerName = name;
        this.coops = coops;
    }
        
    public int getId() {
        return farmerId;
    }

    public void setId(int id) {
        this.farmerId = id;
    }

    public String getName() {
        return farmerName;
    }

    public void setName(String name) {
        this.farmerName = name;
    }

    public ChickenCoop[] getCoops() {
        return coops;
    }

    public void setCoops(ChickenCoop[] coops) {
        this.coops = coops;
    }
}
