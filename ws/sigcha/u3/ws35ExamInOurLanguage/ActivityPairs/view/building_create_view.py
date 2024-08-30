import tkinter as tk
from tkinter import messagebox

class BuildingCreateView:
    def __init__(self, controller):
        self.controller = controller
        self.window = tk.Tk()
        self.window.title("Add Building")
        self.window.geometry("300x250")

        tk.Label(self.window, text="Name:").grid(row=0, column=0, pady=5, padx=5)
        self.txt_name = tk.Entry(self.window)
        self.txt_name.grid(row=0, column=1, pady=5, padx=5)

        tk.Label(self.window, text="Architect:").grid(row=1, column=0, pady=5, padx=5)
        self.txt_architect = tk.Entry(self.window)
        self.txt_architect.grid(row=1, column=1, pady=5, padx=5)

        tk.Label(self.window, text="Construction Year:").grid(row=2, column=0, pady=5, padx=5)
        self.txt_construction_year = tk.Entry(self.window)
        self.txt_construction_year.grid(row=2, column=1, pady=5, padx=5)

        tk.Label(self.window, text="Value:").grid(row=3, column=0, pady=5, padx=5)
        self.txt_value = tk.Entry(self.window)
        self.txt_value.grid(row=3, column=1, pady=5, padx=5)

        self.btn_add_building = tk.Button(self.window, text="Add Building", command=self.add_building)
        self.btn_add_building.grid(row=4, column=0, columnspan=2, pady=10)

        self.btn_back = tk.Button(self.window, text="Back", command=self.go_back)
        self.btn_back.grid(row=5, column=0, columnspan=2, pady=10)

        self.window.mainloop()

    def add_building(self):
        try:
            name = self.txt_name.get()
            architect = self.txt_architect.get()
            construction_year = int(self.txt_construction_year.get())
            value = float(self.txt_value.get())
            self.controller.create_building(name, architect, construction_year, value)
            messagebox.showinfo("Success", "Building added successfully!")
            self.clear_fields()
        except ValueError:
            messagebox.showerror("Error", "Please enter valid values for year and value.")

    def clear_fields(self):
        self.txt_name.delete(0, tk.END)
        self.txt_architect.delete(0, tk.END)
        self.txt_construction_year.delete(0, tk.END)
        self.txt_value.delete(0, tk.END)

    def go_back(self):
        from view.main_menu import MainMenu
        self.window.destroy()
        MainMenu(self.controller).run()