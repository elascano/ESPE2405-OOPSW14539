import tkinter as tk
from tkinter import messagebox
from ec.edu.espe.SchoolRegister.controller.SchoolAgeCalculator import SchoolAgeCalculator
from ec.edu.espe.SchoolRegister.controller.database import Database
from ec.edu.espe.SchoolRegister.model.school import School

class SchoolApp:
    def __init__(self, root):
        self.db = Database()

        self.root = root
        self.root.title("Registro de Escuelas")

        self.frame = tk.Frame(self.root)
        self.frame.pack(pady=20)

        self.school_id_label = tk.Label(self.frame, text="ID")
        self.school_id_label.grid(row=0, column=0)
        self.school_id_entry = tk.Entry(self.frame)
        self.school_id_entry.grid(row=0, column=1)

        self.name_label = tk.Label(self.frame, text="Nombre")
        self.name_label.grid(row=1, column=0)
        self.name_entry = tk.Entry(self.frame)
        self.name_entry.grid(row=1, column=1)

        self.address_label = tk.Label(self.frame, text="Dirección")
        self.address_label.grid(row=2, column=0)
        self.address_entry = tk.Entry(self.frame)
        self.address_entry.grid(row=2, column=1)

        self.city_label = tk.Label(self.frame, text="Ciudad")
        self.city_label.grid(row=3, column=0)
        self.city_entry = tk.Entry(self.frame)
        self.city_entry.grid(row=3, column=1)

        self.phone_label = tk.Label(self.frame, text="Teléfono")
        self.phone_label.grid(row=4, column=0)
        self.phone_entry = tk.Entry(self.frame)
        self.phone_entry.grid(row=4, column=1)

        self.foundation_year_label = tk.Label(self.frame, text="Año de Fundación")
        self.foundation_year_label.grid(row=5, column=0)
        self.foundation_year_entry = tk.Entry(self.frame)
        self.foundation_year_entry.grid(row=5, column=1)

        self.submit_button = tk.Button(self.frame, text="Registrar", command=self.register_school)
        self.submit_button.grid(row=6, columnspan=2)

    def register_school(self):
        school_id = self.school_id_entry.get()
        name = self.name_entry.get()
        address = self.address_entry.get()
        city = self.city_entry.get()
        phone = self.phone_entry.get()
        foundation_year = self.foundation_year_entry.get()

        if school_id and name and address and city and phone and foundation_year:
            try:
                foundation_year = int(foundation_year)
                age = SchoolAgeCalculator.calculate_age(foundation_year)
                new_school = School(school_id, name, address, city, phone, foundation_year)
                self.db.insert_school(new_school)
                messagebox.showinfo("Registro Exitoso", f"Escuela registrada con éxito. Edad: {age} años.")
            except ValueError:
                messagebox.showwarning("Error", "El año de fundación debe ser un número válido.")
        else:
            messagebox.showwarning("Campos Vacíos", "Por favor, rellena todos los campos.")

if __name__ == "__main__":
    root = tk.Tk()
    app = SchoolApp(root)
    root.mainloop()