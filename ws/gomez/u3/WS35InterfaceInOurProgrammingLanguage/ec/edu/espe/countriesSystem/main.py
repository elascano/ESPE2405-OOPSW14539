import tkinter as tk
from ec.edu.espe.countriesSystem.controller.country_controller import CountryController
from ec.edu.espe.countriesSystem.view.country_view import CountryView

def main():
    uri = 'mongodb+srv://MiguelAngel:miguel1234@cluster0.hovruoz.mongodb.net/'
    db_name = 'Countries_DataBase'

    root = tk.Tk()
    
    view = CountryView(root)
    controller = CountryController(view, uri, db_name)

    root.mainloop()

if __name__ == "__main__":
    main()