/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypattern.model;

import ec.edu.espe.strategypattern.controller.BubbleSort;
import ec.edu.espe.strategypattern.controller.InsertSort;
import ec.edu.espe.strategypattern.controller.QuickSort;
import ec.edu.espe.strategypattern.controller.SortingStrategy;
import static java.nio.file.Files.size;

/**
 *
 * @author Lainez Ricardo JEZHE ESPE
 */
public class SortingContext {
    private SortingStrategy ss;
    public int[] sort(int data[]){
        int size = data.length;
        ss = setSortStrategy(size);
        
        return ss.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int n){
        if(n>0 && n<30){
            ss = new BubbleSort();
        }
        if(n>=30 && n<100){
            ss = new InsertSort();
        }
        if(n>=100){
            ss = new QuickSort();
        }
        return ss;
    }
}
