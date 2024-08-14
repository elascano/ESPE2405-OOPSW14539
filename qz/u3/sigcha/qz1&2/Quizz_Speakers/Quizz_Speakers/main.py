from controller.speaker_dao_mongodb import SpeakerDAOMongoDB
from controller.speaker_controller import SpeakerController
from view.main_menu_view import MainMenuView

def main():
    speaker_dao = SpeakerDAOMongoDB()
    controller = SpeakerController(speaker_dao)
    main_menu = MainMenuView(controller)
    main_menu.mainloop()

if __name__ == "__main__":
    main()
