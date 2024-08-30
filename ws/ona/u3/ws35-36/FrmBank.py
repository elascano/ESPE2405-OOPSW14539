import tkinter as tk
from tkinter import ttk
from MethodsBank import MethodsBanks
from Banks import Banks

class FrmBank:
    def __init__(self, root):
        self.root = root
        self.root.title("Bank Details List")

        
        table_frame = tk.Frame(self.root)
        table_frame.pack(padx=10, pady=10, fill=tk.BOTH, expand=True)

        
        self.tree = ttk.Treeview(table_frame, columns=("Identification card", "Name", "Last Name", "Amount"), show='headings')
        self.tree.heading("Identification card", text="Identification card")
        self.tree.heading("Name", text="Name")
        self.tree.heading("Last Name", text="Last Name")
        self.tree.heading("Amount", text="Amount")
        self.tree.pack(fill=tk.BOTH, expand=True)
        
        btn_load = tk.Button(table_frame, text="List Data", command=self.load_data)
        btn_load.pack(pady=10)

    def load_data(self):
        
        methods = MethodsBanks()
        banks = methods.list_banks()
        
        for item in self.tree.get_children():
            self.tree.delete(item)
            
        for bank in banks:
            self.tree.insert("", tk.END, values=(bank.id, bank.name, bank.last_name, bank.amount))

    def add_data(self):
        id = self.entry_id.get()
        name = self.entry_name.get()
        last_name = self.entry_last_name.get()
        amount = self.entry_amount.get()
               
        bank = Banks(id=id, name=name, last_name=last_name, amount=amount)
        
        methods = MethodsBanks()
        methods.add_bank(bank)
        
        self.load_data()
        
        self.entry_id.delete(0, tk.END)
        self.entry_name.delete(0, tk.END)
        self.entry_last_name.delete(0, tk.END)
        self.entry_amount.delete(0, tk.END)
        
    
root = tk.Tk()
app = FrmBank(root)
root.mainloop()
