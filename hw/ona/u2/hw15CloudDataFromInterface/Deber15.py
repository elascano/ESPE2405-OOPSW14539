import tkinter as tk
from tkinter import ttk
from tkinter import messagebox
import pymongo
import uuid
from datetime import datetime

# Configuración de MongoDB
client = pymongo.MongoClient("mongodb://localhost:27017/")
db = client["DatosDB"]
collection = db["estudiantes"]

def generar_id():
    return str(uuid.uuid4())

def calcular_edad(fecha_nacimiento):
    hoy = datetime.today()
    fecha_nac = datetime.strptime(fecha_nacimiento, "%d/%m/%Y")
    edad = hoy.year - fecha_nac.year - ((hoy.month, hoy.day) < (fecha_nac.month, fecha_nac.day))
    return edad

def guardar_en_mongodb():
    id_estudiante = generar_id()
    nombre = nombre_entry.get()
    opcion = combobox.get()
    descripcion = descripcion_entry.get()
    fecha_nacimiento = fecha_nacimiento_entry.get()

    if nombre and opcion and descripcion and fecha_nacimiento:
        try:
            edad = calcular_edad(fecha_nacimiento)
            estudiante = {
                "id": id_estudiante,
                "nombre": nombre,
                "opcion": opcion,
                "descripcion": descripcion,
                "edad": edad
            }
            collection.insert_one(estudiante)
            resultado_label.config(text="Datos guardados en MongoDB")
        except ValueError:
            messagebox.showerror("Error", "Formato de fecha inválido. Use DD/MM/AAAA")
    else:
        resultado_label.config(text="Por favor, complete todos los campos")

# Configuración de la interfaz gráfica
ventana = tk.Tk()
ventana.title("Registro de Estudiantes")

tk.Label(ventana, text="Nombre del Estudiante:").grid(row=0, column=0, padx=10, pady=10)
nombre_entry = tk.Entry(ventana)
nombre_entry.grid(row=0, column=1, padx=10, pady=10)

tk.Label(ventana, text="Tipo de estudiante:").grid(row=1, column=0, padx=10, pady=10)
opciones = ["Seleccione una opción", "C", "D", "Z"]
combobox = ttk.Combobox(ventana, values=opciones, state="readonly")
combobox.grid(row=1, column=1, padx=10, pady=10)
combobox.current(0)

tk.Label(ventana, text="Descripción:").grid(row=2, column=0, padx=10, pady=10)
descripcion_entry = tk.Entry(ventana)
descripcion_entry.grid(row=2, column=1, padx=10, pady=10)

tk.Label(ventana, text="Fecha de Nacimiento (DD/MM/AAAA):").grid(row=3, column=0, padx=10, pady=10)
fecha_nacimiento_entry = tk.Entry(ventana)
fecha_nacimiento_entry.grid(row=3, column=1, padx=10, pady=10)

guardar_button = tk.Button(ventana, text="Guardar", command=guardar_en_mongodb)
guardar_button.grid(row=4, column=0, columnspan=2, pady=20)

resultado_label = tk.Label(ventana, text="")
resultado_label.grid(row=5, column=0, columnspan=2, pady=10)

ventana.mainloop()
