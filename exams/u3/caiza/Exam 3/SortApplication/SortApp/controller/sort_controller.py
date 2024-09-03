from SortApp.controller.mongo_database import SortModel
from SortApp.model.sorting_strategy import BubbleSort, InsertionSort, QuickSort

class SortController:
    def __init__(self, view):
        self.view = view
        self.view.set_controller(self)
        self.model = SortModel()

    def sort_input(self, input_text):
        try:
            array = list(map(int, input_text.split(',')))
        except ValueError:
            self.view.show_error("Please enter valid integers.")
            return

        if len(array) <= 1:
            self.view.show_error("Array must have more than one element.")
            return

        if 2 <= len(array) <= 5:
            strategy = BubbleSort()
        elif 6 <= len(array) <= 10:
            strategy = InsertionSort()
        else:
            strategy = QuickSort()

        sorted_array = strategy.sort(array)
        unsorted_array = ','.join(map(str, array))
        sorted_array_str = ','.join(map(str, sorted_array))
        algorithm = strategy.__class__.__name__

        result_message = (
            f"Unsorted: {unsorted_array}\n"
            f"Size: {len(array)}\n"
            f"Algorithm: {algorithm}\n"
            f"Sorted: {sorted_array_str}"
        )
        self.view.show_message(result_message)

        self.model.save_to_database(unsorted_array, len(array), algorithm, sorted_array_str)