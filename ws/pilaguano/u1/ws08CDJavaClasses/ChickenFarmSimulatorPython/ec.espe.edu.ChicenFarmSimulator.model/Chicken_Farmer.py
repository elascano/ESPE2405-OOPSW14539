# models/chicken_farmer.py

class ChickenFarmer:
    def __init__(self, farmer_id, name, coops):
        self.farmer_id = farmer_id
        self.name = name
        self.coops = coops

    def to_string(self, format_choice):
        if format_choice == 1:  # CSV
            return self.to_csv()
        elif format_choice == 2:  # TXT
            return self.to_txt()
        elif format_choice == 3:  # JSON
            return self.to_json()
        else:
            raise ValueError("Unsupported format: " + str(format_choice))

    def to_csv(self):
        # Implement CSV serialization
        pass

    def to_txt(self):
        # Implement TXT serialization
        pass

    def to_json(self):
        # Implement JSON serialization
        return json.dumps(self.__dict__, default=str)

    def __str__(self):
        return f"ChickenFarmer{{id={self.farmer_id}, name={self.name}, coops={self.coops}}}"
