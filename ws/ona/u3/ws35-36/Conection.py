# MethodsBank.py
from pymongo import MongoClient
from pymongo.errors import PyMongoError
from pymongo.server_api import ServerApi
from Banks import Banks

class Conection:
    def __init__(self):
        self.connectionString = "mongodb+srv://leona4:leona4@ley.6c6gvcv.mongodb.net/BanksDB?retryWrites=true&w=majority"
        self.serverApi = ServerApi('1')  
        self.mongoClient = None
        self.mongoDatabase = None

    def create_connection(self):
        try:
            self.mongoClient = MongoClient(self.connectionString, server_api=self.serverApi)
            self.mongoDatabase = self.mongoClient.get_database("BanksDB")
            print("Connection established")
        except PyMongoError as ex:
            print(f"Error connecting to MongoDB: {ex}")

    def getMongoDatabase(self):
        return self.mongoDatabase

    def getMongoClient(self):
        return self.mongoClient

class MethodsBanks:
    def __init__(self):
        self.conn = Conection()
        self.conn.create_connection()
        self.database = self.conn.getMongoDatabase()
        self.collection = self.database.get_collection("data")

    def close_connection(self):
        if self.conn.getMongoClient():
            self.conn.getMongoClient().close()

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

    def search_by_id(self, id_data):
        bank = None
        try:
            print(f"Searching for bank with ID: {id_data}")
            query = {"id": id_data}
            result = self.collection.find_one(query)

            if result:
                bank = Banks()
                identity_card = result.get("identity_Card")
                bank.name = result.get("name")
                bank.last_name = result.get("last_name")
                bank.amount = result.get("amount")

        except PyMongoError as e:
            print(f"Error searching data: {e}")
        finally:
            self.close_connection()

        return bank
