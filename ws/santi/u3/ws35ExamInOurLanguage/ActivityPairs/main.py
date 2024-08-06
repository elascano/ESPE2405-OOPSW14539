from controller.mongodb_connection import MongoDBConnection
from controller.building_controller import BuildingController
from view.building_view import BuildingView
from view.main_menu import MainMenu

def main():
    MongoDBConnection.connect()

    view = BuildingView()
    controller = BuildingController(view, MongoDBConnection.get_database())

    main_menu = MainMenu(controller)
    main_menu.run()

if __name__ == "__main__":
    main()