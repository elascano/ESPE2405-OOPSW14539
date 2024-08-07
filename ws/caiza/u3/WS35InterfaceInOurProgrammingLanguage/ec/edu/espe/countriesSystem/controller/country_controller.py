
from pymongo import MongoClient
from ec.edu.espe.countriesSystem.model.country import CountryModel


class CountryController:
    def __init__(self, view, uri, db_name):
        self.view = view
        self.client = MongoClient(uri)
        self.db = self.client[db_name]
        self.collection = self.db['countries']

        # Set up callbacks
        self.view.set_add_country_callback(self.add_country)
        self.view.set_show_countries_callback(self.show_countries)
        self.view.set_delete_country_callback(self.delete_country)
        self.view.set_search_country_callback(self.search_country)
        self.view.set_refresh_list_callback(self.refresh_list)

    def add_country(self, country_data):
        # Save country to MongoDB
        self.collection.insert_one(country_data)
        self.view.show_message("Country added successfully!")

    def show_countries(self):
        # Retrieve all countries from MongoDB
        countries = list(self.collection.find({}))
        self.view.update_listbox(countries)

    def delete_country(self, country_name):
        # Delete country from MongoDB
        self.collection.delete_one({'pais': country_name})
        self.view.show_message(f"Country '{country_name}' deleted successfully!")

    def search_country(self, country_name):
        # Search for country in MongoDB
        return self.collection.find_one({'pais': country_name})

    def refresh_list(self):
        self.show_countries()