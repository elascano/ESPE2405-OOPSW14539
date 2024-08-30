from model.bubble_sort import BubbleSort
from model.insertion_sort import InsertionSort
from model.quick_sort import QuickSort
from model.mongodb import Database

class SortingContext:
    def __init__(self):
        self.strategy = None
        self.database = Database()

    def set_sort_strategy(self, data):
        size = len(data)
        if size < 2:
            raise ValueError("Array must have more than 1 element")
        elif 2 <= size <= 5:
            self.strategy = BubbleSort()
        elif 6 <= size <= 10:
            self.strategy = InsertionSort()
        else:
            self.strategy = QuickSort()

    def sort(self, data):
        self.set_sort_strategy(data)
        sorted_data = self.strategy.sort(data.copy())
        record = {
            "unsorted": ",".join(map(str, data)),
            "size": len(data),
            "sort algorithm": self.strategy.__class__.__name__,
            "sorted": ",".join(map(str, sorted_data))
        }
        self.database.save_record(record)
        return sorted_data, self.strategy.__class__.__name__
