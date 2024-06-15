# models/chicken_coop.py

class ChickenCoop:
    def __init__(self, coop_id, chickens):
        self.coop_id = coop_id
        self.chickens = chickens

    def __str__(self):
        return f"ChickenCoop{{id={self.coop_id}, chickens={self.chickens}}}"
