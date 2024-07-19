class Student:
    def __init__(self, id, name, born_on_date, major, gpa):
        self.id = id
        self.name = name
        self.born_on_date = born_on_date
        self.major = major
        self.gpa = gpa

    def to_dict(self):
        return {
            "id": self.id,
            "name": self.name,
            "born_on_date": self.born_on_date,
            "major": self.major,
            "gpa": self.gpa
        }
