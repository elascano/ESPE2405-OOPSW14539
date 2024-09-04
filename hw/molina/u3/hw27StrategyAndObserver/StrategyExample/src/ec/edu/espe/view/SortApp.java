
package ec.edu.espe.view;

import ec.edu.espe.model.SortingContext;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public class SortApp {

    public static void main(String[] args) {
        int data[] = {3, 6, 4, 6, 7, 8, 5, 6, 7, 5, 3, 3}; 
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);

        // Imprimir la lista ordenada
        for (int i = 0; i < sortedList.length; i++) {
            System.out.print(sortedList[i] + " ");
        }
    }
    
}
