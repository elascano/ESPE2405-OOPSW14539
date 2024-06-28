import json
from datetime import date
from ec.edu.espe.RentCar.model.car import Car
from ec.edu.espe.RentCar.model.customer import Customer
from ec.edu.espe.RentCar.controller.rentmanager import RentManager 

def main():
    rent_manager = RentManager()
    
    # Capturar datos de Car
    car_id = int(input("Car ID: "))
    car_model = input("Car Model: ")
    car_brand = input("Car Brand: ")
    car_year = int(input("Car Year: "))
    car_price_day = float(input("Car Price per Day: "))
    car_available = input("Car Available (true/false): ").lower() == 'true'
    car = Car(car_id, car_model, car_brand, car_year, car_price_day, car_available)
    rent_manager.cars.append(car)
    
    # Capturar datos de Customer
    customer_id = int(input("Customer ID: "))
    customer_name = input("Customer Name: ")
    customer_license_number = input("Customer License Number: ")
    customer = Customer(customer_id, customer_name, customer_license_number)
    rent_manager.customers.append(customer)
    
    # Capturar datos de Rent
    start_date = date.fromisoformat(input("Rent Start Date (YYYY-MM-DD): "))
    end_date = date.fromisoformat(input("Rent End Date (YYYY-MM-DD): "))
    rent = rent_manager.createRent(car, customer, start_date, end_date)
    
    # Guardar datos en JSON
    with open('rent_data.json', 'w') as f:
        json.dump(rent_manager.toJSON(), f, indent=4)
    
    print("Datos guardados en 'rent_data.json'")

if __name__ == "__main__":
    main()
