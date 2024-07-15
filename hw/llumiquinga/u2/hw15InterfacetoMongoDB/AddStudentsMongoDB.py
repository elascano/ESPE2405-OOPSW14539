import tkinter as tk
from tkinter import messagebox, ttk
from pymongo import MongoClient

# Conexión a MongoDB
client = MongoClient("mongodb+srv://JersonLlM:jersonllm23@cluster0.yjwpgvg.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
db = client["students"]
collection = db["addstudents"]

# Función para manejar el evento de agregar estudiante
def add_student():
    name_student = entry_name_student.get()
    lastname_student = entry_lastname_student.get()
    bornOnDate = entry_bornOnDate.get()
    id_student = entry_id.get()
    email = entry_email.get()
    gender = combo_gender.get()
    course = entry_course.get()
    grade = entry_grade.get()

    
    if name_student and lastname_student and id_student and gender and bornOnDate and grade and course and email:
        student_data = {
            "name": name_student,
            "lastname": lastname_student,
            "bornOnDate": bornOnDate,
            "id": id_student,
            "email": email,
            "gender": gender,
            "course": course,
            "grade": float(grade),
        }
        
        collection.insert_one(student_data)
        
        message = f"Student {name_student, lastname_student} (ID: {id_student}) has been added.\n Born on Date: {bornOnDate}, Email: {email}, Gender: {gender}, Course: {course}, Grade: {grade}"
        messagebox.showinfo("Information", message)
        clean_fields()
    else:
        messagebox.showwarning("Warning", "All fields are required.")

# Función para limpiar los campos después de agregar un estudiante
def clean_fields():
    entry_name_student.delete(0, tk.END)
    entry_lastname_student.delete(0, tk.END)
    entry_bornOnDate.delete(0, tk.END)
    entry_id.delete(0, tk.END)
    entry_email.delete(0, tk.END)
    combo_gender.set('Choose a gender')
    entry_course.delete(0, tk.END)
    entry_grade.delete(0, tk.END)


# Crear la ventana principal
root = tk.Tk()
root.title("Student Registration System")

# Crear y organizar los widgets
frame = tk.Frame(root)
frame.pack(pady=10, padx=10)

label_name_student = tk.Label(frame, text="Student name")
label_name_student.grid(row=0, column=0, padx=5, pady=5)
entry_name_student = tk.Entry(frame)
entry_name_student.grid(row=0, column=1, padx=5, pady=5)

label_lastname_student = tk.Label(frame, text="Student last Name")
label_lastname_student.grid(row=1, column=0, padx=5, pady=5)
entry_lastname_student = tk.Entry(frame)
entry_lastname_student.grid(row=1, column=1, padx=5, pady=5)

label_bornOnDate = tk.Label(frame, text="Born on Date")
label_bornOnDate.grid(row=2, column=0, padx=5, pady=5)
entry_bornOnDate = tk.Entry(frame)
entry_bornOnDate.grid(row=2, column=1, padx=5, pady=5)

label_id = tk.Label(frame, text="Student ID")
label_id.grid(row=3, column=0, padx=5, pady=5)
entry_id = tk.Entry(frame)
entry_id.grid(row=3, column=1, padx=5, pady=5)


label_email = tk.Label(frame, text="E-mail")
label_email.grid(row=4, column=0, padx=5, pady=5)
entry_email = tk.Entry(frame)
entry_email.grid(row=4, column=1, padx=5, pady=5)

label_gender = tk.Label(frame, text="Gender")
label_gender.grid(row=5, column=0, padx=5, pady=5)
combo_gender = ttk.Combobox(frame, values=["Male", "Female", "Other"])
combo_gender.grid(row=5, column=1, padx=5, pady=5)

label_course = tk.Label(frame, text="Course")
label_course.grid(row=6, column=0, padx=5, pady=5)
entry_course = tk.Entry(frame)
entry_course.grid(row=6, column=1, padx=5, pady=5)

label_grade = tk.Label(frame, text="Grade")
label_grade.grid(row=7, column=0, padx=5, pady=5)
entry_grade = tk.Entry(frame)
entry_grade.grid(row=7, column=1, padx=5, pady=5)

button_add = tk.Button(frame, text="Add Student", command=add_student)
button_add.grid(row=8, columnspan=2, pady=10)

# Iniciar el bucle principal de la interfaz gráfica
root.mainloop()
