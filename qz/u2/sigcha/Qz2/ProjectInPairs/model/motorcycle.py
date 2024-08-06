class Motorcycle:
    def __init__(self, id, brand, model, engine_capacity):
        self.id = id
        self.brand = brand
        self.model = model
        self.engine_capacity = engine_capacity

    def to_dict(self):
        return {
            "id": self.id,
            "brand": self.brand,
            "model": self.model,
            "engine_capacity": self.engine_capacity
        }
