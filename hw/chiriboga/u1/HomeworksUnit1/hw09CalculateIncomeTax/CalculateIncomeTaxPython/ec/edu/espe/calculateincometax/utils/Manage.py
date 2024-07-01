import csv
from model.Employee import Employee

CSV_FILE = 'employeesPython.csv'
employees = []

def create_employee():
    print("Kerlly's Salary Consulting System")
    print("Enter the Data Employee")

    id = int(input("ID: "))
    name = input("Name: ")
    birth_date = input("Birth Date: ")
    gender = input("Gender: ")
    salary = float(input("Amount Salary: "))

    employee = Employee(id, name, birth_date, gender, salary)
    employees.append(employee)
    save_employee_to_csv(employee)
    print("Successfully Created Employee!")

def read_data_employee():
    read_employees_from_csv()

    if not employees:
        print("No employees found.")
    else:
        for employee in employees:
            print(employee)

def delete_employee():
    id_to_delete = int(input("Enter ID of the employee to delete: "))

    global employees
    employees = [employee for employee in employees if employee.id != id_to_delete]

    print(f"Employee with ID {id_to_delete} deleted.")
    save_all_employees_to_csv()

def save_employee_to_csv(employee):
    with open(CSV_FILE, mode='a', newline='') as file:
        writer = csv.writer(file)
        writer.writerow(employee_to_csv(employee))

def save_all_employees_to_csv():
    with open(CSV_FILE, mode='w', newline='') as file:
        writer = csv.writer(file)
        for employee in employees:
            writer.writerow(employee_to_csv(employee))

def read_employees_from_csv():
    employees.clear()
    try:
        with open(CSV_FILE, mode='r', newline='') as file:
            reader = csv.reader(file)
            for row in reader:
                employee = csv_to_employee(row)
                employees.append(employee)
    except FileNotFoundError:
        pass

def employee_to_csv(employee):
    return [
        employee.id,
        employee.name,
        employee.birth_date,
        employee.gender,
        employee.salary,
        employee.incometax,
        employee.sure,
        employee.net_salary
    ]

def csv_to_employee(csv_row):
    id = int(csv_row[0])
    name = csv_row[1]
    birth_date = csv_row[2]
    gender = csv_row[3]
    salary = float(csv_row[4])
    return Employee(id, name, birth_date, gender, salary)
