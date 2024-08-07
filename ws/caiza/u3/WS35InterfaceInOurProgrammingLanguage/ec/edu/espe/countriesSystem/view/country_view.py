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
        button_frame.pack(pady=10, side=tk.RIGHT, fill=tk.Y)

        tk.Button(button_frame, text="Calculate Density", command=self.calculate_density).pack(pady=5, fill=tk.X)
        tk.Button(button_frame, text="Add Country", command=self.confirm_add_country).pack(pady=5, fill=tk.X)
        tk.Button(button_frame, text="Show Countries", command=self.show_countries).pack(pady=5, fill=tk.X)
        tk.Button(button_frame, text="Delete Country", command=self.show_delete_frame).pack(pady=5, fill=tk.X)
        tk.Button(button_frame, text="Search Country", command=self.show_search_frame).pack(pady=5, fill=tk.X)
        tk.Button(button_frame, text="Refresh List", command=self.refresh_list).pack(pady=5, fill=tk.X)

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

        # Create the delete frame
        self.delete_frame = tk.Toplevel(root)
        self.delete_frame.title("Delete Country")
        self.delete_frame.geometry("300x150")
        self.delete_frame.protocol("WM_DELETE_WINDOW", self.hide_delete_frame)
        self.delete_frame.withdraw()  # Hide the frame initially

        # Content of the delete frame
        tk.Label(self.delete_frame, text="Country to delete:").pack(pady=10)
        self.delete_entry = tk.Entry(self.delete_frame)
        self.delete_entry.pack(pady=5)
        tk.Button(self.delete_frame, text="Delete", command=self.confirm_delete_country).pack(pady=5)
        self.delete_message_panel = tk.Label(self.delete_frame, text="", fg="green")
        self.delete_message_panel.pack(pady=10)

        # Button to return to main frame from delete frame
        delete_back_button = tk.Button(self.delete_frame, text="Back to Main", command=self.hide_delete_frame)
        delete_back_button.pack(pady=10)

        # Create the search frame
        self.search_frame = tk.Toplevel(root)
        self.search_frame.title("Search Country")
        self.search_frame.geometry("600x400")  # Larger frame for better visibility
        self.search_frame.protocol("WM_DELETE_WINDOW", self.hide_search_frame)
        self.search_frame.withdraw()  # Hide the frame initially

        # Content of the search frame
        search_panel = tk.Frame(self.search_frame)
        search_panel.pack(pady=10, padx=10, fill=tk.BOTH, expand=True)

        tk.Label(search_panel, text="Country to search:").pack(pady=10)
        self.search_entry = tk.Entry(search_panel)
        self.search_entry.pack(pady=5)
        tk.Button(search_panel, text="Search", command=self.search_country).pack(pady=5)

        self.search_result = tk.Label(search_panel, text="", fg="blue", justify=tk.LEFT)
        self.search_result.pack(pady=10)

        # Button to return to main frame from search frame
        search_back_button = tk.Button(search_panel, text="Back to Main", command=self.hide_search_frame)
        search_back_button.pack(pady=10)

    def calculate_density(self):
        try:
            area = float(self.area_entry.get())
            population = float(self.population_entry.get())
            density = population / area if area > 0 else 0
            self.update_density(density)
        except ValueError:
            self.update_density("Invalid input")

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
        self.list_frame.deiconify()  # Show the list frame
        self.callback_show_countries()

    def show_delete_frame(self):
        self.input_frame.pack_forget()  # Hide the main input frame
        self.delete_frame.deiconify()  # Show the delete frame

    def confirm_delete_country(self):
        country_name = self.delete_entry.get()
        if country_name:
            confirm = messagebox.askyesno("Confirm", f"Do you want to delete the country '{country_name}'?")
            if confirm:
                self.callback_delete_country(country_name)
                self.delete_message_panel.config(text=f"Country '{country_name}' deleted successfully!")
                self.delete_entry.delete(0, tk.END)
        else:
            messagebox.showerror("Input Error", "Please enter the name of the country to delete.")

    def show_search_frame(self):
        self.input_frame.pack_forget()  # Hide the main input frame
        self.search_frame.deiconify()  # Show the search frame

    def search_country(self):
        country_name = self.search_entry.get()
        if country_name:
            country = self.callback_search_country(country_name)
            if country:
                area = country['area']
                population = country['poblacion']
                density = population / area if area > 0 else 0
                self.search_result.config(text=f"Country: {country['pais']}\n"
                                               f"Capital: {country['capital']}\n"
                                               f"Area: {area} km²\n"
                                               f"Population: {population} million\n"
                                               f"Density: {density:.2f} people/km²")
            else:
                self.search_result.config(text="Country not found.")
        else:
            messagebox.showerror("Input Error", "Please enter the name of the country to search.")

    def refresh_list(self):
        self.callback_refresh_list()

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
        messagebox.showinfo("Info", message)

    def hide_list_frame(self):
        self.list_frame.withdraw()  # Hide the list frame
        self.input_frame.pack(pady=10)  # Show the main input frame again
        self.search_result.config(text="")  # Clear the search result

    def hide_delete_frame(self):
        self.delete_frame.withdraw()  # Hide the delete frame
        self.input_frame.pack(pady=10)  # Show the main input frame again
        self.delete_message_panel.config(text="")  # Clear the delete message

    def hide_search_frame(self):
        self.search_frame.withdraw()  # Hide the search frame
        self.input_frame.pack(pady=10)  # Show the main input frame again
        self.search_entry.delete(0, tk.END)  # Clear the search entry
        self.search_result.config(text="")  # Clear the search result

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