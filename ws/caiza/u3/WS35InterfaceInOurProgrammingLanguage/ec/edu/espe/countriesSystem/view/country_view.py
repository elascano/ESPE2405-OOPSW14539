import tkinter as tk
from tkinter import messagebox
from ec.edu.espe.countriesSystem.view.list_frame import ListFrame
from ec.edu.espe.countriesSystem.view.delete_frame import DeleteFrame
from ec.edu.espe.countriesSystem.view.search_frame import SearchFrame

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
        button_frame.pack(pady=10, side=tk.RIGHT, fill=tk.Y)

        tk.Button(button_frame, text="Calculate Density", command=self.calculate_density).pack(pady=5, fill=tk.X)
        tk.Button(button_frame, text="Add Country", command=self.confirm_add_country).pack(pady=5, fill=tk.X)
        tk.Button(button_frame, text="Show Countries", command=self.show_countries).pack(pady=5, fill=tk.X)
        tk.Button(button_frame, text="Delete Country", command=self.show_delete_frame).pack(pady=5, fill=tk.X)
        tk.Button(button_frame, text="Search Country", command=self.show_search_frame).pack(pady=5, fill=tk.X)
        tk.Button(button_frame, text="Refresh List", command=self.refresh_list).pack(pady=5, fill=tk.X)

        # Message Panel
        self.message_panel = tk.Label(root, text="", fg="green")
        self.message_panel.pack(pady=10)

        # Density Result Panel
        self.density_panel = tk.Label(root, text="", fg="blue")
        self.density_panel.pack(pady=10)

        # Initialize frames
        self.list_frame = ListFrame(root, self.hide_list_frame)
        self.delete_frame = DeleteFrame(root, self.hide_delete_frame, self.confirm_delete_country)
        self.search_frame = SearchFrame(root, self.hide_search_frame, self.search_country)

    def calculate_density(self):
        try:
            area = float(self.area_entry.get())
            population = float(self.population_entry.get())
            density = population / area if area > 0 else 0
            self.density_panel.config(text=f"Density: {density:.2f} people/km²")
        except ValueError:
            self.show_message("Invalid input")

    def confirm_add_country(self):
        country_data = {
            'pais': self.country_entry.get(),
            'capital': self.capital_entry.get(),
            'area': self.validate_area(self.area_entry.get()),
            'poblacion': self.validate_population(self.population_entry.get())
        }
        if all(value is not None for value in country_data.values()):
            confirm = messagebox.askyesno("Confirm", f"Do you want to add this country?\n\n"
                                                     f"Country: {country_data['pais']}\n"
                                                     f"Capital: {country_data['capital']}\n"
                                                     f"Area: {country_data['area']} km²\n"
                                                     f"Population: {country_data['poblacion']} million\n")
            if confirm:
                self.callback_add_country(country_data)

    def validate_area(self, area):
        if not area:
            messagebox.showerror("Input Error", "Area cannot be empty.")
            return None
        try:
            area_value = float(area)
            if area_value <= 0:
                messagebox.showerror("Invalid Input", "Area must be a positive number.")
                return None
            return area_value
        except ValueError:
            messagebox.showerror("Invalid Input", "Area must be a number.")
            return None

    def validate_population(self, population):
        if not population:
            messagebox.showerror("Input Error", "Population cannot be empty.")
            return None
        try:
            population_value = float(population)
            if population_value < 0:
                messagebox.showerror("Invalid Input", "Population must be a non-negative number.")
                return None
            return population_value
        except ValueError:
            messagebox.showerror("Invalid Input", "Population must be a number.")
            return None

    def add_country(self):
        country_data = {
            'pais': self.country_entry.get(),
            'capital': self.capital_entry.get(),
            'area': self.validate_area(self.area_entry.get()),
            'poblacion': self.validate_population(self.population_entry.get())
        }
        if all(value is not None for value in country_data.values()):
            self.callback_add_country(country_data)

    def show_countries(self):
        self.list_frame.show()
        self.callback_show_countries()

    def show_delete_frame(self):
        self.input_frame.pack_forget()
        self.delete_frame.show()

    def confirm_delete_country(self, country_name):
        if country_name:
            confirm = messagebox.askyesno("Confirm", f"Do you want to delete the country '{country_name}'?")
            if confirm:
                self.callback_delete_country(country_name)
                self.delete_frame.show_message(f"Country '{country_name}' deleted successfully!")
        else:
            messagebox.showerror("Input Error", "Please enter the name of the country to delete.")

    def show_search_frame(self):
        self.input_frame.pack_forget()
        self.search_frame.show()

    def search_country(self, country_name):
        if country_name:
            country = self.callback_search_country(country_name)
            if country:
                area = country['area']
                population = country['poblacion']
                density = population / area if area > 0 else 0
                self.search_frame.show_result(f"Country: {country['pais']}\n"
                                              f"Capital: {country['capital']}\n"
                                              f"Area: {area} km²\n"
                                              f"Population: {population} million\n"
                                              f"Density: {density:.2f} people/km²")
            else:
                self.search_frame.show_result("Country not found.")
        else:
            messagebox.showerror("Input Error", "Please enter the name of the country to search.")

    def refresh_list(self):
        self.callback_refresh_list()

    def update_listbox(self, countries):
        self.list_frame.update_list(countries)

    def show_message(self, message):
        self.message_panel.config(text=message)

    def hide_list_frame(self):
        self.list_frame.hide()
        self.input_frame.pack(pady=10)

    def hide_delete_frame(self):
        self.delete_frame.hide()
        self.input_frame.pack(pady=10)

    def hide_search_frame(self):
        self.search_frame.hide()
        self.input_frame.pack(pady=10)

    def set_add_country_callback(self, callback):
        self.callback_add_country = callback

    def set_show_countries_callback(self, callback):
        self.callback_show_countries = callback

    def set_delete_country_callback(self, callback):
        self.callback_delete_country = callback

    def set_search_country_callback(self, callback):
        self.callback_search_country = callback

    def set_refresh_list_callback(self, callback):
        self.callback_refresh_list = callback