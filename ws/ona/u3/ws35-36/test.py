from pymongo import MongoClient
from pymongo.server_api import ServerApi

def test_connection():
    connection_string = "mongodb+srv://leona4:leona4>@ley.6c6gvcv.mongodb.net/?retryWrites=true&w=majority&appName=ley"
    server_api = ServerApi('1')
    
    try:
        client = MongoClient(connection_string, server_api=server_api)
        db = client.get_database("BanksDB")
        print("Connected to MongoDB")
        # Check if database exists
        print("Database names:", client.list_database_names())
    except Exception as ex:
        print(f"Failed to connect: {ex}")

if __name__ == "__main__":
    test_connection()
