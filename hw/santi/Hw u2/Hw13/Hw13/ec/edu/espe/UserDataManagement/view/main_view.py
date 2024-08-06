import tkinter as tk
from tkinter import ttk
from model.database import Database
from controller.calculations import Calculator

class App:
    def __init__(self, root):
        self.root = root
        self.root.title("User Data Management")
        
        self.calculator = Calculator()
        
        # Label and Entry for the name
        self.name_label = tk.Label(root, text="Name:")
        self.name_label.grid(row=0, column=0)
        self.name_entry = tk.Entry(root)
        self.name_entry.grid(row=0, column=1)
        
        # Combobox to select gender
        self.gender_label = tk.Label(root, text="Gender:")
        self.gender_label.grid(row=1, column=0)
        self.gender_combobox = ttk.Combobox(root, values=["Male", "Female", "Other"])
        self.gender_combobox.grid(row=1, column=1)
        
        # Radio buttons to select the marital status
        self.marital_status_label = tk.Label(root, text="Marital Status:")
        self.marital_status_label.grid(row=2, column=0)
        self.marital_status_var = tk.StringVar(value="Single")
        self.single_radio = tk.Radiobutton(root, text="Single", variable=self.marital_status_var, value="Single")
        self.single_radio.grid(row=2, column=1, sticky=tk.W)
        self.married_radio = tk.Radiobutton(root, text="Married", variable=self.marital_status_var, value="Married")
        self.married_radio.grid(row=2, column=2, sticky=tk.W)
        
        # Checkboxes to select interests
        self.interests_label = tk.Label(root, text="Interests:")
        self.interests_label.grid(row=3, column=0)
        self.interest_music_var = tk.BooleanVar()
        self.interest_music_check = tk.Checkbutton(root, text="Music", variable=self.interest_music_var)
        self.interest_music_check.grid(row=3, column=1, sticky=tk.W)
        self.interest_sports_var = tk.BooleanVar()
        self.interest_sports_check = tk.Checkbutton(root, text="Sports", variable=self.interest_sports_var)
        self.interest_sports_check.grid(row=3, column=2, sticky=tk.W)
        
        # Entry for annual salary
        self.annual_salary_label = tk.Label(root, text="Annual Salary:")
        self.annual_salary_label.grid(row=4, column=0)
        self.annual_salary_entry = tk.Entry(root)
        self.annual_salary_entry.grid(row=4, column=1)
        
        # Label for the calculated monthly salary
        self.monthly_salary_label = tk.Label(root, text="Monthly Salary:")
        self.monthly_salary_label.grid(row=5, column=0)
        self.monthly_salary_var = tk.StringVar()
        self.monthly_salary_value_label = tk.Label(root, textvariable=self.monthly_salary_var)
        self.monthly_salary_value_label.grid(row=5, column=1)
        
        # Save button
        self.save_button = tk.Button(root, text="Save", command=self.save_data)
        self.save_button.grid(row=6, column=1)
    
    def save_data(self):
        name = self.name_entry.get()
        gender = self.gender_combobox.get()
        marital_status = self.marital_status_var.get()
        interests = []
        if self.interest_music_var.get():
            interests.append("Music")
        if self.interest_sports_var.get():
            interests.append("Sports")
        annual_salary = float(self.annual_salary_entry.get())
        monthly_salary = self.calculator.calculate_monthly_salary(annual_salary)
        
        # Show calculated monthly salary
        self.monthly_salary_var.set(f"{monthly_salary:.2f}")
        
        # Save in MongoDB
        db = Database('mongodb+srv://sjeancarlo:sjeancarlo@cluster0.3ixvnnj.mongodb.net', 'Example')
        db.insert_user_input(name, gender, marital_status, interests, annual_salary, monthly_salary)
if __name__ == "__main__":
    root = tk.Tk()
    app = App(root)
    root.mainloop()

