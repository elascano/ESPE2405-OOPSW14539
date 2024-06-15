
package ec.edu.espe.computershop.model;

import sales.Tax;

public class Computer {
   private int id;
   private String brand;
   private float basePrice;
   private float pvp;

   public Computer(int id, String brand, float basePrice) {
      this.id = id;
      this.brand = brand;
      this.basePrice = basePrice;
      this.pvp = Tax.computeIva(15.0F, basePrice);
   }

    @Override
    public String toString() {
        return "Computer{" + "id=" + id + ", brand=" + brand + ", basePrice=" + basePrice + ", pvp=" + pvp + '}';
    }

   
   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getBrand() {
      return this.brand;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public float getBasePrice() {
      return this.basePrice;
   }

   public void setBasePrice(float basePrice) {
      this.basePrice = basePrice;
   }

   public float getPvp() {
      return this.pvp;
   }

   public void setPvp() {
      this.pvp = this.basePrice + Tax.computeIva(15.0F, this.basePrice);
   }
}
