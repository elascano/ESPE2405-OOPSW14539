const SortingStrategy = require('./SortingStrategy');

class BubbleSort extends SortingStrategy {
    sort(data) {
        console.log("Bubble sort");
        let n = data.length;
        for (let i = 0; i < n - 1; i++) {
            for (let j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    [data[j], data[j + 1]] = [data[j + 1], data[j]];
                }
            }
        }
        return data;
    }
}

module.exports = BubbleSort;
