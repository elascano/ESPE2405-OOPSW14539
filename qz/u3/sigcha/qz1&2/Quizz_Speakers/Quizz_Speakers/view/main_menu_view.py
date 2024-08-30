import tkinter as tk
from tkinter import messagebox
from controller.speaker_controller import SpeakerController
from view.create_speaker_view import CreateSpeakerView
from view.list_speakers_view import ListSpeakersView

class MainMenuView(tk.Tk):
    def __init__(self, controller: SpeakerController):
        super().__init__()
        self.controller = controller
        
        self.title("Speaker Management System")
        self.geometry("800x600")
        
        self.create_widgets()

    def create_widgets(self):
        menu_bar = tk.Menu(self)
        self.config(menu=menu_bar)

        file_menu = tk.Menu(menu_bar, tearoff=0)
        speaker_menu = tk.Menu(menu_bar, tearoff=0)
        help_menu = tk.Menu(menu_bar, tearoff=0)

        menu_bar.add_cascade(label="File", menu=file_menu)
        menu_bar.add_cascade(label="Speakers", menu=speaker_menu)
        menu_bar.add_cascade(label="Help", menu=help_menu)

        file_menu.add_command(label="Exit", command=self.quit)
        speaker_menu.add_command(label="Create Speaker", command=self.open_create_speaker_view)
        speaker_menu.add_command(label="List Speakers", command=self.open_list_speakers_view)
        help_menu.add_command(label="About", command=self.show_about_info)

        main_panel = tk.Frame(self)
        main_panel.pack(fill=tk.BOTH, expand=True)

        welcome_label = tk.Label(main_panel, text="Welcome to Speaker Management System", font=("Arial", 24), pady=20)
        welcome_label.pack(pady=50)

        status_bar = tk.Frame(self, bd=1, relief=tk.SUNKEN)
        status_bar.pack(side=tk.BOTTOM, fill=tk.X)
        status_label = tk.Label(status_bar, text="Ready", anchor=tk.W)
        status_label.pack(side=tk.LEFT, padx=10)

    def open_create_speaker_view(self):
        CreateSpeakerView(self.controller).mainloop()

    def open_list_speakers_view(self):
        ListSpeakersView(self.controller).mainloop()

    def show_about_info(self):
        messagebox.showinfo("About", "Speaker Management System\nVersion 1.0\nDeveloped by Your Name")
