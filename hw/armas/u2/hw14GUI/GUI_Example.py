import tkinter as tk
from tkinter import messagebox

# Función para manejar el evento de agregar estudiante
def add_student():
    name_student = entry_name_student.get()
    id_student = entry_id.get()
    grade = entry_grade.get()
    course = entry_course.get()
    
    if name_student and id_student and grade and course:
        message = f"Student {name_student} (ID: {id_student}) has been added.\nCourse: {course}, Grade: {grade}"
        messagebox.showinfo("Information", message)
        clean_fields()
    else:
        messagebox.showwarning("Warning", "All fields are required.")

# Función para limpiar los campos después de agregar un estudiante
def clean_fields():
    entry_name_student.delete(0, tk.END)
    entry_id.delete(0, tk.END)
    entry_grade.delete(0, tk.END)
    entry_course.delete(0, tk.END)

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

label_id = tk.Label(frame, text="Student ID")
label_id.grid(row=1, column=0, padx=5, pady=5)
entry_id = tk.Entry(frame)
entry_id.grid(row=1, column=1, padx=5, pady=5)

label_grade = tk.Label(frame, text="Grade")
label_grade.grid(row=2, column=0, padx=5, pady=5)
entry_grade = tk.Entry(frame)
entry_grade.grid(row=2, column=1, padx=5, pady=5)

label_course = tk.Label(frame, text="Course")
label_course.grid(row=3, column=0, padx=5, pady=5)
entry_course = tk.Entry(frame)
entry_course.grid(row=3, column=1, padx=5, pady=5)

button_add = tk.Button(frame, text="Add Student", command=add_student)
button_add.grid(row=4, columnspan=2, pady=10)

# Iniciar el bucle principal de la interfaz gráfica
root.mainloop()
