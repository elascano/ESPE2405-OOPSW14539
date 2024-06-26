package ec.edu.espe.farmsimulatorv2.view;

import ec.edu.espe.farmsimulatorv2.model.ChickenV2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.IOException;
import utilgV2.FileManagerV2;



/**
 * @autor Kerlly Chiriboga, ODS
 */
public class ChickenFarmSimulatorV2 {
    public static void main(String[] args) {
        System.out.println("Kerlly's Chicken Farm Simulator");

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);

        System.out.println("Enter file type to save (csv/txt): ");
        String fileType = scanner.nextLine().toLowerCase();

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter chicken data " + (i + 1) + ":");
            System.out.println("ID: ");
            int id = scanner.nextInt();

            scanner.nextLine(); 

            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Color: ");
            String color = scanner.nextLine();

            System.out.println("Molting (true/false): ");
            boolean molting = scanner.nextBoolean();

            scanner.nextLine(); 

            Date bornOnDate = null;
            while (bornOnDate == null) {
                System.out.println("Born on Date (yyyy-MM-dd): ");
                String bornOnDateStr = scanner.nextLine();

                try {
                    bornOnDate = dateFormat.parse(bornOnDateStr);
                } catch (ParseException e) {
                    System.err.println("Invalid date format. Please use yyyy-MM-dd");
                }
            }

            ChickenV2 chicken = new ChickenV2(id, name, color, molting, bornOnDate);

            System.out.println("Chicken data: " + chicken.toString()); 

            String data = chicken.toCSV();

            try {
                FileManagerV2.save(data, "chickensV2", fileType);
            } catch (IOException e) {
                System.err.println("An error occurred while saving the data: " + e.getMessage());
            }
        }

        System.out.println("¡All chickens have been saved!");
    }
}
