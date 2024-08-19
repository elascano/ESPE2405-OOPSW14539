from pymongo import MongoClient

class Database:
    def __init__(self, uri, db_name):
        self.client = MongoClient(uri)
        self.db = self.client[db_name]
        self.collection = self.db["UserData"]  # Asegúrate de crear una colección "UserData"
    
    def insert_user_input(self, name, gender, marital_status, interests, annual_salary, monthly_salary):
        user_data = {
            "name": name,
            "gender": gender,
            "marital_status": marital_status,
            "interests": interests,
            "annual_salary": annual_salary,
            "monthly_salary": monthly_salary
        }
        self.collection.insert_one(user_data)
        print("Data inserted successfully")

# Para pruebas rápidas
if __name__ == "__main__":
    db = Database('mongodb+srv://sjeancarlo:sjeancarlo@cluster0.3ixvnnj.mongodb.net', 'Example')
    db.insert_user_input("John Doe", "Male", "Single", ["Music", "Sports"], 120000, 10000)
