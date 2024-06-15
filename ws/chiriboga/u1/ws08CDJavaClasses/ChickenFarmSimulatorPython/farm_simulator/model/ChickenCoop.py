# File: ec/edu/espe/farmsimulator/model/ChickenCoop.py

from farm_simulator.model import Chicken

class ChickenCoop:
    def __init__(self, id, chickens):
        self.id = id
        self.chickens = chickens

    def __str__(self):
        chickens_info = "\n".join([str(chicken) for chicken in self.chickens])
        return f"ChickenCoop {{ {self.id} }} \n{chickens_info}"

    def to_csv(self):
        csv_data = f"Coop ID: {self.id}\n"
        csv_data += "\n".join([chicken.to_csv() for chicken in self.chickens])
        return csv_data

    def add_chicken(self, chicken):
        self.chickens.append(chicken)

    def remove_chicken(self, chicken):
        self.chickens.remove(chicken)

