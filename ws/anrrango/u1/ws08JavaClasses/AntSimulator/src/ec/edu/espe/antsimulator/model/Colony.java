
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Mario Anrrango A-Byte Wizards, DCCO ESPE
 */
public class Colony {
    private Nest nest;
    private Ant ants[];
    
    public void run(){
        System.out.println("The colony is running");
    }

    @Override
    public String toString() {
        String localAnts = "";
        for (Ant ant : ants) {
            localAnts = localAnts + ant;
        }
        return "Colony{" + "nest=" + nest + ", ants=" + localAnts + '}';
    }

    
        public Colony(Nest nest,int size) {
        this.ants = new Ant[size];
        this.nest = nest;
        this.ants = ants;
    }
    
    
    
    
    
    public Colony(Nest nest, Ant[] ants) {
        this.ants = new Ant[ants.length];
        this.nest = nest;
        this.ants = ants;
    }

    /**
     * @return the nest
     */
    public Nest getNest() {
        return nest;
    }

    /**
     * @param nest the nest to set
     */
    public void setNest(Nest nest) {
        this.nest = nest;
    }

    /**
     * @return the ants
     */
    public Ant[] getAnts() {
        return ants;
    }

    /**
     * @param ants the ants to set
     */
    public void setAnts(Ant[] ants) {
        this.ants = ants;
    }
    
    
}
