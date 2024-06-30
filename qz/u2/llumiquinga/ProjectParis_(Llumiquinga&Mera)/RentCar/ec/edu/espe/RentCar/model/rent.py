from datetime import date

class Rent:
    def __init__(self, car, customer, start_date, end_date, total_price):
        self.car = car
        self.customer = customer
        self.start_date = start_date
        self.end_date = end_date
        self.total_price = total_price

    def calculatePrice(self):
        delta = (self.end_date - self.start_date).days
        self.total_price = delta * self.car.price_day
        return self.total_price

    def addRent(self):
        return {
            "car": self.car.addCar(),
            "customer": self.customer.addCustomer(),
            "start_date": self.start_date.isoformat(),
            "end_date": self.end_date.isoformat(),
            "total_price": self.total_price
        }
