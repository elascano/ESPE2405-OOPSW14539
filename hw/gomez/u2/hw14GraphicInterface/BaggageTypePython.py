import tkinter as tk
from tkinter import ttk

def create_gui():
    # Crear la ventana principal
    root = tk.Tk()
    root.title("Baggage Type Description")

    # Configurar la geometría de la ventana
    root.geometry("400x300")

    # Crear y colocar los widgets
    # Etiqueta y área de texto para Baggage Type Description
    tk.Label(root, text="Baggage Type Description:").grid(row=0, column=0, padx=10, pady=10, sticky="w")
    description_text = tk.Text(root, height=3, width=30)
    description_text.grid(row=0, column=1, padx=10, pady=10)

    # Etiqueta y Combo Box para Type
    tk.Label(root, text="Type:").grid(row=1, column=0, padx=10, pady=10, sticky="w")
    type_combobox = ttk.Combobox(root, values=["CARRY ON", "CHECKED"])
    type_combobox.grid(row=1, column=1, padx=10, pady=10)
    type_combobox.current(0)  # Selecciona el primer elemento por defecto

    # Etiqueta y Caja de texto para Weight
    tk.Label(root, text="Weight:").grid(row=2, column=0, padx=10, pady=10, sticky="w")
    weight_entry = tk.Entry(root)
    weight_entry.grid(row=2, column=1, padx=10, pady=10)

    # Ejecutar la ventana principal
    root.mainloop()

create_gui()
