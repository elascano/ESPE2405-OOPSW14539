import tkinter as tk
from tkinter import ttk
from tkcalendar import DateEntry
from MethodsBank import MethodsBanks
from Banks import Banks
from datetime import datetime

class FrmBank:
    def __init__(self, root):
        self.root = root
        self.root.title("Bank Data")

        form_frame = tk.Frame(self.root)
        form_frame.pack(padx=10, pady=10, fill=tk.X)

        tk.Label(form_frame, text="Identification card").grid(row=0, column=0, padx=5, pady=5)
        self.entry_id = tk.Entry(form_frame)
        self.entry_id.grid(row=0, column=1, padx=5, pady=5)

        tk.Label(form_frame, text="Name").grid(row=1, column=0, padx=5, pady=5)
        self.entry_name = tk.Entry(form_frame)
        self.entry_name.grid(row=1, column=1, padx=5, pady=5)

        tk.Label(form_frame, text="Last Name").grid(row=1, column=2, padx=5, pady=5)
        self.entry_last_name = tk.Entry(form_frame)
        self.entry_last_name.grid(row=1, column=3, padx=5, pady=5)
        
        tk.Label(form_frame, text="Date of birth").grid(row=2, column=0, padx=5, pady=5)
        self.entry_dob = DateEntry(form_frame, date_pattern='yyyy-mm-dd')
        self.entry_dob.grid(row=2, column=1, padx=5, pady=5)

        tk.Label(form_frame, text="Amount").grid(row=4, column=0, padx=5, pady=5)
        self.entry_amount = tk.Entry(form_frame)
        self.entry_amount.grid(row=4, column=1, padx=5, pady=5)
        
        table_frame = tk.Frame(self.root)
        table_frame.pack(padx=10, pady=10, fill=tk.BOTH, expand=True)
        
        self.tree = ttk.Treeview(table_frame, columns=("Identification card", "Name", "Last Name","Age", "Amount"), show='headings')
        self.tree.heading("Identification card", text="Identification card")
        self.tree.heading("Name", text="Name")
        self.tree.heading("Last Name", text="Last Name")
        self.tree.heading("Age",text = "Age")
        self.tree.heading("Amount", text="Amount")
        self.tree.pack(fill=tk.BOTH, expand=True)
        
        btn_add = tk.Button(form_frame, text="Add Data", command=self.add_data)
        btn_add.grid(row=5, columnspan=10, pady=10)
        
        btn_load = tk.Button(table_frame, text="Read Data", command=self.load_data)
        btn_load.pack(pady=10)

    def load_data(self):
        
        methods = MethodsBanks()
        banks = methods.list_banks()
        
        for item in self.tree.get_children():
            self.tree.delete(item)
            
        for bank in banks:
            self.tree.insert("", tk.END, values=(bank.id, bank.name, bank.last_name,bank.dy_bourner, bank.amount))

    def add_data(self):
        id = self.entry_id.get()
        name = self.entry_name.get()
        last_name = self.entry_last_name.get()
        dob = self.entry_dob.get_date()
        amount = self.entry_amount.get()
        
        bank = Banks(id=id, name=name, last_name=last_name,dob=dob, amount=amount)

        methods = MethodsBanks()
        methods.add_bank(bank)

        self.load_data()

        self.entry_id.delete(0, tk.END)
        self.entry_name.delete(0, tk.END)
        self.entry_last_name.delete(0, tk.END)
        self.entry_dob.set_date(datetime.today())
        self.entry_amount.delete(0, tk.END)
        

root = tk.Tk()
app = FrmBank(root)
root.mainloop()
