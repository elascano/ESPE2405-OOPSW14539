import tkinter as tk
from tkinter import messagebox
from tkinter import ttk
from pymongo import MongoClient
from datetime import datetime

class MenuManagerGUI:
    def __init__(self, root):
        self.root = root
        self.root.title("Airline Reservation System")

        # MongoDB connection
        self.client = MongoClient("mongodb+srv://JoffreGQ:joffre2004@cluster0.yztxrwi.mongodb.net/")
        self.db = self.client["airline_reservation_system"]
        self.collection = self.db["customers"]

        # Create UI elements
        self.create_widgets()

    def create_widgets(self):
        # Frame for customer creation
        customer_frame = ttk.LabelFrame(self.root, text="Create Customer")
        customer_frame.grid(row=0, column=0, padx=10, pady=10)

        # Customer inputs
        tk.Label(customer_frame, text="Customer Name:").grid(row=0, column=0, padx=5, pady=5, sticky=tk.E)
        self.customer_name_entry = tk.Entry(customer_frame)
        self.customer_name_entry.grid(row=0, column=1, padx=5, pady=5)

        tk.Label(customer_frame, text="Customer Email:").grid(row=1, column=0, padx=5, pady=5, sticky=tk.E)
        self.customer_email_entry = tk.Entry(customer_frame)
        self.customer_email_entry.grid(row=1, column=1, padx=5, pady=5)

        ttk.Button(customer_frame, text="Create Customer", command=self.create_customer).grid(row=2, columnspan=2, padx=5, pady=10)

        # Status label
        self.status_label = tk.Label(self.root, text="", fg="green")
        self.status_label.grid(row=1, column=0, padx=10, pady=10)

    def create_customer(self):
        name = self.customer_name_entry.get()
        email = self.customer_email_entry.get()

        # Insert customer into MongoDB
        customer_data = {
            "name": name,
            "email": email,
            "created_at": datetime.now()
        }

        try:
            result = self.collection.insert_one(customer_data)
            self.status_label.config(text=f"Customer {name} created successfully! ID: {result.inserted_id}", fg="green")
            messagebox.showinfo("Success", f"Customer {name} created successfully!")
        except Exception as e:
            self.status_label.config(text="Error creating customer", fg="red")
            messagebox.showerror("Error", "Failed to create customer:\n" + str(e))

        # Clear entry fields
        self.customer_name_entry.delete(0, tk.END)
        self.customer_email_entry.delete(0, tk.END)

    def list_customers_from_mongodb(self):
        customers = list(self.collection.find())
        print("Customers in MongoDB:")
        for customer in customers:
            print(customer)

if __name__ == "__main__":
    root = tk.Tk()
    app = MenuManagerGUI(root)
    root.mainloop()

    # Después de cerrar la interfaz gráfica, puedes llamar a list_customers_from_mongodb para verificar en MongoDB
    app.list_customers_from_mongodb()
