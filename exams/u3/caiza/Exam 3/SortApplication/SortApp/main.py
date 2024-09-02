from SortApp.controller.sort_controller import SortController
from SortApp.view.sort_view import SortView
import tkinter as tk

if __name__ == "__main__":
    root = tk.Tk()
    view = SortView(root)
    controller = SortController(view)
    root.mainloop()