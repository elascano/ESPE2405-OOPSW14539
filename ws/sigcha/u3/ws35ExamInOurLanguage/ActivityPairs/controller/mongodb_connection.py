from pymongo import MongoClient

class MongoDBConnection:
    CONNECTION_STRING = "mongodb+srv://kjsigcha:kjsigcha@cluster0.j5elpou.mongodb.net/"
    mongo_client = None
    database = None

    @staticmethod
    def connect():
        MongoDBConnection.mongo_client = MongoClient(MongoDBConnection.CONNECTION_STRING)
        MongoDBConnection.database = MongoDBConnection.mongo_client["buildings_db"]

    @staticmethod
    def get_database():
        return MongoDBConnection.database