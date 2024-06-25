
export class Truck {
    constructor(id, brand, model, cargoCapacity) {
        this._id = id;
        this._brand = brand;
        this._model = model;
        this._cargoCapacity = cargoCapacity;
    }

    toString() {
        return `Truck{id='${this._id}', brand='${this._brand}', model='${this._model}', cargoCapacity=${this._cargoCapacity}}`;
    }

    get id() {
        return this._id;
    }

    set id(value) {
        this._id = value;
    }

    get brand() {
        return this._brand;
    }

    set brand(value) {
        this._brand = value;
    }

    get model() {
        return this._model;
    }

    set model(value) {
        this._model = value;
    }

    get cargoCapacity() {
        return this._cargoCapacity;
    }

    set cargoCapacity(value) {
        this._cargoCapacity = value;
    }
}