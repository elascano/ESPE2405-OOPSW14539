import tkinter as tk
from tkinter import messagebox

# Crear la ventana principal
root = tk.Tk()
root.title("Menú Principal")

# Definir las funciones para cada opción del menú
def mostrar_productos():
    messagebox.showinfo("Productos", "Aquí se mostrarán los productos.")

def mostrar_proveedores():
    messagebox.showinfo("Proveedores", "Aquí se mostrarán los proveedores.")

def mostrar_stock():
    messagebox.showinfo("Stock", "Aquí se mostrará el stock.")

def ver_pagos():
    messagebox.showinfo("Ver Pagos", "Aquí se podrán ver los pagos.")

def hacer_pagos():
    messagebox.showinfo("Hacer Pagos", "Aquí se podrán hacer los pagos.")

# Crear los botones
button_productos = tk.Button(root, text="Productos", command=mostrar_productos, width=20, height=2)
button_productos.pack(pady=5)

button_proveedores = tk.Button(root, text="Proveedores", command=mostrar_proveedores, width=20, height=2)
button_proveedores.pack(pady=5)

button_stock = tk.Button(root, text="Stock", command=mostrar_stock, width=20, height=2)
button_stock.pack(pady=5)

button_ver_pagos = tk.Button(root, text="Ver Pagos", command=ver_pagos, width=20, height=2)
button_ver_pagos.pack(pady=5)

button_hacer_pagos = tk.Button(root, text="Hacer Pagos", command=hacer_pagos, width=20, height=2)
button_hacer_pagos.pack(pady=5)

# Iniciar el bucle principal de la interfaz
root.mainloop()
