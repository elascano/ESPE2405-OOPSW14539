import json
import os
from ec.edu.espe.login.controller.Mongodb_manager import MongoDBManager

class DataManager:
    def __init__(self):
        self.paises = []
        self.mongo_manager = MongoDBManager(
            uri='mongodb+srv://MiguelAngel:miguel1234@cluster0.hovruoz.mongodb.net/',
            db_name='Countries_Database',
            collection_name='Countries'
        )
        self.mongo_user_manager = MongoDBManager(
            uri='mongodb+srv://MiguelAngel:miguel1234@cluster0.hovruoz.mongodb.net/',
            db_name='Users_Database',
            collection_name='Users'
        )
        self.cargar_datos()

    def agregar_pais(self, pais):
        self.paises.append(pais)
        self.mongo_manager.agregar_pais(pais)
        self.guardar_datos()

    def listar_paises(self):
        paises = self.mongo_manager.listar_paises()
        return paises

    def guardar_datos(self):
        with open('paises.json', 'w') as file:
            json.dump(self.paises, file, indent=4)

    def cargar_datos(self):
        if os.path.exists('paises.json'):
            with open('paises.json', 'r') as file:
                self.paises = json.load(file)
        else:
            self.paises = []

    def registrar_usuario(self, username, password):
        user = self.mongo_user_manager.buscar_usuario(username)
        if user:
            return False  # Usuario ya existe
        self.mongo_user_manager.agregar_usuario({'username': username, 'password': password})
        return True

    def autenticar_usuario(self, username, password):
        user = self.mongo_user_manager.buscar_usuario(username)
        if user and user['password'] == password:
            return True
        return False
