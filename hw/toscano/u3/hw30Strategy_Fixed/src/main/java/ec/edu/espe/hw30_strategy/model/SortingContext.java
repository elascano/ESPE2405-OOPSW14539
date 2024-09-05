package ec.edu.espe.hw30_strategy.model;

import ec.edu.espe.hw30_strategy.controller.BubbleSort;
import ec.edu.espe.hw30_strategy.controller.SortingStrategy;

/**
 * Context for selecting and executing the sorting strategy
 * @author Damian Toscano
 */
public class SortingContext {

    private SortingStrategy ss;

    public int[] sort(int data[]) {
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 30)
            ss = new BubbleSort();
        // Add other strategies here
        return ss;
    }
}
