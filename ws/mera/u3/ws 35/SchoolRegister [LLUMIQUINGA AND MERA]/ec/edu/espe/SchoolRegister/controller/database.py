from pymongo import MongoClient
from ec.edu.espe.SchoolRegister.model.school import School
from datetime import datetime

class Database:
    def __init__(self):
        self.client = MongoClient('mongodb+srv://JersonLlM:jersonllm23@cluster0.yjwpgvg.mongodb.net/')
        self.db = self.client['SchoolRegister']
        self.collection = self.db['school']

    def insert_school(self, school):
        if isinstance(school, School):
            current_year = datetime.now().year
            foundation_year = school.foundation_year
            age = current_year - foundation_year
            
            school_data = {
                'id': school.id,
                'name': school.name,
                'address': school.address,
                'city': school.city,
                'phone': school.phone,
                'foundation_year': foundation_year,
                'age': age 
            }
            self.collection.insert_one(school_data)
        else:
            raise ValueError("Expected an instance of School")