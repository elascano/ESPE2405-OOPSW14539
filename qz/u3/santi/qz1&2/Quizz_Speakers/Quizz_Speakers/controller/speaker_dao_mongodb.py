from pymongo import MongoClient
from model.speaker import Speaker
from controller.speaker_dao import SpeakerDAO
from typing import List

class SpeakerDAOMongoDB(SpeakerDAO):
    def __init__(self):
        connection_string = "mongodb+srv://sjeancarlo:sjeancarlo@cluster0.3ixvnnj.mongodb.net/?appName=Cluster0"
        client = MongoClient(connection_string)
        database = client["speakerdb"]
        self.collection = database["speakers"]

    def create(self, speaker: Speaker):
        doc = {
            "_id": speaker.id,
            "brand": speaker.brand,
            "power": speaker.power,
            "frequency": speaker.frequency
        }
        self.collection.insert_one(doc)

    def read(self, speaker_id: str) -> Speaker:
        doc = self.collection.find_one({"_id": speaker_id})
        if doc:
            return Speaker(
                doc["_id"],
                doc["brand"],
                doc["power"],
                doc["frequency"]
            )
        return None

    def update(self, speaker: Speaker):
        query = {"_id": speaker.id}
        update = {
            "$set": {
                "brand": speaker.brand,
                "power": speaker.power,
                "frequency": speaker.frequency
            }
        }
        self.collection.update_one(query, update)

    def delete(self, speaker_id: str):
        self.collection.delete_one({"_id": speaker_id})

    def list_all(self) -> List[Speaker]:
        speakers = []
        for doc in self.collection.find():
            speakers.append(Speaker(
                doc["_id"],
                doc["brand"],
                doc["power"],
                doc["frequency"]
            ))
        return speakers
