# MethodsBanks.py
from Conection import Conection
from pymongo.errors import PyMongoError
from Banks import Banks
from datetime import datetime

class MethodsBanks:
    def __init__(self):
        self.conn = Conection()
        self.conn.create_connection() 
        self.database = self.conn.getMongoDatabase()
        self.collection = self.database.get_collection("data")

    def close_connection(self):
        if self.conn.getMongoClient():
            self.conn.getMongoClient().close()
            
    def calculate_age(self, birth_date):
        today = datetime.today()
        age = today.year - birth_date.year - ((today.month, today.day) < (birth_date.month, birth_date.day))
        return age

    def get_integer_from_document(self, doc, key):
        value = doc.get(key)
        if isinstance(value, int):
            return value
        elif isinstance(value, str):
            try:
                return int(value)
            except ValueError:
                return None
        return None

    def list_banks(self):
        list_banks = []
        try:
            documents = self.collection.find()
            for doc in documents:
                bank = Banks()
                identity_card = self.get_integer_from_document(doc, "identity_Card")
                bank.name = doc.get("name")
                bank.last_name = doc.get("last_name")
                bank.dy_bourner = doc.get("age")
                amount = self.get_integer_from_document(doc, "amount")

                if identity_card is not None:
                    bank.id = identity_card
                if amount is not None:
                    bank.amount = amount

                list_banks.append(bank)
        except PyMongoError as e:
            print(f"Error querying data: {e}")
        finally:
            self.close_connection()

        return list_banks

    
    def add_bank(self, bank: Banks) -> None:
        try:
            age = self.calculate_age(bank.dob)
            new_bank = {
                "identity_Card": bank.id,
                "name": bank.name,
                "last_name": bank.last_name,
                "age" : age,
                "amount": bank.amount
            }
            result = self.collection.insert_one(new_bank)
            print(f"Inserted document id: {result.inserted_id}")
        except PyMongoError as e:
            print(f"Error adding data: {e}")
        finally:
            self.close_connection()
