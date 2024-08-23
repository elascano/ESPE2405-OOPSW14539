package ec.edu.espe.strategygui.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class SortingData {
    private Sort ss;

    public int[] sort(int data[]) {
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }

    public Sort setSortStrategy(int n) {
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
