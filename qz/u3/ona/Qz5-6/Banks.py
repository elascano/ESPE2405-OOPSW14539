# Banks.py
class Banks:
    def __init__(self, id=None, name=None, last_name=None, dob=None, amount=None):
        self.id = id
        self.name = name
        self.last_name = last_name
        self.dob = dob  
        self.amount = amount
        self.dy_bourner = None  

    def __str__(self):
        return f"ID: {self.id}, Name: {self.name}, Last Name: {self.last_name}, Date of Birth: {self.dob}, Amount: {self.amount}, Age: {self.dy_bourner}"
