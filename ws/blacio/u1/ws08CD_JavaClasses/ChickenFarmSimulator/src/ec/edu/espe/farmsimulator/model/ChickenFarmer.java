package ec.edu.espe.farmsimulator.model;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class ChickenFarmer {
    private int id;
    private String name;
    private ChickenCoop[] coops;

    @Override
    public String toString() {
        return "ChickenFarmer{" + "id=" + id + ", name=" + name + ", coops=" + coops + '}';
    }

    public String toString(int type) {
        StringBuilder farmerData = new StringBuilder();
        if (type == 1) { // csv
            farmerData.append(id).append(",").append(name).append(",");
            for (ChickenCoop coop : coops) {
                farmerData.append(coop.toString(1)).append(";");
            }
        } else if (type == 2) { // txt
            farmerData.append("Farmer ID: ").append(id).append("\n")
                      .append("Name: ").append(name).append("\n");
            for (ChickenCoop coop : coops) {
                farmerData.append(coop.toString(2)).append("\n");
            }
        } else if (type == 3) { // json
            farmerData.append("{\n  \"id\": ").append(id).append(",\n  \"name\": \"").append(name).append("\",\n  \"coops\": [\n");
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
        this.id = id;
        this.name = name;
        this.coops = coops;
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

    public ChickenCoop[] getCoops() {
        return coops;
    }

    public void setCoops(ChickenCoop[] coops) {
        this.coops = coops;
    }
}
