package ec.edu.espe.hw30_strategy.controller;

/**
 * BubbleSort algorithm as a strategy
 * @author Damian Toscano
 */
public class BubbleSort implements SortingStrategy {
    @Override
    public int[] sort(int data[]) {
        int n = data.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(data[j-1] > data[j]){
                    //swap elements
                    temp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }
}
