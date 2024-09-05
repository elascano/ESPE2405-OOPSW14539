from pymongo import MongoClient
from pymongo.errors import ServerSelectionTimeoutError, OperationFailure

class SortModel:
    def __init__(self):
        try:
            
            self.client = MongoClient('mongodb+srv://MiguelAngel:miguel1234@cluster0.hovruoz.mongodb.net/')
            self.db = self.client['strategyCaiza']
            self.collection = self.db['arrayMiguel']
            
            
            self.client.server_info()
        except ServerSelectionTimeoutError:
            print("Error: Cannot connect to MongoDB database.")
        except OperationFailure:
            print("Error: Database operation failed.")
        except Exception as e:
            print(f"Error: {e}")

    def save_to_database(self, unsorted, size, algorithm, sorted_array):
        try:
            document = {
                'unsorted': unsorted,
                'size': size,
                'sort algorithm': algorithm,
                'sorted': sorted_array
            }
            self.collection.insert_one(document)
            print("Data successfully saved to the database.")
        except Exception as e:
            print(f"Error saving to the database: {e}")
