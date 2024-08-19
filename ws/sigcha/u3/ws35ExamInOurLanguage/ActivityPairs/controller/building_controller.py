from pymongo import MongoClient
from model.building import Building
from datetime import datetime

class BuildingController:
    def __init__(self, view, database):
        self.buildings = []
        self.view = view
        self.database = database

    def create_building(self, name, architect, construction_year, value):
        id = str(len(self.buildings) + 1)
        building = Building(id, name, architect, construction_year, value)
        self.buildings.append(building)

        collection = self.database["buildings_db"]
        doc = {
            "id": id,
            "name": name,
            "architect": architect,
            "constructionYear": construction_year,
            "value": value,
            "age": building.age
        }
        collection.insert_one(doc)

    def get_all_buildings(self):
        collection = self.database["buildings_db"]
        buildings = []

        for doc in collection.find():
            building = Building(
                doc["id"],
                doc["name"],
                doc["architect"],
                doc["constructionYear"],
                doc["value"]
            )
            buildings.append(building)
        return buildings

    def get_building_by_id(self, id):
        collection = self.database["buildings_db"]
        doc = collection.find_one({"id": id})
        if doc:
            return Building(
                doc["id"],
                doc["name"],
                doc["architect"],
                doc["constructionYear"],
                doc["value"]
            )
        return None

    def get_view(self):
        return self.view

    def update_ages(self):
        collection = self.database["buildings_db"]
        current_year = datetime.now().year
        for building in self.get_all_buildings():
            new_age = current_year - building.construction_year
            collection.update_one({"id": building.id}, {"$set": {"age": new_age}})