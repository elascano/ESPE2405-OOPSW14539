from utils.FileManager import StudentGestor
def main():
    manager = StudentGestor()
    
    id=1753289048
    name ="Miguel"
    nationality="Ecuatorian"
    career="Software Engineer"
    scholarship="yes"
    files='Students.pkl'

    manager.SaveStudent(id,name,nationality,career,scholarship,files)

    loadStudent = manager.LoadStudent(files)
    print("\n Student uploaded from file")
    print(loadStudent)

