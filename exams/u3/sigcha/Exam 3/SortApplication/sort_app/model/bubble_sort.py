from typing import List
from sort_app.model.sorting_strategy import SortingStrategy

class BubbleSort(SortingStrategy):
    def sort(self, data: List[int]) -> List[int]:
        sorted_list = data[:]
        n = len(sorted_list)
        for i in range(n):
            for j in range(0, n-i-1):
                if sorted_list[j] > sorted_list[j+1]:
                    sorted_list[j], sorted_list[j+1] = sorted_list[j+1], sorted_list[j]
        return sorted_list