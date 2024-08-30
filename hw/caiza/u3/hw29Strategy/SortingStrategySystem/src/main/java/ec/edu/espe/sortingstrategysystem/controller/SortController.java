package ec.edu.espe.sortingstrategysystem.controller;
import ec.edu.espe.sortingstrategysystem.model.SortView;
import ec.edu.espe.sortingstrategysystem.model.SortingContext;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class SortController {
    private SortView view;
    private SortingContext context;

    public SortController(SortView view, SortingContext context) {
        this.view = view;
        this.context = context;

        // Vincular la acción del botón de ordenar
        this.view.getSortButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortNumbers();
            }
        });
    }

    private void sortNumbers() {
        // Obtener los datos de la vista
        String input = view.getInputText();
        String[] inputStrings = input.split(",");
        int[] numbers = new int[inputStrings.length];

        // Convertir a array de enteros
        try {
            for (int i = 0; i < inputStrings.length; i++) {
                numbers[i] = Integer.parseInt(inputStrings[i].trim());
            }
        } catch (NumberFormatException ex) {
            view.setResult("Invalid input. Please enter numbers separated by commas.");
            return;
        }

        // Seleccionar la estrategia de ordenación
        String algorithm = view.getSelectedAlgorithm();
        switch (algorithm) {
            case "BubbleSort":
                context.setSortStrategy(new BubbleSort());
                break;
            case "QuickSort":
                context.setSortStrategy(new QuickSort());
                break;
            case "InsertionSort":
                context.setSortStrategy(new InsertionSort());
                break;
        }

        // Ordenar los números
        context.sort(numbers);

        // Mostrar el resultado en la vista
        StringBuilder result = new StringBuilder("Sorted numbers: ");
        for (int num : numbers) {
            result.append(num).append(" ");
        }
        view.setResult(result.toString());
    }   
}

