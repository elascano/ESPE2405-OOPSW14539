
package ec.edu.espe.GoalKeeper.view;

import java.util.Scanner;

/**
 *
 * @author David Pilaguano, Lenovo , DCCO-ESPE
 */
public class GoalKeeper {
    
   public static void main(String[] args) {
       GoalkeeperService service = new GoalkeeperService();
        service.loadFromJson();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Goalkeeper ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter Goalkeeper Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Goalkeeper Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Goalkeeper Saves: ");
        int saves = scanner.nextInt();

        Goalkeeper goalkeeper = new Goalkeeper(id, name, age, saves);
        service.addGoalkeeper(goalkeeper);
        service.saveToJson();

        System.out.println("Goalkeepers:");
        for (Goalkeeper gk : service.getGoalkeepers()) {
            System.out.println(gk)
   
}
}