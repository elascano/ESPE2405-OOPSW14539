const BubbleSort = require('./BubbleSort');
const InsertionSort = require('./InsertionSort');
const QuickSort = require('./QuickSort');

class SortingContext {
    constructor() {
        this.sortingStrategy = null;
    }

    sort(data) {
        const size = data.length;
        this.sortingStrategy = this.setSortStrategy(size);
        return this.sortingStrategy.sort(data);
    }

    setSortStrategy(n) {
        if (n > 0 && n < 30) {
            this.sortingStrategy = new BubbleSort();
        } else if (n >= 30 && n < 100) {
            this.sortingStrategy = new InsertionSort();
        } else if (n >= 100) {
            this.sortingStrategy = new QuickSort();
        }
        return this.sortingStrategy;
    }
}

module.exports = SortingContext;
