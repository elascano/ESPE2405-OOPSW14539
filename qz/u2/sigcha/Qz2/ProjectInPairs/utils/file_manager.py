import json
import os

class FileManager:
    @staticmethod
    def get_filepath(location):
        return f'{location.lower()}_motorcycles.json'

    @staticmethod
    def save_motorcycle(location, motorcycle):
        filepath = FileManager.get_filepath(location)
        data = FileManager.read_all(location)
        data.append(motorcycle.to_dict())
        with open(filepath, 'w') as file:
            json.dump(data, file, indent=4)

    @staticmethod
    def read_motorcycles(location):
        data = FileManager.read_all(location)
        print(json.dumps(data, indent=4))

    @staticmethod
    def update_motorcycle(location, id, brand, model, engine_capacity):
        filepath = FileManager.get_filepath(location)
        data = FileManager.read_all(location)
        for motorcycle in data:
            if motorcycle["id"] == id:
                motorcycle["brand"] = brand
                motorcycle["model"] = model
                motorcycle["engine_capacity"] = engine_capacity
                break
        else:
            print(f"Motorcycle with ID {id} not found.")
            return
        with open(filepath, 'w') as file:
            json.dump(data, file, indent=4)

    @staticmethod
    def delete_motorcycle(location, id):
        filepath = FileManager.get_filepath(location)
        data = FileManager.read_all(location)
        data = [motorcycle for motorcycle in data if motorcycle["id"] != id]
        with open(filepath, 'w') as file:
            json.dump(data, file, indent=4)

    @staticmethod
    def read_all(location):
        filepath = FileManager.get_filepath(location)
        if not os.path.exists(filepath):
            return []
        with open(filepath, 'r') as file:
            return json.load(file)
