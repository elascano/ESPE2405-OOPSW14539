# chicken_farm_simulator.py

import os
import json
import csv
from datetime import datetime
from Utils import FileManager
from models import Chicken, ChickenCoop, ChickenFarmer

def main():
    print("Julio's Chicken Farm Simulator")

    scanner = input
    date_format = "%Y-%m-%d"

    print("Select an operation:")
    print("1. Create")
    print("2. Read")
    print("3. Update")
    print("4. Delete")
    operation_choice = int(scanner())

    print("Select the output format:")
    print("1. CSV")
    print("2. TXT")
    print("3. JSON")
    format_choice = int(scanner())

    folder_path = "output"
    file_extension = get_extension(format_choice)
    if not os.path.exists(folder_path):
        os.mkdir(folder_path)

    try:
        if operation_choice == 1:  # Create
            create_data(scanner, date_format, folder_path, file_extension, format_choice)
        elif operation_choice == 2:  # Read
            find_and_perform_operation(scanner, folder_path, file_extension, "read")
        elif operation_choice == 3:  # Update
            find_and_perform_operation(scanner, folder_path, file_extension, "update")
        elif operation_choice == 4:  # Delete
            find_and_perform_operation(scanner, folder_path, file_extension, "delete")
        else:
            print("Invalid operation choice.")
    except Exception as ex:
        print(f"An error occurred: {ex}")

def create_data(scanner, date_format, folder_path, file_extension, format_choice):
    print("Enter the number of farmers:")
    number_of_farmers = int(scanner())

    for i in range(number_of_farmers):
        print(f"Enter details for farmer {i + 1}:")

        farmer_id = int(input("Farmer ID: "))
        scanner()  # Consume newline

        farmer_name = input("Farmer Name: ")

        number_of_coops = int(input("Number of chicken coops: "))

        coops = []

        for j in range(number_of_coops):
            print(f"Enter details for chicken coop {j + 1}:")

            coop_id = int(input("ID: "))

            number_of_chickens = int(input("Number of chickens: "))

            chickens = []

            for k in range(number_of_chickens):
                print(f"Enter details for chicken {k + 1}:")

                chicken_id = int(input("ID: "))
                scanner()  # Consume newline

                chicken_name = input("Name: ")

                chicken_color = input("Color: ")

                born_on_date_string = input("Born on date (yyyy-MM-dd): ")
                chicken_born_on_date = datetime.strptime(born_on_date_string, date_format)

                chicken_molting = input("Is molting? (true/false): ").lower() == 'true'

                chickens.append(Chicken(chicken_id, chicken_name, chicken_color, chicken_molting, chicken_born_on_date))

            coops.append(ChickenCoop(coop_id, chickens))

        farmer = ChickenFarmer(farmer_id, farmer_name, coops)

        data = farmer.to_string(format_choice)
        FileManager.save(data, os.path.join(folder_path, "farmData"), file_extension)

def find_and_perform_operation(scanner, folder_path, file_extension, operation):
    scanner()  # Consume newline
    keyword = input("Enter the search keyword: ")

    found_data = FileManager.find(keyword, os.path.join(folder_path, "farmData"), file_extension)
    if not found_data:
        print("No records found.")
        return

    for data in found_data:
        print(data)

    if operation == "read":
        pass  # Just display the found data
    elif operation == "update":
        old_data = input("Enter the data to be updated: ")
        new_data = input("Enter the new data: ")
        FileManager.update(old_data, new_data, os.path.join(folder_path, "farmData"), file_extension)
    elif operation == "delete":
        data_to_delete = input("Enter the data to be deleted: ")
        FileManager.delete(data_to_delete, os.path.join(folder_path, "farmData"), file_extension)
        print("Data deleted successfully.")

def get_extension(format_choice):
    if format_choice == 1:
        return "csv"
    elif format_choice == 2:
        return "txt"
    elif format_choice == 3:
        return "json"
    else:
        raise ValueError("Unsupported format: " + str(format_choice))

if __name__ == "__main__":
    main()
