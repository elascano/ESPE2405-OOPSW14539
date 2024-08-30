import tkinter as tk
from tkinter import ttk

class MainView(tk.Tk):
    def __init__(self, controller):
        super().__init__()

        self.controller = controller
        self.title("Sorting Application")
        self.geometry("400x200")

        
        self.label = ttk.Label(self, text="Enter numbers separated by commas:")
        self.label.pack(pady=10)

        self.entry = ttk.Entry(self, width=50)
        self.entry.pack(pady=10)

        
        self.sort_button = ttk.Button(self, text="Sort", command=self.sort_button_click)
        self.sort_button.pack(pady=20)

    def sort_button_click(self):
        data_str = self.entry.get()
        self.controller.on_sort_button_click(data_str)
