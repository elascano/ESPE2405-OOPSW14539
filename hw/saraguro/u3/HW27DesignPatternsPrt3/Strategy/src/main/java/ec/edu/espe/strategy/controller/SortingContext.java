package ec.edu.espe.strategy.controller;

import ec.edu.espe.strategy.model.BubbleSort;
import ec.edu.espe.strategy.model.InsertionSort;
import ec.edu.espe.strategy.model.QuickSort;
import ec.edu.espe.strategy.model.SortingStrategy;

/**
 *
 * @author Leidy Saraguro
 */

public class SortingContext {

    private SortingStrategy ss;

    public int[] sort(int data[]) {
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 30) {
            ss = new BubbleSort();
        } else if (n >= 30 && n < 100) {
            ss = new InsertionSort();
        } else {
            ss = new QuickSort();
        }
        return ss;
    }
}
