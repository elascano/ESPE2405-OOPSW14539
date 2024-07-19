from pymongo import MongoClient
from datetime import datetime

class MongoDB_Manager:
    def __init__(self, uri, db_name, collection_name):
        self.client = MongoClient(uri)
        self.db = self.client[db_name]
        self.collection = self.db[collection_name]

    def insert_student(self, student):
        student_data = {
            "id": student.id,
            "name": student.name,
            "born_on_date": student.born_on_date,
            "major": student.major,
            "gpa": student.gpa
        }
        result = self.collection.insert_one(student_data)
        return result.inserted_id

    def close_connection(self):
        self.client.close()
