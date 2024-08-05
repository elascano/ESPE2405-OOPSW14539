import pickle
class Toy:
    def __init__(self, id, type, brand, material, battery_required):
        self.id = id
        self.type = type
        self.brand = brand
        self.material = material
        self.battery_required = battery_required

    def __str__(self):
        return f"Toy(id={self.id}, type={self.type}, brand={self.brand}, material={self.material}, battery_required={self.battery_required})"

# Función para serializar un objeto Toy a un archivo
def save_object_to_file(filename, obj):
    with open(filename, 'wb') as f:
        pickle.dump(obj, f)
    print(f"Objeto serializado y guardado en {filename}")

# Función para deserializar un objeto Toy desde un archivo
def load_object_from_file(filename):
    with open(filename, 'rb') as f:
        obj = pickle.load(f)
    print(f"Objeto deserializado: {obj}")
    return obj

def main():
    toy = Toy(1, "Lego Figure", "Lego", "Plastic", False)
    save_object_to_file("toy.pkl", toy)
    deserialized_toy = load_object_from_file("toy.pkl")
    print("Objeto deserializado:", deserialized_toy)
if __name__ == "__main__":
    main()
