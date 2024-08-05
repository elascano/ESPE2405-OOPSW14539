import tkinter as tk
from tkinter import ttk

class ComputerStatusApp(tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("Computer Status")
        self.create_widgets()

    def create_widgets(self):
        # Define the labels
        label1 = ttk.Label(self, text="Computer Status")
        label1.grid(row=0, column=0, columnspan=3, pady=10)

        label2 = ttk.Label(self, text="Elapsed time")
        label2.grid(row=1, column=2, pady=5)

        label3 = ttk.Label(self, text="Elapsed time")
        label3.grid(row=1, column=5, pady=5)

        # Create computer status rows
        for i in range(1, 11):
            row = (i + 1) if i <= 5 else (i - 4)
            col = 0 if i <= 5 else 3

            ttk.Label(self, text=f"Computer {i} :").grid(row=row, column=col, padx=10, pady=5, sticky='e')
            button = ttk.Button(self, text="Active")
            button.grid(row=row, column=col+1, padx=5, pady=5)
            entry = ttk.Entry(self)
            entry.grid(row=row, column=col+2, padx=5, pady=5)

if __name__ == "__main__":
    app = ComputerStatusApp()
    app.mainloop()
