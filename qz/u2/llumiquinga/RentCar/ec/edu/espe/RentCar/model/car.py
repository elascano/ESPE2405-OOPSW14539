class Car:
    def __init__(self, id, model, brand, year, price_day, available):
        self.id = id
        self.model = model
        self.brand = brand
        self.year = year
        self.price_day = price_day
        self.available = available

    def addCar(self):
        return {
            "id": self.id,
            "model": self.model,
            "brand": self.brand,
            "year": self.year,
            "price_day": self.price_day,
            "available": self.available
        }
