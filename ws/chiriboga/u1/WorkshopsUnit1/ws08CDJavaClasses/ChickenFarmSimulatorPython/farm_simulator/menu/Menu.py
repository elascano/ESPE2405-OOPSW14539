# File: ec/edu/espe/farmsimulator/menu/Menu.py

from farm_simulator.utils.FileManager import create_chicken, read_chickens, update_chicken, delete_chicken, find_chicken
from datetime import datetime
import sys

def show_menu():
    print("Kerlly's Chicken Farm Simulator")
    date_format = "%Y-%m-%d"
    operation = 0

    while operation != 6:
        print("Menu:")
        print("1. Create Chicken")
        print("2. Read Chickens")
        print("3. Update Chicken")
        print("4. Delete Chicken")
        print("5. Find Chicken")
        print("6. Exit")
        operation = int(input("Enter operation: "))

        try:
            if operation == 1:
                create_chicken(input, datetime.strptime)
            elif operation == 2:
                read_chickens()
            elif operation == 3:
                update_chicken(input, datetime.strptime)
            elif operation == 4:
                delete_chicken(input)
            elif operation == 5:
                find_chicken(input)
            elif operation == 6:
                print("Exiting...")
            else:
                print("Invalid operation.")
        except IOError as e:
            print(f"An I/O error occurred: {e}")
        except Exception as e:
            print(f"An error occurred: {e}")

if __name__ == "__main__":
    show_menu()
