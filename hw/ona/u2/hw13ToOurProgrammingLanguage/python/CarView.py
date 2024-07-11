print("CarView module loaded")

import sys
sys.path.append('C:\\Segundo-Tercero\\02_Parcial\\python')

from db_connection import Connection  # Ensure this matches the actual file name
from datetime import datetime


class CarView:
    def __init__(self):
        self.conexion = Connection()
        self.mongo_client, self.db = self.conexion.crear_conexion()

    def save_car_details(self):
        if not self.mongo_client:
            print("Failed to connect to MongoDB.")
            return

        # Input car details
        id = int(input("Enter car ID: "))
        model = input("Enter car model: ")
        color = input("Enter car color: ")
        sale_date_str = input("Enter sale date (MM/DD/YYYY): ")

        try:
            sale_date = datetime.strptime(sale_date_str, "%m/%d/%Y")
        except ValueError:
            print("Invalid date format. Please use MM/DD/YYYY.")
            return

        # Create car document
        car_doc = {
            "id": id,
            "model": model,
            "color": color,
            "saleDate": sale_date
        }

        # Insert car document into MongoDB
        try:
            result = self.db.cars.insert_one(car_doc)
            print("Car details saved successfully to MongoDB.")
        except Exception as e:
            print(f"Error saving car details to MongoDB: {str(e)}")

# Example usage
if __name__ == "__main__":
    view = CarView()
    view.save_car_details()
