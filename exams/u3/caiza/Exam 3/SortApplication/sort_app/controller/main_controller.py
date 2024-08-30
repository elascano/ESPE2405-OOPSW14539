from tkinter import messagebox
from sort_app.model.db_manager import DBManager
from sort_app.model.sorting_context import SortingContext
from sort_app.view.main_view import MainView


class MainController:
    def __init__(self):
        self.context = SortingContext()
        self.db_manager = DBManager()
        self.view = MainView(self)

    def start_app(self):
        self.view.mainloop()

    def on_sort_button_click(self, data_str):
        try:
            data = list(map(int, data_str.split(",")))
            size = len(data)

            algorithm = self.context.select_strategy(size)
            sorted_data = self.context.sort_array(data)

            self.db_manager.save_sorting_result(data, size, algorithm, sorted_data)
            messagebox.showinfo("Sorting Result", f"Unsorted: {data}\nSize: {size}\n"
                                                  f"Algorithm: {algorithm}\nSorted: {sorted_data}")
        except ValueError:
            messagebox.showerror("Input Error", "Please enter a valid comma-separated list of integers.")
        except Exception as e:
            messagebox.showerror("Error", str(e))
    