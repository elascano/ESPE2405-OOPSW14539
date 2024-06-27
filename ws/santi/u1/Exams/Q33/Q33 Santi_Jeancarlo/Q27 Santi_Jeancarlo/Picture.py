import json

class Picture:
    def __init__(self, id, title, description, path):
        self.id = id
        self.title = title
        self.description = description
        self.path = path

    def to_dict(self):
        return {
            "id": self.id,
            "title": self.title,
            "description": self.description,
            "path": self.path
        }

    @classmethod
    def from_dict(cls, data):
        return cls(data["id"], data["title"], data["description"], data["path"])

def write_pictures_to_file(pictures, filename):
    with open(filename, 'w') as file:
        json.dump([picture.to_dict() for picture in pictures], file, indent=4)

def read_pictures_from_file(filename):
    try:
        with open(filename, 'r') as file:
            pictures_data = json.load(file)
            return [Picture.from_dict(data) for data in pictures_data]
    except FileNotFoundError:
        return []

def input_picture():
    id = input("Enter picture ID: ")
    title = input("Enter picture title: ")
    description = input("Enter picture description: ")
    path = input("Enter picture path: ")
    return Picture(id, title, description, path)

def main():
    filename = "pictures.json"
    pictures = read_pictures_from_file(filename)

    while True:
        print("\n1. Add a new picture")
        print("2. View all pictures")
        print("3. Exit")
        choice = input("Choose an option: ")

        if choice == '1':
            picture = input_picture()
            pictures.append(picture)
            write_pictures_to_file(pictures, filename)
        elif choice == '2':
            for picture in pictures:
                print(f"ID: {picture.id}, Title: {picture.title}, Description: {picture.description}, Path: {picture.path}")
        elif choice == '3':
            break
        else:
            print("Invalid option. Please try again.")

if __name__ == "__main__":
    main()
