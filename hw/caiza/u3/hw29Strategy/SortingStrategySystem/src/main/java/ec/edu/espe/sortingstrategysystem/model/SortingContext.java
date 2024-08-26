package ec.edu.espe.sortingstrategysystem.model;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class SortingContext {
    private SortingStrategy strategy;

    public void setSortStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] array) {
        if (strategy != null) {
            strategy.sort(array);
        }
    }    
}
