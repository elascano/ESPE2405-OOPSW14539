# models/chicken.py

from datetime import datetime

class Chicken:
    def __init__(self, chicken_id, name, color, molting, born_on_date):
        self.chicken_id = chicken_id
        self.name = name
        self.color = color
        self.molting = molting
        self.born_on_date = born_on_date

    def __str__(self):
        return f"Chicken{{id={self.chicken_id}, name={self.name}, color={self.color}, molting={self.molting}, born_on_date={self.born_on_date}}}"
