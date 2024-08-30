from pymongo import MongoClient

class Database:
    def __init__(self):
        uri = "mongodb+srv://sol:sol@hsmera.ln6djqr.mongodb.net/?retryWrites=true&w=majority&appName=hsmera"
        self.client = MongoClient(uri)
        self.db = self.client['Strategy']
        self.collection = self.db['arrayMera']

    def save_record(self, record):
        self.collection.insert_one(record)
