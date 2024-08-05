/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.motorcycle.model;

/**
 *
 * @author IAEN
 */
public class motorcycleInfo{
    public static class Motorcycle {
        private String brand;
        private String model;
        private int yearOfProduction;
        private String color;
        private int id;

        public Motorcycle(String brand, String model, int yearOfProduction, String color, int id) {
            this.brand = brand;
            this.model = model;
            this.yearOfProduction = yearOfProduction;
            this.color = color;
            this.id = id;
        }

        // Getters and setters
        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYearOfProduction() {
            return yearOfProduction;
        }

        public void setYearOfProduction(int yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Motorcycle{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", yearOfProduction=" + yearOfProduction +
                    ", color='" + color + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}

    
    
