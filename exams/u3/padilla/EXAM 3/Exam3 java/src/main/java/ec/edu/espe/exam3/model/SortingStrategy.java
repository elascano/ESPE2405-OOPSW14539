package ec.edu.espe.exam3.model;

/**
 *
 * @author Marco Padilla
 */
public interface SortingStrategy {
    public int[] sort(int data[]);
    public int[] sort(int data[],int low, int high);
    
}