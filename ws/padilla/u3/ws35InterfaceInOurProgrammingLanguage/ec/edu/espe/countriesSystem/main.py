import tkinter as tk
from ec.edu.espe.countriesSystem.view.country_view import CountryView
from ec.edu.espe.countriesSystem.controller.country_controller import CountryController

def main():
    root = tk.Tk()
    view = CountryView(root)
    controller = CountryController(view, 'mongodb+srv://MiguelAngel:miguel1234@cluster0.hovruoz.mongodb.net/', 'Countries_DataBase')
    root.mainloop()

if __name__ == "__main__":
    main()
    
    ##command for open main: python -m ec.edu.espe.countriesSystem.main