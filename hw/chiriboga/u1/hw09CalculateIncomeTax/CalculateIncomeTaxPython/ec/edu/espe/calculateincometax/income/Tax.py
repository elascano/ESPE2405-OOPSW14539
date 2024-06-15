class Tax:
    @staticmethod
    def calculate_it(salary):
        annual_salary = salary * 12
        if 0 <= annual_salary <= 11902.00:
            return 0.0
        elif 11902.01 <= annual_salary <= 15159.00:
            return 5 / 100.0
        elif 15159.01 <= annual_salary <= 19682.00:
            return 10 / 100.0
        elif 19682.01 <= annual_salary <= 26031.00:
            return 12 / 100.0
        elif 26031.01 <= annual_salary <= 34255.00:
            return 15 / 100.0
        elif 34255.01 <= annual_salary <= 45407.00:
            return 20 / 100.0
        elif 45407.01 <= annual_salary <= 60450.00:
            return 25 / 100.0
        elif 60450.01 <= annual_salary <= 80605.00:
            return 30 / 100.0
        elif 80605.01 <= annual_salary <= 107199.00:
            return 35 / 100.0
        elif annual_salary >= 107199.01:
            return 37 / 100.0
        return 0.0
