
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Leydi Oña, Lenovo, DCCO-ESPE>
 */
public class Ant {
    Cell position;
    int weigth;
    public  void run (){
        System.out.println("Ant is running");
                
    }

    public void carry(Food food){
        System.out.println("This ant is carrying -->" + food);
    }
    public Ant(Cell position, int weigth) {
        this.position = position;
        this.weigth = weigth;
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Ant{" + "position=" + position + ", weigth=" + weigth + '}';
    }
    
    
}
