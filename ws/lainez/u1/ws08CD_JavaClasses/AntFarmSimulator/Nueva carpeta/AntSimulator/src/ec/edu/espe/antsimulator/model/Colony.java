
package ec.edu.espe.antsimulator.model;
/**
 *
 * @author Ricardo Lainez JEZHE Association Software Engineers
 */
public class Colony {
    
    private Nest nest;
    private Ant ants[];
    
    public void run(){
        System.out.println("The colony is running");
    }

    public Colony(Nest nest,int size) {
        this.ants=new Ant[size];
        this.nest = nest;
        this.ants = ants;
    }
    
    public Colony(Nest nest, Ant[] ants) {
        this.ants=new Ant[ants.length];
        this.nest = nest;
        this.ants = ants;
    }

    @Override
    public String toString() {
        String localAnts = "";
        for (int i = 0; i < ants.length; i++) {
            localAnts = localAnts + ants[i];
        }
        return "Colony{" + "nest=" + nest + ", ants=" + localAnts + '}';
    }
    
    public Nest getNest() {
        return nest;
    }

    public void setNest(Nest nest) {
        this.nest = nest;
    }

    public Ant[] getAnts() {
        return ants;
    }

    public void setAnts(Ant[] ants) {
        this.ants = ants;
    }
}
