class store {
    constructor(id, name, location, revenue, numberOfEmployees, storeType) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.revenue = revenue;
        this.numberOfEmployees = numberOfEmployees;
        this.storeType = storeType;
    }

    isProfitable() {
        return this.revenue > 100;
    }
}

module.exports = store;
