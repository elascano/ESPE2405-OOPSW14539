from espe.edu.ec.stand.oña.model import Stand
from util.GenerarJson import JsonUtil
class simulector:
@staticmethod
def __init__(self):
        self.stand = Stand()

    def display_stand(self):
    print(f" ID: {self.standstand.get_id()},Balance: {self.stand.get_balance()} Posture: {self.stand.get_posture()}")


    def input_person_data(self):
    
        id = input("Enter id: ")
        balance = input("Enter balance: ")
        posture = input("Enter posture: ")
        self.stand.set_id(id)
        self.stand.set_balance(balance)
        
        self.stand.set_posture(posture)

        def save_person_data(self):
        filename = input("Enter filename to save data: ")
        JsonUtil.save_to_json(filename, self.person.to_dict())

    def load_person_data(self):
        filename = input("Enter filename to load data: ")
        data = JsonUtil.load_from_json(filename)
        self.person = Person.from_dict(data)

    def show_menu(self):
        while True:
             print("\nMenu:")
            print("1. Enter stand data")
            print("2. Display stand data")
            print("3. Save stand data to JSON")
            print("4. Load stand data from JSON")
            print("5. Exit")

            choice = input("Enter your choice: ")

            if choice == '1':
                self.input_stand_data()
            elif choice == '2':
                self.display_stand()
            elif choice == '3':
                self.save_stand_data()
            elif choice == '4':
                self.load_stand_data()
            elif choice == '5':
                break
            else:
                print("Invalid choice. Please try again.")

                def main():
    view = simulector()
    view.show_menu()

if __name__ == "__main__":
    main()