import tkinter as tk
from tkinter import messagebox, ttk

class BuildingView:
    @staticmethod
    def display_building_details(building):
        messagebox.showinfo("Building Details", 
            f"Name: {building.name}\n"
            f"Architect: {building.architect}\n"
            f"Construction Year: {building.construction_year}\n"
            f"Value: ${building.value}\n"
            f"Age: {building.age} years")

    @staticmethod
    def display_all_buildings(buildings):
        root = tk.Tk()
        root.title("List of Buildings")

        tree = ttk.Treeview(root, columns=("ID", "Name", "Architect", "Year", "Value", "Age"), show="headings")
        tree.heading("ID", text="ID")
        tree.heading("Name", text="Name")
        tree.heading("Architect", text="Architect")
        tree.heading("Year", text="Construction Year")
        tree.heading("Value", text="Value")
        tree.heading("Age", text="Age")

        for building in buildings:
            tree.insert("", "end", values=(building.id, building.name, building.architect, 
                                           building.construction_year, building.value, building.age))

        tree.pack(expand=True, fill="both")
        root.mainloop()