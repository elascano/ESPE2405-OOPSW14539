

from controller.MongoDB_Manager import MongoDB_Manager
from model.Student import Student

def main():
    # Lógica principal para interactuar con MongoDB
    student = Student("John Doe", 25)
    manager = MongoDB_Manager()
    manager.save_student(student)
    print("Estudiante guardado exitosamente en MongoDB.")

if __name__ == "__main__":
    main()
