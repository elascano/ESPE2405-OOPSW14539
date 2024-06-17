package ec.edu.espe.farmsimulator.model;

/**
 *
 * @author David Pilaguano, Lenovo , DCCO-ESPE
 */
public class ChickenCoop {
    private int coopId;
    private Chicken[] chickens;

    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + coopId + ", chickens=" + chickens + '}';
    }

    public String toString(int type) {
        StringBuilder coopData = new StringBuilder();
        if (type == 1) { // csv
            coopData.append(coopId).append(",");
            for (Chicken chicken : chickens) {
                coopData.append(chicken.toString(1)).append(";");
            }
        } else if (type == 2) { // txt
            coopData.append("ChickenCoop ID: ").append(coopId).append("\n");
            for (Chicken chicken : chickens) {
                coopData.append(chicken.toString(2)).append("\n");
            }
        } else if (type == 3) { // json
            coopData.append("{\n  \"id\": ").append(coopId).append(",\n  \"chickens\": [\n");
            for (int i = 0; i < chickens.length; i++) {
                coopData.append(chickens[i].toString(3));
                if (i < chickens.length - 1) {
                    coopData.append(",\n");
                }
            }
            coopData.append("\n  ]\n}");
        }
        return coopData.toString();
    }

    public ChickenCoop(int id, Chicken[] chickens) {
        this.coopId = id;
        this.chickens = chickens;
    }
    
    public int getId() {
        return coopId;
    }

    public void setId(int id) {
        this.coopId = id;
    }

    public Chicken[] getChickens() {
        return chickens;
    }

    public void setChickens(Chicken[] chickens) {
        this.chickens = chickens;
    }
}
