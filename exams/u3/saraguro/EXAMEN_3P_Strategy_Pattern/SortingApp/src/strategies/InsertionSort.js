class InsertionSort {
    sort(array) {
        let len = array.length;
        for (let i = 1; i < len; i++) {
            let key = array[i];
            let j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }
}

module.exports = InsertionSort;
