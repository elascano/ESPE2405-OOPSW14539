class Book:
    def __init__(self, id, title, author, available=True):
        self.id = id
        self.title = title
        self.author = author
        self.available = available

    def __str__(self):
        return f"'{self.title}' by {self.author} (ID: {self.id})"

    def borrow(self):
        if self.available:
            self.available = False
            return True
        return False

    def return_book(self):
        self.available = True

    def to_dict(self):
        return {
            "id": self.id,
            "title": self.title,
            "author": self.author,
            "available": self.available
        }

    @classmethod
    def from_dict(cls, data):
        return cls(data["id"], data["title"], data["author"], data["available"])
