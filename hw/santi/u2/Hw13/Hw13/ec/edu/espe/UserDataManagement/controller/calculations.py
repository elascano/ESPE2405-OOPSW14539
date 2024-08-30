class Calculator:
    def calculate_monthly_salary(self, annual_salary):
        return annual_salary / 12

    def overloaded_method(self, annual_salary=None):
        if annual_salary is not None:
            return self.calculate_monthly_salary(annual_salary)
        else:
            return "No annual salary provided"
