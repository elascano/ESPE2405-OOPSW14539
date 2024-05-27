
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Ricardo Lainez JEZHE Association Software Engineers
 */
public class Ant {
    private Cell position;
    private int weight;
    
    public void run(){
        System.out.println("Ant is running");
    }
    
    public void carry(Food food){
        System.out.println("This ant is carrying --> " + food);
    }

    public Ant(Cell position, int weight) {
        this.position = position;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ant{" + "position=" + position + ", weight=" + weight + '}';
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
