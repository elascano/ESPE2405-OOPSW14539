import tkinter as tk
from tkinter import ttk
from controller.speaker_controller import SpeakerController

class ListSpeakersView(tk.Tk):
    def __init__(self, controller: SpeakerController):
        super().__init__()
        self.controller = controller
        self.title("List Speakers")
        self.geometry("500x300")
        self.create_widgets()

    def create_widgets(self):
        columns = ("ID", "Brand", "Power", "Frequency", "Quality Index")
        self.tree = ttk.Treeview(self, columns=columns, show="headings")
        for col in columns:
            self.tree.heading(col, text=col)

        speakers = self.controller.list_all_speakers()
        for speaker in speakers:
            self.tree.insert("", "end", values=(speaker.id, speaker.brand, speaker.power, speaker.frequency, speaker.calculate_quality_index()))

        self.tree.pack(fill=tk.BOTH, expand=True)
