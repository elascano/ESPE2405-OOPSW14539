from income.Tax import calculateIt

class Employee:
    def __init__ (self ,id, name, birthDate, gender, salary):
        self.id = id
        self.name = name
        self.birthdate = birthDate
        self.gender = gender
        self.salary = salary
        self.incomeTax = calculateIt(salary)
        self.sure = salary * 11.15/100
        self.netSalary = salary - self.incomeTax * salary - self.sure

    def __str__(self):
        return (f"Employee{{id={self.id}, name={self.name}, birth_date={self.birth_date}, "
                f"gender={self.gender}, salary={self.salary}, incometax={self.incometax}, "
                f"net_salary={self.net_salary}, sure={self.sure}}}")
    
