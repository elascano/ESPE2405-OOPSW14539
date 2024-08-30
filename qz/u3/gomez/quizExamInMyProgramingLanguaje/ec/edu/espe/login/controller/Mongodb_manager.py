from pymongo import MongoClient

class MongoDBManager:
    def __init__(self, uri, db_name, collection_name):
        self.client = MongoClient('mongodb+srv://MiguelAngel:miguel1234@cluster0.hovruoz.mongodb.net/')
        self.db = self.client['UserDataBase']
        self.collection = self.db['User']

    def agregar_pais(self, pais):
        self.collection.insert_one(pais)

    def listar_paises(self):
        return list(self.collection.find({}, {'_id': 0}))

    def agregar_usuario(self, usuario):
        self.collection.insert_one(usuario)

    def buscar_usuario(self, username):
        return self.collection.find_one({'username': username}, {'_id': 0})
