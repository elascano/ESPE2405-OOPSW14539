# File: utils/FileManager.py

import json
from datetime import datetime
from farm_simulator.model import Chicken, ChickenCoop, ChickenFarmer

FILE_PATH = "ChickenFarmSimulator.json"

def create_chicken(scanner, date_format):
    chicken = get_chicken_details(scanner, date_format)

    print("Do you want to add this chicken to an existing coop? (yes/no): ")
    add_to_coop = scanner.nextLine().strip().lower()

    if add_to_coop == "yes":
        farmers = read_all_farmers()
        print("Available Farmers:")
        for farmer in farmers:
            print(farmer)
        print("Enter Chicken Farmer ID to add the chicken to: ")
        farmer_id = int(scanner.nextLine())
        farmer = find_farmer(farmer_id)

        if farmer:
            print("Available Coops:")
            for coop in farmer.coops:
                print(coop)
            print("Enter Chicken Coop ID to add the chicken to: ")
            coop_id = int(scanner.nextLine())
            for coop in farmer.coops:
                if coop.id == coop_id:
                    coop.add_chicken(chicken)
                    update_farmer(farmer)
                    print("Chicken added to existing coop successfully!")
                    return
            print("Chicken Coop not found.")
        else:
            print("Chicken Farmer not found.")
    else:
        print("Enter Chicken Coop ID: ")
        coop_id = int(scanner.nextLine())
        chickens = [chicken]
        chicken_coop = ChickenCoop(coop_id, chickens)

        print("Enter Chicken Farmer ID: ")
        farmer_id = int(scanner.nextLine())

        print("Enter Chicken Farmer Name: ")
        farmer_name = scanner.nextLine()

        coops = [chicken_coop]
        chicken_farmer = ChickenFarmer(farmer_id, farmer_name, coops)

        create_farmer(chicken_farmer)
        print("Chicken created successfully!")
        print(chicken_farmer)

def read_chickens():
    print("All Chickens: ")
    for farmer in read_all_farmers():
        print(farmer)

def update_chicken(scanner, date_format):
    print("Enter Chicken Farmer ID to update: ")
    farmer_id = int(scanner.nextLine())
    farmer = find_farmer(farmer_id)
    if farmer:
        print("Enter Chicken ID to update: ")
        chicken_id = int(scanner.nextLine())
        updated_chicken = get_chicken_details(scanner, date_format)
        updated_chicken.id = chicken_id
        for coop in farmer.coops:
            for i in range(len(coop.chickens)):
                if coop.chickens[i].id == chicken_id:
                    coop.chickens[i] = updated_chicken
                    update_farmer(farmer)
                    print("Chicken updated successfully!")
                    return
        print("Chicken not found in the specified farmer's coops.")
    else:
        print("Chicken Farmer not found.")

def delete_chicken(scanner):
    print("Enter Chicken Farmer ID to delete chicken from: ")
    farmer_id = int(scanner.nextLine())
    farmer = find_farmer(farmer_id)
    if farmer:
        print("Enter Chicken ID to delete: ")
        chicken_id = int(scanner.nextLine())
        for coop in farmer.coops:
            coop.chickens = [chicken for chicken in coop.chickens if chicken.id != chicken_id]
            update_farmer(farmer)
            print("Chicken deleted successfully!")
            return
        print("Chicken not found in the specified farmer's coops.")
    else:
        print("Chicken Farmer not found.")

def find_chicken(scanner):
    print("Enter Chicken Farmer ID to find chicken in: ")
    farmer_id = int(scanner.nextLine())
    farmer = find_farmer(farmer_id)
    if farmer:
        print("Enter Chicken ID to find: ")
        chicken_id = int(scanner.nextLine())
        for coop in farmer.coops:
            for chicken in coop.chickens:
                if chicken.id == chicken_id:
                    print(f"Found Chicken: {chicken}")
                    return
        print("Chicken not found in the specified farmer's coops.")
    else:
        print("Chicken Farmer not found.")

def get_chicken_details(scanner, date_format):
    print("Enter chicken data:")
    print("ID: ")
    id = int(scanner.nextLine())

    print("Name: ")
    name = scanner.nextLine()

    print("Color: ")
    color = scanner.nextLine()

    print("Molting (true/false): ")
    molting = scanner.nextLine().strip().lower() == "true"

    born_on_date = None
    while born_on_date is None:
        print("Born on Date (yyyy-MM-dd): ")
        born_on_date_str = scanner.nextLine()

        try:
            born_on_date = datetime.strptime(born_on_date_str, "%Y-%m-%d").date()
        except ValueError:
            print("Invalid date format. Please use yyyy-MM-dd")

    return Chicken(id, name, color, molting, born_on_date)

def create_farmer(farmer):
    farmers = read_all_farmers()
    if not farmers:
        farmers = []
    farmers.append(farmer)
    save_all_farmers(farmers)

def read_all_farmers():
    try:
        with open(FILE_PATH, 'r') as file:
            farmers_data = json.load(file)
            farmers = [ChickenFarmer(f['id'], f['name'], [ChickenCoop(c['id'], [Chicken(ch['id'], ch['name'], ch['color'], ch['molting'], datetime.strptime(ch['born_on_date'], "%Y-%m-%d").date()) for ch in c['chickens']]) for c in f['coops']]) for f in farmers_data]
            return farmers
    except IOError:
        return []

def find_farmer(id):
    farmers = read_all_farmers()
    for farmer in farmers:
        if farmer.id == id:
            return farmer
    return None

def update_farmer(updated_farmer):
    farmers = read_all_farmers()
    for i in range(len(farmers)):
        if farmers[i].id == updated_farmer.id:
            farmers[i] = updated_farmer
            break
    save_all_farmers(farmers)

def delete_farmer(id):
    farmers = read_all_farmers()
    farmers = [farmer for farmer in farmers if farmer.id != id]
    save_all_farmers(farmers)

def save_all_farmers(farmers):
    with open(FILE_PATH, 'w') as file:
        farmers_data = [{'id': farmer.id, 'name': farmer.name, 'coops': [{'id': coop.id, 'chickens': [{'id': chicken.id, 'name': chicken.name, 'color': chicken.color, 'molting': chicken.molting, 'born_on_date': chicken.born_on_date.strftime ("%Y-%m-%d")} for chicken in coop.chickens]} for coop in farmer.coops]} for farmer in farmers] 
        json.dump(farmers_data, file, indent=4)
