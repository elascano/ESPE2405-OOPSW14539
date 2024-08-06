import tkinter as tk
from tkinter import ttk, messagebox

class CountryView:
    def __init__(self, root):
        self.root = root
        self.root.title("Country Manager")

        # Frame for input fields
        self.input_frame = tk.Frame(root)
        self.input_frame.pack(pady=10)

        # Labels and Entry
        tk.Label(self.input_frame, text="Country").grid(row=0, column=0, padx=5, pady=5)
        self.country_entry = tk.Entry(self.input_frame)
        self.country_entry.grid(row=0, column=1, padx=5, pady=5)

        tk.Label(self.input_frame, text="Capital").grid(row=1, column=0, padx=5, pady=5)
        self.capital_entry = tk.Entry(self.input_frame)
        self.capital_entry.grid(row=1, column=1, padx=5, pady=5)

        tk.Label(self.input_frame, text="Area (km²)").grid(row=2, column=0, padx=5, pady=5)
        self.area_entry = tk.Entry(self.input_frame)
        self.area_entry.grid(row=2, column=1, padx=5, pady=5)

        tk.Label(self.input_frame, text="Population (millions)").grid(row=3, column=0, padx=5, pady=5)
        self.population_entry = tk.Entry(self.input_frame)
        self.population_entry.grid(row=3, column=1, padx=5, pady=5)

        # Buttons
        button_frame = tk.Frame(root)
        button_frame.pack(pady=10)

        tk.Button(button_frame, text="Calculate Density", command=self.calculate_density).grid(row=0, column=0, padx=5, pady=5)
        tk.Button(button_frame, text="Add Country", command=self.add_country).grid(row=0, column=1, padx=5, pady=5)
        tk.Button(button_frame, text="Show Countries", command=self.show_countries).grid(row=0, column=2, padx=5, pady=5)
        tk.Button(button_frame, text="Delete Country", command=self.delete_country).grid(row=0, column=3, padx=5, pady=5)
        tk.Button(button_frame, text="Refresh List", command=self.refresh_list).grid(row=0, column=4, padx=5, pady=5)

        # Panel for message
        self.message_panel = tk.Label(root, text="", fg="green")
        self.message_panel.pack(pady=10)

        # Create the list frame
        self.list_frame = tk.Toplevel(root)
        self.list_frame.title("Country List")
        self.list_frame.geometry("800x600")
        self.list_frame.protocol("WM_DELETE_WINDOW", self.hide_list_frame)
        self.list_frame.withdraw()  # Hide the frame initially

        # Treeview for displaying countries
        self.tree = ttk.Treeview(self.list_frame, columns=("Country", "Capital", "Area", "Population", "Density"), show='headings')
        self.tree.heading("Country", text="Country")
        self.tree.heading("Capital", text="Capital")
        self.tree.heading("Area", text="Area (km²)")
        self.tree.heading("Population", text="Population (millions)")
        self.tree.heading("Density", text="Density (people/km²)")
        self.tree.pack(fill=tk.BOTH, expand=True, padx=10, pady=10)

        # Button to return to main frame
        return_button = tk.Button(self.list_frame, text="Back to Main", command=self.hide_list_frame)
        return_button.pack(pady=10)

        # Density Label
        self.density_label = tk.Label(root, text="Density: ")
        self.density_label.pack(pady=10)

    def calculate_density(self):
        try:
            area = float(self.area_entry.get())
            population = float(self.population_entry.get())
            density = population / area if area > 0 else 0
            self.update_density(density)
        except ValueError:
            self.update_density("Invalid input")

    def add_country(self):
        country_data = {
            'pais': self.country_entry.get(),
            'capital': self.capital_entry.get(),
            'area': float(self.area_entry.get()),
            'poblacion': float(self.population_entry.get())
        }
        self.callback_add_country(country_data)

    def show_countries(self):
        self.list_frame.deiconify()  # Show the list frame
        self.callback_show_countries()

    def delete_country(self):
        country_name = self.country_entry.get()
        self.callback_delete_country(country_name)

    def refresh_list(self):
        self.callback_refresh_list()

    def set_text(self, text):
        # Removed the text area
        pass

    def update_listbox(self, countries):
        for row in self.tree.get_children():
            self.tree.delete(row)
        
        for country in countries:
            area = country['area']
            population = country['poblacion']
            density = population / area if area > 0 else 0
            self.tree.insert("", tk.END, values=(
                country['pais'],
                country['capital'],
                f"{area} km²",
                f"{population} million",
                f"{density:.2f}"
            ))

    def update_density(self, density):
        if isinstance(density, str):
            self.density_label.config(text=f"Density: {density}")
        else:
            self.density_label.config(text=f"Density: {density:.2f} people/km²")

    def show_message(self, message):
        self.message_panel.config(text=message)

    def hide_list_frame(self):
        self.list_frame.withdraw()  # Hide the list frame

    def set_add_country_callback(self, callback):
        self.callback_add_country = callback

    def set_show_countries_callback(self, callback):
        self.callback_show_countries = callback

    def set_delete_country_callback(self, callback):
        self.callback_delete_country = callback

    def set_refresh_list_callback(self, callback):
        self.callback_refresh_list = callback
