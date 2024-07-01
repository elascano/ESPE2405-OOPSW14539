
package ec.edu.espe.phoneshop.view;
/**
 *
 * @author Frank Alvaradom, As-Byte Wizards, DCCO-ESPE
 */
import Utils.FileManager;
import java.util.Scanner;
public class ShoppingSystem {
    
    
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume el salto de línea pendiente
        
        System.out.println("Brand:");
        String brand = scanner.nextLine();
        
        System.out.println("Size:");
        float size = scanner.nextFloat();
        scanner.nextLine(); // Consume el salto de línea pendiente
        
        System.out.println("Color:");
        String color = scanner.nextLine();
        
        System.out.println("Model:");
        String model = scanner.nextLine();
        FileManager.saveManagerProduct(id, brand, size, color, model);
        FileManager.readManager();
        
    }
    
    
    
    
    
}
