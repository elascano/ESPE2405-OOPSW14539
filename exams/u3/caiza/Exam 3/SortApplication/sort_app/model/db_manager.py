import pymongo
from pymongo import MongoClient

class DBManager:
    def __init__(self):
        self.client = MongoClient("tu_conexion_a_mongodb_atlas")
        self.db = self.client["strategyCaiza"]
        self.collection = self.db["arrayMiguel"]

    def save_sorting_result(self, unsorted_list, size, algorithm, sorted_list):
        document = {
            "unsorted": ",".join(map(str, unsorted_list)),
            "size": size,
            "sort algorithm": algorithm,
            "sorted": ",".join(map(str, sorted_list))
        }
        self.collection.insert_one(document)

    def close_connection(self):
        self.client.close()
