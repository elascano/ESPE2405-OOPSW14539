import json
from model.book import Book
from model.member import Member

class LibraryController:
    def __init__(self, name):
        self.name = name
        self.books = []
        self.members = []

    def add_book(self, book):
        self.books.append(book)
        print(f"Book added: {book}")

    def add_member(self, member):
        self.members.append(member)
        print(f"Member added: {member}")

    def list_available_books(self):
        available_books = [book for book in self.books if book.available]
        if available_books:
            print("Available books:")
            for book in available_books:
                print(f" - {book}")
        else:
            print("No books available at the moment.")

    def get_book_by_id(self, id):
        for book in self.books:
            if book.id == id:
                return book
        return None

    def to_dict(self):
        return {
            "name": self.name,
            "books": [book.to_dict() for book in self.books],
            "members": [member.to_dict() for member in self.members]
        }

    @classmethod
    def from_dict(cls, data):
        library = cls(data["name"])
        library.books = [Book.from_dict(book_data) for book_data in data["books"]]
        library.members = [Member.from_dict(member_data, library) for member_data in data["members"]]
        return library

    def save_to_json(self, filename):
        with open(filename, 'w') as f:
            json.dump(self.to_dict(), f, indent=4)

    @classmethod
    def load_from_json(cls, filename):
        with open(filename, 'r') as f:
            data = json.load(f)
            return cls.from_dict(data)
