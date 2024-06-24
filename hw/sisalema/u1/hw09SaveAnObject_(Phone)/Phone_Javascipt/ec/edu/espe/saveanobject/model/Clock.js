export class Clock {
    constructor(id, clockType, brand, model, displayType) {
        this.id = id;
        this.clockType = clockType;
        this.brand = brand;
        this.model = model;
        this.displayType = displayType;
    }

    toString() {
        return `Clock{id=${this.id}, clockType=${this.clockType}, brand=${this.brand}, model=${this.model}, displayType=${this.displayType}}`;
    }

    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getClockType() {
        return this.clockType;
    }

    setClockType(clockType) {
        this.clockType = clockType;
    }

    getBrand() {
        return this.brand;
    }

    setBrand(brand) {
        this.brand = brand;
    }

    getModel() {
        return this.model;
    }

    setModel(model) {
        this.model = model;
    }

    getDisplayType() {
        return this.displayType;
    }

    setDisplayType(displayType) {
        this.displayType = displayType;
    }
    serialize() {
        return `ID: ${this.id}, Type: ${this.clockType}, Brand: ${this.brand}, Model: ${this.model}, Display: ${this.displayType}`;
    }

    static deserialize(clockString) {
        const clockData = clockString.split(', ').map(property => property.split(': ')[1]);
        return new Clock(clockData[0], clockData[1], clockData[2], clockData[3], clockData[4]);
    }
}
