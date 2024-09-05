package ec.edu.espe.hw30_strategy.view;

import ec.edu.espe.hw30_strategy.model.SortingContext;

/**
 * Main application class
 * @author Damian Toscano
 */
public class SortApp {
    public static void main(String[] args) {
        int data[] = {3, 6, 4, 6, 7, 8, 5, 6, 7, 5, 3, 3};
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
        
        System.out.println("Sorted array:");
        for(int num : sortedList) {
            System.out.print(num + " ");
        }
    }
}
