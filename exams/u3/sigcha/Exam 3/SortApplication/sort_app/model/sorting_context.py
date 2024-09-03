from typing import List
from sort_app.model.bubble_sort import BubbleSort
from sort_app.model.insertion_sort import InsertionSort
from sort_app.model.quick_sort import QuickSort
from sort_app.model.sorting_strategy import SortingStrategy

class SortingContext:
    def __init__(self):
        self._strategy: SortingStrategy = None

    def set_sort_strategy(self, strategy: SortingStrategy):
        self._strategy = strategy

    def sort_array(self, data: List[int]) -> List[int]:
        if not self._strategy:
            raise ValueError("Sorting strategy is not set.")
        return self._strategy.sort(data)

    def select_strategy(self, size: int) -> str:
        if size > 1 and size <= 5:
            self.set_sort_strategy(BubbleSort())
            return "BubbleSort"
        elif size > 5 and size <= 10:
            self.set_sort_strategy(InsertionSort())
            return "InsertionSort"
        elif size > 10:
            self.set_sort_strategy(QuickSort())
            return "QuickSort"
        else:
            raise ValueError("Array size must be greater than 1.")