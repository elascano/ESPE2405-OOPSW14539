/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.hw27strategy.model;

/**
 *
 * @author Erick Tufiño
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
        } else if (n >= 100) {
            ss = new QuickSort();
        }
        return ss;
    }
}
