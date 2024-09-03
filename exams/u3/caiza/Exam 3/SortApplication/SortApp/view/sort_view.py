import tkinter as tk
from tkinter import messagebox

class SortView:
    def __init__(self, master):
        self.master = master
        master.title("Array Sorting")

        self.label = tk.Label(master, text="Enter numbers (comma-separated):")
        self.label.pack()

        self.input_field = tk.Entry(master)
        self.input_field.pack()

        self.sort_button = tk.Button(master, text="Sort", command=self.sort)
        self.sort_button.pack()

    def set_controller(self, controller):
        self.controller = controller

    def sort(self):
        input_text = self.input_field.get()
        self.controller.sort_input(input_text)

    def show_message(self, message, title="Sorting Result"):
        messagebox.showinfo(title, message)

    def show_error(self, message, title="Input Error"):
        messagebox.showerror(title, message)
