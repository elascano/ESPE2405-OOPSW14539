import tkinter as tk
from ec.edu.espe.login.view.Login_Interface import LoginApp

def start_login_app():
    login_window = tk.Tk()
    login_app = LoginApp(login_window)
    login_window.mainloop()

if __name__ == '__main__':
    start_login_app()

