class Computer:
    def __init__(self, id, model, brand, storage, ram):
        self.id = id
        self.model = model
        self.brand = brand
        self.storage = storage
        self.ram = ram

    def __str__(self):
        return f"Computer{{id={self.id}, model={self.model}, brand={self.brand}, storage={self.storage}, ram={self.ram}}}"
