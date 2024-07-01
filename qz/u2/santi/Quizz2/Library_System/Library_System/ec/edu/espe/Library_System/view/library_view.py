class LibraryView:
    def show_books(self, books):
        print("Books in the library:")
        for book in books:
            print(f"- {book}")

    def show_members(self, members):
        print("Library members:")
        for member in members:
            print(f"- {member}")
