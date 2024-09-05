class BubbleSort {
    sort(array) {
        let len = array.length;
        for (let i = 0; i < len; i++) {
            for (let j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    let temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}

module.exports = BubbleSort;
