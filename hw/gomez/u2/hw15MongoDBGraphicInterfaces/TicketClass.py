import tkinter as tk
from tkinter import ttk, messagebox
from pymongo import MongoClient

class TicketClass:
    ECONOMY = ("ECONOMY", 100.0)
    BUSINESS = ("BUSINESS", 200.0)

def create_gui():
    root = tk.Tk()
    root.title("Ticket Booking System")
    root.geometry("400x400")

    tk.Label(root, text="Passenger Name:").grid(row=0, column=0, padx=10, pady=10, sticky="w")
    name_entry = tk.Entry(root)
    name_entry.grid(row=0, column=1, padx=10, pady=10)

    tk.Label(root, text="Ticket Class:").grid(row=1, column=0, padx=10, pady=10, sticky="w")
    ticket_class_combobox = ttk.Combobox(root, values=[TicketClass.ECONOMY[0], TicketClass.BUSINESS[0]])
    ticket_class_combobox.grid(row=1, column=1, padx=10, pady=10)
    ticket_class_combobox.current(0)

    tk.Label(root, text="Price:").grid(row=2, column=0, padx=10, pady=10, sticky="w")
    price_entry = tk.Entry(root)
    price_entry.grid(row=2, column=1, padx=10, pady=10)

    def update_price(event):
        selected_class = ticket_class_combobox.get()
        if selected_class == TicketClass.ECONOMY[0]:
            price_entry.delete(0, tk.END)
            price_entry.insert(0, TicketClass.ECONOMY[1])
        elif selected_class == TicketClass.BUSINESS[0]:
            price_entry.delete(0, tk.END)
            price_entry.insert(0, TicketClass.BUSINESS[1])

    ticket_class_combobox.bind("<<ComboboxSelected>>", update_price)

    tk.Label(root, text="Seat Type:").grid(row=3, column=0, padx=10, pady=10, sticky="w")
    seat_type_combobox = ttk.Combobox(root, values=["Window", "Aisle", "Middle"])
    seat_type_combobox.grid(row=3, column=1, padx=10, pady=10)
    seat_type_combobox.current(0)

    tk.Label(root, text="Additional Services:").grid(row=4, column=0, padx=10, pady=10, sticky="w")
    option1 = tk.IntVar()
    option2 = tk.IntVar()
    option3 = tk.IntVar()
    tk.Checkbutton(root, text="Extra Legroom", variable=option1).grid(row=5, column=1, padx=10, pady=2, sticky="w")
    tk.Checkbutton(root, text="Priority Boarding", variable=option2).grid(row=6, column=1, padx=10, pady=2, sticky="w")
    tk.Checkbutton(root, text="Meal Included", variable=option3).grid(row=7, column=1, padx=10, pady=2, sticky="w")

    client = MongoClient("mongodb+srv://JoffreGQ:joffre2004@cluster0.yztxrwi.mongodb.net/")
    db = client["airline_reservation_system"]
    collection = db["tickets"]

    def save_to_db():
        passenger_name = name_entry.get()
        ticket_class = ticket_class_combobox.get()
        price = float(price_entry.get())
        seat_type = seat_type_combobox.get()
        additional_services = []
        if option1.get():
            additional_services.append("Extra Legroom")
        if option2.get():
            additional_services.append("Priority Boarding")
        if option3.get():
            additional_services.append("Meal Included")

        ticket_data = {
            "passenger_name": passenger_name,
            "ticket_class": ticket_class,
            "price": price,
            "seat_type": seat_type,
            "additional_services": additional_services
        }

        collection.insert_one(ticket_data)
        messagebox.showinfo("Success", "Ticket data saved to MongoDB")

    save_button = tk.Button(root, text="Save to DB", command=save_to_db)
    save_button.grid(row=8, column=1, padx=10, pady=10)

    root.mainloop()

create_gui()
