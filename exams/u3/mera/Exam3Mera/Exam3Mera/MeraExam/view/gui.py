import tkinter as tk
from tkinter import messagebox
from controller.sorting_context import SortingContext

class SortApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Sorting Application")
        self.root.geometry("400x300")
        self.context = SortingContext()

        self.unsorted_label = tk.Label(root, text="Enter numbers (comma separated):")
        self.unsorted_label.pack()

        self.unsorted_entry = tk.Entry(root, width=50)
        self.unsorted_entry.pack()

        self.sort_button = tk.Button(root, text="Sort", command=self.sort_numbers)
        self.sort_button.pack()

        self.sorted_label = tk.Label(root, text="Sorted numbers:")
        self.sorted_label.pack()

        self.sorted_text = tk.Text(root, height=2, width=50)
        self.sorted_text.pack()

        self.strategy_label = tk.Label(root, text="Sorting Algorithm:")
        self.strategy_label.pack()

        self.strategy_text = tk.Entry(root, width=50)
        self.strategy_text.pack()

    def sort_numbers(self):
        user_input = self.unsorted_entry.get()
        try:
            data = list(map(int, user_input.split(',')))
            sorted_data, algorithm = self.context.sort(data)

            self.sorted_text.delete(1.0, tk.END)
            self.sorted_text.insert(tk.END, str(sorted_data))

            self.strategy_text.delete(0, tk.END)
            self.strategy_text.insert(tk.END, algorithm)

        except ValueError as e:
            messagebox.showerror("Error", f"Invalid input: {str(e)}")