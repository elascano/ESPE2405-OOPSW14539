import sys
import os

sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

print("Cargando el módulo user_interface")

from model.motorcycle import Motorcycle
print("Motorcycle importado con éxito desde model.motorcycle")
from utils.file_manager import FileManager
print("FileManager importado con éxito desde utils.file_manager")

def get_motorcycle_data():
    print("Obteniendo datos de la motocicleta")
    id = int(input("Ingrese el ID de la motocicleta: "))
    brand = input("Ingrese la marca de la motocicleta: ")
    model = input("Ingrese el modelo de la motocicleta: ")
    engine_capacity = float(input("Ingrese la capacidad del motor (en cc): "))
    return id, brand, model, engine_capacity

def get_location():
    print("Seleccionando una ubicación")
    print("1. Quito")
    print("2. Sangolquí")
    print("3. Cumbayá")
    choice = input("Ingrese su opción: ")
    if choice == "1":
        return "Quito"
    elif choice == "2":
        return "Sangolquí"
    elif choice == "3":
        return "Cumbayá"
    else:
        print("Opción no válida. Por favor, intente de nuevo.")
        return get_location()

def main_menu():
    while True:
        print("Seleccione una opción:")
        print("1. Crear una nueva motocicleta")
        print("2. Leer todas las motocicletas")
        print("3. Actualizar una motocicleta existente")
        print("4. Eliminar una motocicleta")
        print("5. Salir")

        choice = input("Ingrese su opción: ")

        if choice == "1":
            location = get_location()
            id, brand, model, engine_capacity = get_motorcycle_data()
            motorcycle = Motorcycle(id, brand, model, engine_capacity)
            FileManager.save_motorcycle(location, motorcycle)
        elif choice == "2":
            location = get_location()
            FileManager.read_motorcycles(location)
        elif choice == "3":
            location = get_location()
            id = int(input("Ingrese el ID de la motocicleta a actualizar: "))
            brand = input("Ingrese la nueva marca de la motocicleta: ")
            model = input("Ingrese el nuevo modelo de la motocicleta: ")
            engine_capacity = float(input("Ingrese la nueva capacidad del motor (en cc): "))
            FileManager.update_motorcycle(location, id, brand, model, engine_capacity)
        elif choice == "4":
            location = get_location()
            id = int(input("Ingrese el ID de la motocicleta a eliminar: "))
            FileManager.delete_motorcycle(location, id)
        elif choice == "5":
            break
        else:
            print("Opción no válida. Por favor, intente de nuevo.")
