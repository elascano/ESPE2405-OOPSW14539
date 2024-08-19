from datetime import datetime
class SchoolAgeCalculator:
    @staticmethod
    def calculate_age(foundation_year):
        current_year = datetime.now().year
        return current_year - foundation_year