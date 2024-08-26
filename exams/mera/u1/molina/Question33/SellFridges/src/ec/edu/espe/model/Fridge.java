
package ec.edu.espe.model;

import java.util.Scanner;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public class Fridge {
    private int id;
    private float price;
    private String model;
    private int quantity;

    @Override
    public String toString() {
        return "Fridge{" + "id=" + id + ", price=" + price + ", model=" + model + ", quantity=" + quantity + '}';
    }

    public Fridge(int id, float price, String model, int quantity) {
        this.id = id;
        this.price = price;
        this.model = model;
        this.quantity = quantity;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public static Fridge newFridgeInStock(){
        int idFridge;
        float priceFridge;
        String modelFridge;
        int quantityFridges;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the new fridge");
        System.out.println("Id: ");
        idFridge = Integer.parseInt(scan.nextLine());
        System.out.println("price: ");
        priceFridge = Float.parseFloat(scan.nextLine());
        System.out.println("model: ");
        modelFridge = scan.nextLine();
        System.out.println("quantity: ");
        quantityFridges = Integer.parseInt(scan.nextLine());
        
        Fridge fridge = new Fridge(idFridge, priceFridge, modelFridge, quantityFridges);
        return fridge;
    }
}
