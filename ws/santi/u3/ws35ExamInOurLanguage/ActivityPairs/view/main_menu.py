import tkinter as tk
from view.building_create_view import BuildingCreateView

class MainMenu:
    def __init__(self, controller):
        self.controller = controller
        self.window = tk.Tk()
        self.window.title("Main Menu")
        self.window.geometry("300x200")

        self.btn_create_building = tk.Button(self.window, text="Create Building", command=self.open_create_view)
        self.btn_create_building.pack(pady=10)

        self.btn_list_buildings = tk.Button(self.window, text="List Buildings", command=self.list_buildings)
        self.btn_list_buildings.pack(pady=10)

    def open_create_view(self):
        self.window.destroy()
        BuildingCreateView(self.controller)

    def list_buildings(self):
        buildings = self.controller.get_all_buildings()
        self.controller.get_view().display_all_buildings(buildings)

    def run(self):
        self.window.mainloop()