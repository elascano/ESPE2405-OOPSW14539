# File: ec/edu/espe/farmsimulator/model/Chicken.py

from datetime import datetime

class Chicken:
    def __init__(self, id, name, color, molting, bornOnDate):
        self.id = id
        self.name = name
        self.color = color
        self.molting = molting
        self.born_on_date = bornOnDate
        self.age = self.compute_age(bornOnDate)

    def __str__(self):
        return f"Chicken {{ {self.id},{self.name},{self.color},{self.age},{self.molting},{self.born_on_date.strftime('%Y-%m-%d')} }}"

    def to_csv(self):
        return f"{self.id},{self.name},{self.color},{self.age},{self.molting},{self.born_on_date.strftime('%Y-%m-%d')}"

    def compute_age(self, born_on_date):
        today = datetime.now()
        years = today.year - born_on_date.year
        if today.month < born_on_date.month or (today.month == born_on_date.month and today.day < born_on_date.day):
            years -= 1
        return years

    # Getters and setters omitted for brevity, but they follow a similar structure in Python
