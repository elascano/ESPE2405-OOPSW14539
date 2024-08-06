import tkinter as tk
from tkinter import messagebox
from ec.edu.espe.login.model.User import DataManager

class LoginApp:
    def __init__(self, root):
        self.root = root
        self.root.title('Inicio de Sesión')

        
        self.frame = tk.Frame(root, padx=20, pady=20)
        self.frame.pack(padx=10, pady=10, fill=tk.BOTH, expand=True)

        #
        self.data_manager = DataManager()

        
        self.label_username = tk.Label(self.frame, text='Nombre de Usuario:')
        self.label_username.grid(row=0, column=0, sticky=tk.W, pady=5)
        self.entry_username = tk.Entry(self.frame, width=30)
        self.entry_username.grid(row=0, column=1, pady=5)

        self.label_password = tk.Label(self.frame, text='Contraseña:')
        self.label_password.grid(row=1, column=0, sticky=tk.W, pady=5)
        self.entry_password = tk.Entry(self.frame, show='*', width=30)
        self.entry_password.grid(row=1, column=1, pady=5)

        self.register_button = tk.Button(self.frame, text='Registrar', command=self.registrar_usuario)
        self.register_button.grid(row=2, column=0, pady=10)

        self.login_button = tk.Button(self.frame, text='Iniciar Sesión', command=self.iniciar_sesion)
        self.login_button.grid(row=2, column=1, pady=10)

    def registrar_usuario(self):
        username = self.entry_username.get()
        password = self.entry_password.get()

        if username and password:
            result = self.data_manager.registrar_usuario(username, password)
            if result:
                messagebox.showinfo('Éxito', 'Usuario registrado exitosamente.')
                self.entry_username.delete(0, tk.END)
                self.entry_password.delete(0, tk.END)
            else:
                messagebox.showwarning('Error', 'El usuario ya existe.')
        else:
            messagebox.showwarning('Advertencia', 'Por favor, llena todos los campos.')

    def iniciar_sesion(self):
        username = self.entry_username.get()
        password = self.entry_password.get()

        if username and password:
            result = self.data_manager.autenticar_usuario(username, password)
            if result:
                messagebox.showinfo('Éxito', 'Inicio de sesión exitoso.')
                # Aquí podrías abrir la ventana principal de la aplicación
            else:
                messagebox.showwarning('Error', 'Credenciales incorrectas.')
        else:
            messagebox.showwarning('Advertencia', 'Por favor, llena todos los campos.')

if __name__ == '__main__':
    import tkinter as tk
    root = tk.Tk()
    app = LoginApp(root)
    root.mainloop()
