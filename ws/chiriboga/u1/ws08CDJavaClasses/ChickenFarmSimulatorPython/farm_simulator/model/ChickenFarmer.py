# File: ec/edu/espe/farmsimulator/model/ChickenFarmer.py

from farm_simulator.model.ChickenCoop import ChickenCoop

class ChickenFarmer:
    def __init__(self, id, name, coops):
        self.id = id
        self.name = name
        self.coops = coops

    def __str__(self):
        coops_info = "\n".join([str(coop) for coop in self.coops])
        return f"ChickenFarmer {{ {self.id},{self.name} }} \n{coops_info}"

    def to_csv(self):
        csv_data = f"{self.id},{self.name}\n"
        csv_data += "\n".join([coop.to_csv() for coop in self.coops])
        return csv_data

    def add_coop(self, coop):
        self.coops.append(coop)

    def remove_coop(self, coop):
        self.coops.remove(coop)

    # Getters and setters omitted for brevity
