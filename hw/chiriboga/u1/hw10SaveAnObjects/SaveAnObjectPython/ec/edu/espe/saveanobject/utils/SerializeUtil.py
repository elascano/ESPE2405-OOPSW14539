import pickle
import os
from  model import Computer

class AppendableObjectOutputStream:
    def __init__(self, file):
        self.file = file
        if os.path.getsize(file.name) == 0:
            self.out = pickle.Pickler(file)
        else:
            self.out = pickle.Pickler(file, protocol=pickle.HIGHEST_PROTOCOL)

    def write_object(self, obj):
        self.out.dump(obj)

def create(scanner):
    file_name = input("Enter file name to save the object: ")

    id = int(input("Enter computer ID: "))
    model = input("Enter computer model: ")
    brand = input("Enter computer brand: ")
    storage = int(input("Enter computer storage (GB): "))
    ram = int(input("Enter computer RAM (GB): "))

    computer = Computer(id, model, brand, storage, ram)

    with open(file_name, 'ab') as file_out:
        out = AppendableObjectOutputStream(file_out)
        out.write_object(computer)
        print(f"Object serialized and saved in {file_name}")

def read(scanner):
    file_name = input("Enter file name to read the objects: ")

    computers = []

    if not os.path.exists(file_name):
        print("File not found")
        return

    with open(file_name, 'rb') as file_in:
        while True:
            try:
                computer = pickle.load(file_in)
                computers.append(computer)
            except EOFError:
                break
            except (pickle.UnpicklingError, AttributeError, EOFError, ImportError, IndexError) as e:
                print(f"Error reading object: {e}")
                break

    for computer in computers:
        print(f"Deserialized object: {computer}")
