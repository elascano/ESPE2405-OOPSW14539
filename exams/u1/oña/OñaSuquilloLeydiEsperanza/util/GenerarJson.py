import json
class GenerarJson:
def save_to_json(filename, data):
        try:
            with open(filename, 'w') as f:
                json.dump(data, f, indent=4)
            print(f"Data successfully saved to {filename}")
        except IOError as e:
            print(f"Error saving data to {filename}: {e}")

    @staticmethod
    def load_from_json(filename):
        try:
            with open(filename, 'r') as f:
                data = json.load(f)
            print(f"Data successfully loaded from {filename}")
            return data
        except IOError as e:
            print(f"Error loading data from {filename}: {e}")
            return None
        except json.JSONDecodeError as e:
            print(f"Error decoding JSON from {filename}: {e}")
            return None

