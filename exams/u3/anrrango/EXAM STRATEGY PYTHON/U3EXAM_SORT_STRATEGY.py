import tkinter as tk
from tkinter import messagebox
from pymongo import MongoClient
import random

class SortStrategy:
    def sort(self, array):
        raise NotImplementedError

class BubbleSort(SortStrategy):
    def sort(self, array):
        n = len(array)
        for i in range(n):
            for j in range(0, n-i-1):
                if array[j] > array[j+1]:
                    array[j], array[j+1] = array[j+1], array[j]
        return array

class InsertionSort(SortStrategy):
    def sort(self, array):
        for i in range(1, len(array)):
            key = array[i]
            j = i-1
            while j >= 0 and key < array[j]:
                array[j+1] = array[j]
                j -= 1
            array[j+1] = key
        return array

class QuickSort(SortStrategy):
    def sort(self, array):
        if len(array) <= 1:
            return array
        pivot = array[len(array) // 2]
        left = [x for x in array if x < pivot]
        middle = [x for x in array if x == pivot]
        right = [x for x in array if x > pivot]
        return self.sort(left) + middle + self.sort(right)

class SortContext:
    def __init__(self):
        self.strategy = None

    def set_strategy(self, strategy):
        self.strategy = strategy

    def sort_array(self, array):
        return self.strategy.sort(array)


class MongoDBHandler:
    def __init__(self):
        self.client = MongoClient('mongodb+srv://Mario-Anrrango:marioanrrango@cluster0.crwrurb.mongodb.net/')
        self.db = self.client['sorting_db']
        self.collection = self.db['sort_records']

    def save_record(self, unsorted, size, sort_algorithm, sorted_list):
        record = {
            "unsorted": unsorted,
            "size": size,
            "sort algorithm": sort_algorithm,
            "sorted": sorted_list
        }
        self.collection.insert_one(record)

class SortApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Sorting Algorithm Selector")

        self.label = tk.Label(root, text="Enter numbers separated by commas:")
        self.label.pack()

        self.entry = tk.Entry(root)
        self.entry.pack()

        self.sort_button = tk.Button(root, text="Sort", command=self.sort_numbers)
        self.sort_button.pack()

        self.mongo_handler = MongoDBHandler()

    def sort_numbers(self):
        input_text = self.entry.get()
        try:
            array = list(map(int, input_text.split(',')))
            if len(array) <= 1:
                raise ValueError("Array must have more than one element.")

            context = SortContext()
            size = len(array)

            if 2 <= size <= 5:
                context.set_strategy(BubbleSort())
                algorithm = "BubbleSort"
            elif 6 <= size <= 10:
                context.set_strategy(InsertionSort())
                algorithm = "InsertionSort"
            else:
                context.set_strategy(QuickSort())
                algorithm = "QuickSort"

            sorted_array = context.sort_array(array)
            sorted_list = ', '.join(map(str, sorted_array))

            messagebox.showinfo("Sorted Results", f"Unsorted: {input_text}\nSize: {size}\nAlgorithm: {algorithm}\nSorted: {sorted_list}")

            self.mongo_handler.save_record(input_text, size, algorithm, sorted_list)

        except ValueError as e:
            messagebox.showerror("Input Error", str(e))


if __name__ == "__main__":
    root = tk.Tk()
    app = SortApp(root)
    root.mainloop()