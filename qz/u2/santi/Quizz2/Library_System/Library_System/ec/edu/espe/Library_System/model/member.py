class Member:
    def __init__(self, name, member_id, borrowed_books=None):
        self.name = name
        self.member_id = member_id
        self.borrowed_books = borrowed_books if borrowed_books is not None else []

    def __str__(self):
        return f"Member: {self.name} (ID: {self.member_id})"

    def borrow_book(self, book):
        if book.borrow():
            self.borrowed_books.append(book)
            print(f"{self.name} borrowed {book}.")
        else:
            print(f"{book} is not available.")

    def return_book(self, book):
        if book in self.borrowed_books:
            book.return_book()
            self.borrowed_books.remove(book)
            print(f"{self.name} returned {book}.")
        else:
            print(f"{self.name} does not have {book} borrowed.")

    def to_dict(self):
        return {
            "name": self.name,
            "member_id": self.member_id,
            "borrowed_books": [book.id for book in self.borrowed_books]
        }

    @classmethod
    def from_dict(cls, data, library):
        borrowed_books = [library.get_book_by_id(id) for id in data["borrowed_books"]]
        return cls(data["name"], data["member_id"], borrowed_books)
