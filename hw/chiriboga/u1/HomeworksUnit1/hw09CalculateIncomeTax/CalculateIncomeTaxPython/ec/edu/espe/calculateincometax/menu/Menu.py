from utils.Manage import create_employee
from utils.Manage import read_data_employee
from utils.Manage import delete_employee

class showMenu:
    while True:
        print("Menu")
        print("1. Create Employee")
        print("2. Read Employees")
        print("3. Delete Employee")
        print("4. Exit")

        try: 
            operation = (int(input("Enter the operation: ")))

            if operation == 1:
                create_employee()     
            elif operation == 2:
                read_data_employee()
            elif operation == 3:
                delete_employee()
            elif operation == 4:
                print("Exiting...")
                break
            else: 
                print("Invalid Operation. Please enter a number between 1 and 4. ")

        except ValueError:
            print("Invalid input. Please enter a valid number")

showMenu()
            
