import pickle
from ec.edu.espe.SaveAndObject.model.caizaStudent import Student

class StudentGestor:

    def SaveStudent(self, id, name, nationality, career, scholarship, Files):
    student = Student(id, name, nationality, career, scholarship) # type: ignore
    with open(Files, 'wb') as file: # type: ignore
        pickle.dump(student, file)
        print(f"Student Save as {Files}") # type: ignore

    def LoadStudent(self,File):
        with open(File, 'rb') as file:
            student = pickle.load(file)
            return student
        