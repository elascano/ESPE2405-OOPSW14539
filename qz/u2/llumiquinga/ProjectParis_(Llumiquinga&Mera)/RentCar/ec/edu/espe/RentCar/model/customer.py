class Customer:
    def __init__(self, id, name, license_number):
        self.id = id
        self.name = name
        self.license_number = license_number

    def addCustomer(self):
        return {
            "id": self.id,
            "name": self.name,
            "license_number": self.license_number
        }
