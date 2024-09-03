class SortingContext {
    constructor(strategy) {
        this.strategy = strategy;
    }

    setSortStrategy(strategy) {
        this.strategy = strategy;
    }

    sort(array) {
        return this.strategy.sort(array);
    }
}

module.exports = SortingContext;
