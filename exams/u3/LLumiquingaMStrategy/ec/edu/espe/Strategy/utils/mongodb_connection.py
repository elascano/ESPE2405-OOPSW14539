from pymongo import MongoClient

class MongoDBConnection:
    def __init__(self):
        self.client = MongoClient("mongodb+srv://JersonLlM:jersonllm23@cluster0.yjwpgvg.mongodb.net/")
        self.db = self.client["strategyLlumiquingaM"]
        self.collection = self.db["arrayJerson"]

    def insert_record(self, record):
        self.collection.insert_one(record)
