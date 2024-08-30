import pymongo
from pymongo import MongoClient

def connect_to_mongo(uri):
    """Conectar a MongoDB Atlas"""
    client = MongoClient(uri)
    return client

def upload_data(client, database_name, collection_name, data):
    """Subir datos a una colección específica en MongoDB"""
    db = client[database_name]
    collection = db[collection_name]
    result = collection.insert_many(data)
    return result.inserted_ids

if __name__ == "__main__":
    # Reemplaza esto con tu cadena de conexión de MongoDB Atlas
    mongo_uri = "mongodb+srv://pilaguano:pilaguano@cluster0.9goxw5i.mongodb.net/"

    # Conectarse a MongoDB Atlas
    client = connect_to_mongo(mongo_uri)

    # Nombre de la base de datos y colección
    database_name = "testDatabase"
    collection_name = "testCollection"

    # Datos a subir
    data = [
        {"name": "Alice", "age": 28, "city": "New York"},
        {"name": "Bob", "age": 34, "city": "San Francisco"},
        {"name": "Charlie", "age": 23, "city": "Boston"}
    ]

    # Subir datos
    inserted_ids = upload_data(client, database_name, collection_name, data)
    print(f"Documentos insertados con IDs: {inserted_ids}")
