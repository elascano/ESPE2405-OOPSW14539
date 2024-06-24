const fs = require('fs');

class Pencil {
    constructor(id, brand, color, length) {
        this.id = id;
        this._brand = brand;
        this._color = color;
        this._length = length;
    }

    get brand() {
        return this._brand;
    }

    get color() {
        return this._color;
    }

    get length() {
        return this._length;
    }

    set brand(newBrand) {
        this._brand = newBrand;
    }

    set color(newColor) {
        this._color = newColor;
    }

    set length(newLength) {
        this._length = newLength;
    }
}

class ReadPencil {
    static read(filename) {
        try {
            const jsonString = fs.readFileSync(filename, 'utf8'); // Read JSON data from file
            const pencilData = JSON.parse(jsonString);
            return new Pencil(pencilData.id, pencilData._brand, pencilData._color, pencilData._length);
        } catch (error) {
            throw new Error(`Error reading ${filename}: ${error.message}`);
        }
    }
}

class SavePencil {
    static save(pencil, filename) {
        if (!(pencil instanceof Pencil)) {
            throw new Error("The object to save is not a Pencil instance.");
        }
        const json = JSON.stringify(pencil);
        fs.writeFileSync(filename, json); 
        console.log(`Pencil saved to ${filename}`);
    }
}

const myPencils = [
    new Pencil(1, 'Faber Castell', 'Black', 5),
    new Pencil(2, 'Traditional', 'Yellow', 7.5)
];
const filename = 'pencil.json';

SavePencil.save(myPencils, filename);

const readPencils = ReadPencil.read(filename);

console.log("Read Pencils:", readPencils);