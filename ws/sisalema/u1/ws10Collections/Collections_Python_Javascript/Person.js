<<<<<<< HEAD
export class Person {
    constructor(id, name) {
        this._id = id;
        this._name = name;
    }

    get id() {
        return this._id;
    }

    set id(id) {
        this._id = id;
    }

    get name() {
        return this._name;
    }

    set name(name) {
        this._name = name;
    }

    toString() {
        return `Person{id: ${this._id}, name: '${this._name}'}`;
    }
=======
export class Person {
    constructor(id, name) {
        this._id = id;
        this._name = name;
    }

    get id() {
        return this._id;
    }

    set id(id) {
        this._id = id;
    }

    get name() {
        return this._name;
    }

    set name(name) {
        this._name = name;
    }

    toString() {
        return `Person{id: ${this._id}, name: '${this._name}'}`;
    }
>>>>>>> 8e40484f0077d7fe10786aa1aa0f3cc51debe068
}