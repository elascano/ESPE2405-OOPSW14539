from datetime import date, datetime

class Chick:
    def __init__(self, id, name, color, molting, bornOfDate):
        self._id = id
        self._name = name
        self._color = color
        self._molting = molting
        self._birthDate = bornOfDate

    # Getters
    def GetId(self):
        return self._id

    def GetName(self):
        return self._name

    def GetColor(self):
        return self._color

    def GetMolting(self):
        return self._molting

    def GetBirthDate(self):
        return self._birthDate

    # Setters
    def SetId(self, id):
        self._id = id

    def SetName(self, name):
        self._name = name

    def SetColor(self, color):
        self._color = color

    def SetMolting(self, molting):
        self._molting = molting

    def SetBirthDate(self, birthDate):
        self._birthDate = birthDate

    # Method to calculate age
    def CalculateAge(self):
        today = date.today()
        age = today - self._birthDate
        return age.days

    # Method to display all attributes including age
    def DisplayInfo(self):
        moltingStatus = "yes" if self._molting else "no"
        ageDays = self.CalculateAge()
        return (f"ID: {self._id}, Name: {self._name}, Color: {self._color}, "
                f"Molting: {moltingStatus}, Birth Date: {self._birthDate}, Age: {ageDays} days")

# Function to read data from keyboard
def ReadData():
    chickId = int(input("Enter the chick's ID: "))
    chickName = input("Enter the chick's name: ")
    chickColor = input("Enter the chick's color: ")
    chickMolting = input("Is it molting? (yes/no): ").lower() == 'yes'
    birthDateStr = input("Enter the birth date (YYYY-MM-DD): ")
    birthDate = datetime.strptime(birthDateStr, "%Y-%m-%d").date()

    return Chick(chickId, chickName, chickColor, chickMolting, birthDate)

# Example usage
if __name__ == "__main__":
    chick = ReadData()
    ageDays = chick.CalculateAge()
    birthDate = chick.GetBirthDate()
    print(f"The chick {chick.GetName()} was born on {birthDate} and is {ageDays} days old.")
    print(f"Chick details: {chick.DisplayInfo()}")
