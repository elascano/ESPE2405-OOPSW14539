
package ec.edu.espe.phoneshop.model;

/**
 *
 * @author Frank Alvaradom, As-Byte Wizards, DCCO-ESPE
 */
public class Phone {

int id;
String brand;
float size;
String color;
String model;

    public Phone(int id, String brand, float size, String color, String model) {
        this.id = id;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    
}
