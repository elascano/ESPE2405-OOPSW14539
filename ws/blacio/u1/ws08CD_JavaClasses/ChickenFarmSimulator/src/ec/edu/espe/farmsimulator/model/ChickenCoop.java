package ec.edu.espe.farmsimulator.model;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class ChickenCoop {
    private int id;
    private Chicken[] chickens;

    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + id + ", chickens=" + chickens + '}';
    }

    public String toString(int type) {
        StringBuilder coopData = new StringBuilder();
        if (type == 1) { // csv
            coopData.append(id).append(",");
            for (Chicken chicken : chickens) {
                coopData.append(chicken.toString(1)).append(";");
            }
        } else if (type == 2) { // txt
            coopData.append("ChickenCoop ID: ").append(id).append("\n");
            for (Chicken chicken : chickens) {
                coopData.append(chicken.toString(2)).append("\n");
            }
        } else if (type == 3) { // json
            coopData.append("{\n  \"id\": ").append(id).append(",\n  \"chickens\": [\n");
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
        this.id = id;
        this.chickens = chickens;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Chicken[] getChickens() {
        return chickens;
    }

    public void setChickens(Chicken[] chickens) {
        this.chickens = chickens;
    }
}
