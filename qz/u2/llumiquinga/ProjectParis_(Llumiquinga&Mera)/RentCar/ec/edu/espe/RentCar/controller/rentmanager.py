from ec.edu.espe.RentCar.model.car import Car
from ec.edu.espe.RentCar.model.customer import Customer
from ec.edu.espe.RentCar.model.rent import Rent

class RentManager:
    def __init__(self):
        self.cars = []
        self.customers = []
        self.rents = []

    def createRent(self, car, customer, start_date, end_date):
        rent = Rent(car, customer, start_date, end_date, 0)
        rent.calculatePrice()
        self.rents.append(rent)
        return rent

    def toJSON(self):
        return {
            "cars": [car.addCar() for car in self.cars],
            "customers": [customer.addCustomer() for customer in self.customers],
            "rents": [rent.addRent() for rent in self.rents]
        }
