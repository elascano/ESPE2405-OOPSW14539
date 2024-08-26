package ec.edu.espe.sortingstrategysystem.view;
import ec.edu.espe.sortingstrategysystem.controller.SortController;
import ec.edu.espe.sortingstrategysystem.model.SortView;
import ec.edu.espe.sortingstrategysystem.model.SortingContext;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class SortingStrategySystem {
    public static void main(String[] args) {
        // Crear el contexto de la ordenación
        SortingContext context = new SortingContext();
        
        // Crear la vista
        SortView view = new SortView();
        view.setVisible(true);
        
        // Crear el controlador
        new SortController(view, context);
    }
}
