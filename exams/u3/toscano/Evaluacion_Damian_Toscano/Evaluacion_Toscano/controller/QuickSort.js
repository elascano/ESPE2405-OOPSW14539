const SortingStrategy = require('./SortingStrategy');

class QuickSort extends SortingStrategy {
    sort(data) {
        console.log("Quick sort");
        return this.quickSort(data, 0, data.length - 1);
    }

    quickSort(arr, low, high) {
        if (low < high) {
            let pi = this.partition(arr, low, high);
            this.quickSort(arr, low, pi - 1);
            this.quickSort(arr, pi + 1, high);
        }
        return arr;
    }

    partition(arr, low, high) {
        let pivot = arr[high];
        let i = (low - 1);
        for (let j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                [arr[i], arr[j]] = [arr[j], arr[i]];
            }
        }
        [arr[i + 1], arr[high]] = [arr[high], arr[i + 1]];
        return i + 1;
    }
}

module.exports = QuickSort;
