from typing import List
from sort_app.model.sorting_strategy import SortingStrategy

class InsertionSort(SortingStrategy):
    def sort(self, data: List[int]) -> List[int]:
        sorted_list = data[:]
        for i in range(1, len(sorted_list)):
            key = sorted_list[i]
            j = i - 1
            while j >= 0 and key < sorted_list[j]:
                sorted_list[j + 1] = sorted_list[j]
                j -= 1
            sorted_list[j + 1] = key
        return sorted_list