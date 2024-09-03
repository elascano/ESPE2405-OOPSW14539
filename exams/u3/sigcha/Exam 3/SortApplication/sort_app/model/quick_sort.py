from typing import List
from sort_app.model.sorting_strategy import SortingStrategy

class QuickSort(SortingStrategy):
    def sort(self, data: List[int]) -> List[int]:
        sorted_list = data[:]
        self._quick_sort(sorted_list, 0, len(sorted_list) - 1)
        return sorted_list

    def _quick_sort(self, array: List[int], low: int, high: int):
        if low < high:
            pi = self._partition(array, low, high)
            self._quick_sort(array, low, pi - 1)
            self._quick_sort(array, pi + 1, high)

    def _partition(self, array: List[int], low: int, high: int) -> int:
        pivot = array[high]
        i = low - 1
        for j in range(low, high):
            if array[j] < pivot:
                i += 1
                array[i], array[j] = array[j], array[i]
        array[i + 1], array[high] = array[high], array[i + 1]
        return i + 1