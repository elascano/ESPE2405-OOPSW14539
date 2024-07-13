import tkinter as tk
from tkinter import messagebox, simpledialog
from pymongo import MongoClient
from datetime import datetime

# Conectar a MongoDB (reemplaza con tu URI de conexión)
client = MongoClient("mongodb+srv://JoffreGQ:joffre2004@cluster0.yztxrwi.mongodb.net/")
db = client.airline_reservation_system
customers_collection = db.customers
flights_collection = db.flights
tickets_collection = db.tickets

class AirlineReservationGUI:
    def __init__(self, root):
        self.root = root
        self.root.title("Airline Reservation System")

        # Combo box para las opciones del menú
        self.menu_options = [
            "Create Customer",
            "Create Flight",
            "Book Ticket",
            "Add Offer",
            "View Ticket History",
            "Add Baggage",
            "Change Flight Date",
            "Update Ticket Status",
            "View Offers",
            "FAQ",
            "Exit"
        ]
        self.selected_option = tk.StringVar()
        self.selected_option.set(self.menu_options[0])  # Opción por defecto

        # Crear el menú desplegable
        tk.Label(self.root, text="Airline Reservation Simulator").pack()
        tk.Label(self.root, text="Select an option:").pack()
        self.menu_dropdown = tk.OptionMenu(self.root, self.selected_option, *self.menu_options)
        self.menu_dropdown.pack(pady=10)

        # Botón para ejecutar la opción seleccionada
        tk.Button(self.root, text="Execute", command=self.execute_option).pack(pady=10)

    def execute_option(self):
        selected = self.selected_option.get()

        if selected == "Exit":
            self.root.destroy()
        else:
            # Ejecutar la función correspondiente según la opción seleccionada
            if selected == "Create Customer":
                self.create_customer()
            elif selected == "Create Flight":
                self.create_flight()
            elif selected == "Book Ticket":
                self.book_ticket()
            elif selected == "Add Offer":
                self.add_offer()
            elif selected == "View Ticket History":
                self.view_ticket_history()
            elif selected == "Add Baggage":
                self.add_baggage()
            elif selected == "Change Flight Date":
                self.change_flight_date()
            elif selected == "Update Ticket Status":
                self.update_ticket_status()
            elif selected == "View Offers":
                self.view_offers()
            elif selected == "FAQ":
                self.display_faq()

    def create_customer(self):
        name = simpledialog.askstring("Enter customer name", "Customer Name:")
        email = simpledialog.askstring("Enter customer email", "Customer Email:")

        if name and email:
            customer_data = {
                "name": name,
                "email": email,
                "created_at": datetime.now()
            }
            result = customers_collection.insert_one(customer_data)
            if result.inserted_id:
                messagebox.showinfo("Success", "Customer created successfully!")
            else:
                messagebox.showerror("Error", "Failed to create customer.")
        else:
            messagebox.showwarning("Warning", "Please enter both name and email.")

    def create_flight(self):
        origin = simpledialog.askstring("Enter origin", "Origin:")
        destination = simpledialog.askstring("Enter destination", "Destination:")
        airline = simpledialog.askstring("Enter airline", "Airline:")
        dep_date_str = simpledialog.askstring("Enter departure date", "Departure Date (yyyy-MM-dd):")
        arr_date_str = simpledialog.askstring("Enter arrival date", "Arrival Date (yyyy-MM-dd):")

        try:
            dep_date = datetime.strptime(dep_date_str, "%Y-%m-%d")
            arr_date = datetime.strptime(arr_date_str, "%Y-%m-%d")
            flight_data = {
                "origin": origin,
                "destination": destination,
                "airline": airline,
                "departure_date": dep_date,
                "arrival_date": arr_date,
                "created_at": datetime.now()
            }
            result = flights_collection.insert_one(flight_data)
            if result.inserted_id:
                messagebox.showinfo("Success", "Flight created successfully!")
            else:
                messagebox.showerror("Error", "Failed to create flight.")
        except ValueError:
            messagebox.showerror("Error", "Invalid date format. Please use yyyy-MM-dd.")

    def book_ticket(self):
        customer_id = simpledialog.askinteger("Enter customer ID", "Customer ID:")
        flight_id = simpledialog.askinteger("Enter flight ID", "Flight ID:")
        ticket_class_str = simpledialog.askstring("Enter ticket class", "Ticket Class (ECONOMY/BUSINESS):")
        number_of_people = simpledialog.askinteger("Enter number of people", "Number of People:")

        try:
            # Validar que el customer_id y flight_id existen en MongoDB (no implementado aquí por simplicidad)

            ticket_data = {
                "customer_id": customer_id,
                "flight_id": flight_id,
                "ticket_class": ticket_class_str,
                "number_of_people": number_of_people,
                "status": "BOOKED",
                "created_at": datetime.now()
            }
            result = tickets_collection.insert_one(ticket_data)
            if result.inserted_id:
                messagebox.showinfo("Success", "Ticket booked successfully!")
            else:
                messagebox.showerror("Error", "Failed to book ticket.")
        except Exception as e:
            messagebox.showerror("Error", f"Failed to book ticket: {str(e)}")

    def add_offer(self):
        offer = simpledialog.askstring("Enter offer details", "Offer Details:")

        if offer:
            # Guardar la oferta en MongoDB (implementa según tu estructura de datos)
            messagebox.showinfo("Success", "Offer added successfully!")
        else:
            messagebox.showwarning("Warning", "Please enter offer details.")

    def view_ticket_history(self):
        customer_id = simpledialog.askinteger("Enter customer ID", "Customer ID:")

        try:
            # Obtener historial de tickets del cliente desde MongoDB (no implementado aquí por simplicidad)

            # Mostrar historial de tickets (implementa según tu estructura de datos)
            messagebox.showinfo("Ticket History", "Implementación pendiente")
        except Exception as e:
            messagebox.showerror("Error", f"Failed to retrieve ticket history: {str(e)}")

    def add_baggage(self):
        ticket_id = simpledialog.askinteger("Enter ticket ID", "Ticket ID:")
        carry_on = simpledialog.askinteger("Enter number of carry-on baggage", "Carry-on Baggage:")
        checked = simpledialog.askinteger("Enter number of checked baggage", "Checked Baggage:")

        try:
            # Validar que el ticket_id existe en MongoDB (no implementado aquí por simplicidad)

            # Agregar equipaje al ticket (implementa según tu estructura de datos)
            messagebox.showinfo("Success", "Baggage added successfully!")
        except Exception as e:
            messagebox.showerror("Error", f"Failed to add baggage: {str(e)}")

    def change_flight_date(self):
        ticket_id = simpledialog.askinteger("Enter ticket ID", "Ticket ID:")
        new_dep_date_str = simpledialog.askstring("Enter new departure date", "New Departure Date (yyyy-MM-dd):")
        new_arr_date_str = simpledialog.askstring("Enter new arrival date", "New Arrival Date (yyyy-MM-dd):")

        try:
            new_dep_date = datetime.strptime(new_dep_date_str, "%Y-%m-%d")
            new_arr_date = datetime.strptime(new_arr_date_str, "%Y-%m-%d")

            # Actualizar fechas del vuelo en MongoDB (implementa según tu estructura de datos)
            messagebox.showinfo("Success", "Flight dates changed successfully!")
        except ValueError:
            messagebox.showerror("Error", "Invalid date format. Please use yyyy-MM-dd.")

    def update_ticket_status(self):
        ticket_id = simpledialog.askinteger("Enter ticket ID", "Ticket ID:")
        new_status = simpledialog.askstring("Enter new status", "New Status:")

        try:
            # Actualizar estado del ticket en MongoDB (implementa según tu estructura de datos)
            messagebox.showinfo("Success", "Ticket status updated successfully!")
        except Exception as e:
            messagebox.showerror("Error", f"Failed to update ticket status: {str(e)}")

    def view_offers(self):
        # Implementar función para ver ofertas (consulta MongoDB y muestra en una ventana)
        messagebox.showinfo("Offers", "Implementación pendiente")

    def display_faq(self):
        # Implementar función para mostrar FAQ (consulta MongoDB y muestra en una ventana)
        messagebox.showinfo("FAQ", "Implementación pendiente")

if __name__ == "__main__":
    root = tk.Tk()
    app = AirlineReservationGUI(root)
    root.mainloop()
