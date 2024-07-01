from model.book import Book
from model.member import Member
from controller.library_controller import LibraryController
from view.library_view import LibraryView

# Create books
book1 = Book(1, "One Hundred Years of Solitude", "Gabriel Garcia Marquez")
book2 = Book(2, "Don Quixote", "Miguel de Cervantes")

# Create members
member1 = Member("John Doe", 1)
member2 = Member("Jane Smith", 2)

# Create library controller
library_controller = LibraryController("Central Library")

# Add books and members to the library
library_controller.add_book(book1)
library_controller.add_book(book2)
library_controller.add_member(member1)
library_controller.add_member(member2)

# Create library view
library_view = LibraryView()

# Show books and members
library_view.show_books(library_controller.books)
library_view.show_members(library_controller.members)

# Save the library to a JSON file
library_controller.save_to_json("library.json")

# Load the library from a JSON file
loaded_library = LibraryController.load_from_json("library.json")

# Show available books in the loaded library
library_view.show_books(loaded_library.books)
