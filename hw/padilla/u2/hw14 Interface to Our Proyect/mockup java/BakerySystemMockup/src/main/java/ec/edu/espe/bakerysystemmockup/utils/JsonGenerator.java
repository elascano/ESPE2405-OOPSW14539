/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.bakerysystemmockup.utils;

/**
 *
 * @author adria
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.SystemForBakery.model.Bills;
import ec.edu.espe.SystemForBakery.model.Stock;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class JsonGenerator {
    
    private static final String FILE_BILL = "bills.json";
    private static final String FILE_STOCK = "stock.json";

    private static final Gson gson = new GsonBuilder()
        .setPrettyPrinting()
        .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
        .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())
        .create();

    public static void generateBillJson(Bills bill) {
        try (FileWriter writer = new FileWriter(FILE_BILL)) {
            gson.toJson(bill, writer);
            System.out.println("Archivo JSON generado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al generar el archivo JSON: " + e.getMessage());
        }
    }

    public static void generateStockJson(Stock stock) {
        try (FileWriter writer = new FileWriter(FILE_STOCK)) {
            gson.toJson(stock, writer);
            System.out.println("Archivo JSON generado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al generar el archivo JSON: " + e.getMessage());
        }
    }
}
