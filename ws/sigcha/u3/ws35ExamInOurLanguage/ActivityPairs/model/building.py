from datetime import datetime

class Building:
    def __init__(self, id, name, architect, construction_year, value):
        self.id = id
        self.name = name
        self.architect = architect
        self.construction_year = construction_year
        self.value = value
        self.age = self.calculate_age()

    def compute_value_per_year(self):
        return self.value / (datetime.now().year - self.construction_year)

    def calculate_age(self):
        current_year = datetime.now().year
        return current_year - self.construction_year

    def __str__(self):
        return f"Building(id={self.id}, name={self.name}, architect={self.architect}, " \
               f"construction_year={self.construction_year}, value={self.value}, age={self.age})"