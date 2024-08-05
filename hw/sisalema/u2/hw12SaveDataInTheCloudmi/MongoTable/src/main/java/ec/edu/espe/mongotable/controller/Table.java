package ec.edu.espe.mongotable.controller;

import com.mongodb.client.*;
import com.mongodb.client.model.*;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Yostin Sisalema,Code Master, DCCO-ESPE
 */

public class Table {
    private ObjectId id;
    private String name;
    private String color;
    private String material;
    private double price;
    private double weight;

    public Table(String name, String color, String material, double price, double weight) {
        this.name = name;
        this.color = color;
        this.material = material;
        this.price = price;
        this.weight = weight;
    }

    
    public Document buildDocumentTable() {
        return new Document("name", this.name).append("color", this.color).append("material",this.material).append("price", this.price).append("weight",this.weight);
    }
    
    /**
     * @return the id
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
