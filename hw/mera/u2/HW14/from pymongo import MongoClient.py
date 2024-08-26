from pymongo import MongoClient

class ParkModel:
    def __init__(self, connection_string):
        self.client = MongoClient(connection_string)
        self.db = self.client['Park']
        self.collection = self.db['Parks']
    
    def get_park_by_id(self, park_id):
        return self.collection.find_one({"id": park_id})
