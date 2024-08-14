from pymongo import MongoClient
from ec.edu.espe.countriesSystem.model.country import CountryModel
from ec.edu.espe.countriesSystem.view.country_view import CountryView

class CountryController:
    def __init__(self, view, uri, db_name):
        self.view = view
        self.client = MongoClient(uri)
        self.db = self.client[db_name]
        self.collection = self.db['countries']
        self.view.set_add_country_callback(self.add_country)
        self.view.set_show_countries_callback(self.show_countries)
        self.view.set_delete_country_callback(self.delete_country)
        self.view.set_refresh_list_callback(self.refresh_list)

    def add_country(self, country_data):
        model = CountryModel(**country_data)
        self.collection.insert_one(model.to_dict())
        self.view.show_message("Country added successfully!")
        self.refresh_list()  # Refresh the list after adding a new country

    def show_countries(self):
        countries = self.collection.find()
        self.view.update_listbox(countries)

    def delete_country(self, country_name):
        self.collection.delete_one({'pais': country_name})
        self.view.show_message(f"Country '{country_name}' deleted successfully!")
        self.refresh_list()  # Refresh the list after deleting a country

    def refresh_list(self):
        countries = self.collection.find()
        self.view.update_listbox(countries)