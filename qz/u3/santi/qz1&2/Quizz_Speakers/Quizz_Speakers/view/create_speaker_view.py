import tkinter as tk
from tkinter import messagebox
from controller.speaker_controller import SpeakerController
from model.speaker import Speaker

class CreateSpeakerView(tk.Tk):
    def __init__(self, controller: SpeakerController):
        super().__init__()
        self.controller = controller
        self.title("Create Speaker")
        self.geometry("300x200")
        self.create_widgets()

    def create_widgets(self):
        tk.Label(self, text="ID:").grid(row=0, column=0)
        self.id_entry = tk.Entry(self)
        self.id_entry.grid(row=0, column=1)

        tk.Label(self, text="Brand:").grid(row=1, column=0)
        self.brand_entry = tk.Entry(self)
        self.brand_entry.grid(row=1, column=1)

        tk.Label(self, text="Power:").grid(row=2, column=0)
        self.power_entry = tk.Entry(self)
        self.power_entry.grid(row=2, column=1)

        tk.Label(self, text="Frequency:").grid(row=3, column=0)
        self.frequency_entry = tk.Entry(self)
        self.frequency_entry.grid(row=3, column=1)

        create_button = tk.Button(self, text="Create", command=self.create_speaker)
        create_button.grid(row=4, column=0, columnspan=2)

    def create_speaker(self):
        try:
            speaker_id = self.id_entry.get()
            brand = self.brand_entry.get()
            power = float(self.power_entry.get())
            frequency = float(self.frequency_entry.get())

            speaker = Speaker(speaker_id, brand, power, frequency)
            self.controller.create_speaker(speaker)
            messagebox.showinfo("Success", "Speaker created successfully!")
            self.destroy()
        except ValueError:
            messagebox.showerror("Error", "Invalid input. Please check your values.")
