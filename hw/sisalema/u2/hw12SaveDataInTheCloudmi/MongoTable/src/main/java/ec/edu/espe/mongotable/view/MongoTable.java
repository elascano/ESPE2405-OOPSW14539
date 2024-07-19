package ec.edu.espe.mongotable.view;

import com.mongodb.client.MongoDatabase;
import ec.edu.espe.mongotable.controller.Connection;
import ec.edu.espe.mongotable.controller.Table;
import ec.edu.espe.mongotable.controller.TablesCrud;

/**
 *
 *  @author Yostin Sisalema, Code Master, DCCO-ESPE
 */

public class MongoTable {
    public static void main(String[] args) {
        Connection connection = new Connection();
        MongoDatabase mongodb = connection.connectionDataBase();
        
        if (mongodb != null) {
            TablesCrud tableCrud = new TablesCrud();
            System.out.println("Enter the table name"); 
            String nameTable = System.console().readLine();
            System.out.println("Enter the table price"); 
            double priceTable = Double.parseDouble(System.console().readLine());
            System.out.println("Enter the table color"); 
            String colorTable = System.console().readLine();
            System.out.println("Enter the table material"); 
            String materialTable = System.console().readLine();
            System.out.println("Enter the table weight"); 
            double weightTable = Double.parseDouble(System.console().readLine());
            
            Table table = new Table(nameTable, colorTable, materialTable, priceTable, weightTable);
            tableCrud.createTable(table);
            tableCrud.readTable();
            tableCrud.updateTable();
            tableCrud.deleteTable();
            tableCrud.readTable();
        } else {
            System.out.println("Failed to connect to the database");
        }
    }
}